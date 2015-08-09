package shok.navdrawer;

/**
 * Created by ASHOK on 8/9/2015.
 */
public class NavItem {
    String title;
    int resourceId;
    String headerTitle;
    int headerImageId;
    public NavItem(){
    }
    public NavItem(String title,int resourceId,String headerTitle,int headerImageId){
        this.title=title;
        this.resourceId=resourceId;
        this.headerTitle=headerTitle;
        this.headerImageId=headerImageId;
    }
    public NavItem(String headerTitle){
        this.headerTitle=headerTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public int getHeaderImageId() {
        return headerImageId;
    }

    public void setHeaderImageId(int headerImageId) {
        this.headerImageId = headerImageId;
    }
}
