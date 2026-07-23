package bikeproject;

// JP 2-2 #4 create interface
public interface RoadParts {
    //constant declaration

    //JP 3-1 #3 commented out original terrain and replace with enum
    //public final String terrain = "track_racing";
    public final String terrain = BikeUses.track.toString();

    //required methods implementation
    public int getTyreWidth();
    public void setTyreWidth(int newValue);
    public int getPostHeight();
    public void setPostHeight(int newValue);

}//end interface RoadParts

