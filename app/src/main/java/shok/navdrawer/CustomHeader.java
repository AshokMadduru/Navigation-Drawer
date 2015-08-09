package shok.navdrawer;

/**
 * Created by ASHOK on 8/9/2015.
 */
public class CustomHeader {
    String headerTitle;
    int imageResource;

    public CustomHeader(){
    }
    public CustomHeader(String headerTitle, int imageResource) {
        this.headerTitle = headerTitle;
        this.imageResource = imageResource;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
