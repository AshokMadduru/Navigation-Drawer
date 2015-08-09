package shok.navdrawer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASHOK on 8/9/2015.
 */
public class NavAdapter extends ArrayAdapter<NavItem> {
    Context context;
    int resource;
    List<NavItem> ojbects;
    LinearLayout headerLayout;
    LinearLayout listLayout;
    public NavAdapter(Context context,int resource,List<NavItem> objects){
        super(context,resource,objects);
        this.context=context;
        this.resource=resource;
        this.ojbects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NavItem item=getItem(position);
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(resource,parent,false);
        ImageView image=(ImageView)view.findViewById(R.id.drawer_list_icon);
        TextView text=(TextView)view.findViewById(R.id.drawer_list_text);
        ImageView headerImage=(ImageView)view.findViewById(R.id.drawer_header_image);
        TextView headerTitle=(TextView)view.findViewById(R.id.drawer_header_text);
        headerLayout=(LinearLayout)view.findViewById(R.id.header_layout);
        listLayout=(LinearLayout)view.findViewById(R.id.drawer_list_layout);


        if(item.getHeaderTitle()!=null){
            Log.d("header",item.getHeaderTitle());
            headerLayout.setVisibility(View.VISIBLE);
            listLayout.setVisibility(View.INVISIBLE);
            headerTitle.setText(item.getHeaderTitle());
            headerImage.setImageResource(item.getHeaderImageId());
        }else{
            headerLayout.setVisibility(View.INVISIBLE);
            listLayout.setVisibility(View.VISIBLE);
            image.setImageResource(item.getResourceId());
            text.setText(item.getTitle());
        }
        return view;
    }
}
