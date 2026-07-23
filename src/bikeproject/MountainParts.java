package bikeproject;

// JP 2-2 #3 create interface
public interface MountainParts {
    //constant declaration
    // JP 3-1 #3 commented out original and replace with enum
    //public final String TERRAIN = "Off_Road";
    public final String TERRAIN = BikeUses.off_road.toString();

    //required methods implementation
    public String getSuspension();
    public void setSuspension(String newValue);
    public String getType();
    public void setType(String newValue);

}//end interface MountainParts
