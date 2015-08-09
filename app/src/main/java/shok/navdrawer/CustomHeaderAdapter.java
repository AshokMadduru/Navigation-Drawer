package shok.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASHOK on 8/9/2015.
 */
public class CustomHeaderAdapter extends ArrayAdapter<CustomHeader> {
    Context context;
    int resource;
    List<CustomHeader> list;
    public CustomHeaderAdapter(Context context,int resource,List<CustomHeader> list){
        super(context,resource,list);
        this.context=context;
        this.resource=resource;
        this.list=list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomHeader header=getItem(position);
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View view= inflater.inflate(resource,parent,false);
        ImageView image=(ImageView)view.findViewById(R.id.drawer_header_image);
        TextView title=(TextView)view.findViewById(R.id.drawer_header_text);
        title.setText(header.getHeaderTitle());
        image.setImageResource(header.getImageResource());
        return view;
    }
}
