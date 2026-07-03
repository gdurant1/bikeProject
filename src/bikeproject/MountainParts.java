package bikeproject;

// JP 2-2 #3 create interface
public interface MountainParts {
    //constant declaration
    public final String TERRAIN = "Off_Road";

    //required methods after implementation
    public String getSuspension();
    public void setSuspension(String newValue);
    public String getType();
    public void setType(String newValue);


}//end interface MountainParts
