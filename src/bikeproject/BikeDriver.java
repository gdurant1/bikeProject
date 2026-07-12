package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		// JP 2-3 #2 removed bike4
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		// JP 2-3 #2 removed bike4
	}//end method main

}//end class BikeDriver
