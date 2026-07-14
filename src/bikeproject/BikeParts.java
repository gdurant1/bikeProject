package bikeproject;

// JP 2-2 #2 create interface
public interface BikeParts {
    //constant declaration
    public final String MAKE = "Oracle Bikes";

    //required methods implementation
    public String getHandleBars();
    public void setHandleBars(String newValue);
    public String getTyres();
    public void setTyres(String newValue);
    public String getSeatType();
    public void setSeatType(String newValue);

}//end interface BikeParts

