package bikeproject;

// JP 2-2 #7 implement roadParts in roadBike
public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	private final String terrain;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
		this.terrain = RoadParts.terrain;
	}//end constructor
	
	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Road bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription

	//implement getters and setters
	@Override
	public int getTyreWidth(){ return this.tyreWidth; }
	@Override
	public void setTyreWidth(int newValue){ this.tyreWidth = newValue; }

	@Override
	public int getPostHeight(){ return this.postHeight; }
	@Override
	public void setPostHeight(int newValue){this.postHeight = newValue; }

}//end class RoadBike
