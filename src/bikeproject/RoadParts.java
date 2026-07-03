package bikeproject;

// JP 2-2 #4 create interface
public interface RoadParts {
    //constant declaration
    public final String terrain = "track_racing";

    //required methods after implementation
    public int getTyreWidth();
    public void setTyreWidth(int newValue);
    public int getPostHeight();
    public void setPostHeight(int newValue);

}//end interface RoadParts

