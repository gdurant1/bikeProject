package bikeproject;

// JP 2-2 #5 implement in bike class
// JP 203 #1 changed to abstract, cannot create bike object
public abstract class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String MAKE;
	
	public Bike(){	
		this.MAKE = BikeParts.MAKE;
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.MAKE = BikeParts.MAKE; //interface MAKE constant
	}//end constructor

	// JP 2-3 #3 changed printDescription to toString
	public String toString() {
		return "\n" + this.MAKE + "\n"
				+ "This bike has " + this.handleBars + " handlebars on a "
				+ this.frame + " frame with " + this.NumGears + " gears."
				+ "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.";
	}//end method printDescription

	//implementation bikeParts

	// get/set for handle bars
	@Override
	public String getHandleBars() { return this.handleBars; }
	@Override
	public void setHandleBars(String newValue){ this.handleBars = newValue; }

	// get/set for tyres
	@Override
	public String getTyres(){ return this.tyres; }
	@Override
	public void setTyres(String newValue){ this.tyres = newValue; }

	// get/set for seat type
	@Override
	public String getSeatType(){ return this.seatType; }
	@Override
	public void setSeatType(String newValue){ this.seatType = newValue; }

}//end class Bike
	
	

