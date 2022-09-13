package lab;

/*
 * Create a class so that when this code is ran,
 * you will get the following.
 * 
 * Stop #1
 *    358.4
 *    18.4
 *    19.5
 * 
 * Stop #2
 *    574.2
 *    30.9
 *    18.6
 * 
 * Trip: Maryland 2022
 *    Distance:  995.7
 *    Fuel Used: 55.2
 *    MPG:       18.0
 * 
 */



public class Trip {

	public static void main(String[] args) {
		
		/*
		 * Constructor assumes this is the start of a trip
		 * All variables should be initialized accordingly
		 */
		
		//creates first trip "trip"
		RoadTripLog trip = new RoadTripLog("Maryland 2022");
		
		//uses the addDistance method to add distance from parameters to distnace varibale (which is at 0 now)
		trip.addDistance(358.4);
		//uses add fuel method to add fuel to variable fuel.
		trip.addFuel(18.4);
		
		
		//prints stop number one, prints out the total distance traveled, total fuel used, and Miles per gallon.
		System.out.println("Stop #1");
		System.out.println("   " + trip.getTotalDistance());
		System.out.println("   " + trip.getTotalFuel());
		System.out.println("   "+Math.round(trip.getMPG() * Math.pow(10, 1)) / Math.pow(10, 1) + "\n"); //Rounded MPG
		
		
		//adds distance traveled from 2nd trip to distance variable (now at 358.4)
		trip.addDistance(215.8);
		//adds fuel used from 2nd trip to distance variable
		trip.addFuel(12.5);
		
		//prints all info, (distance traveled, fuel used, MPG used) 
		System.out.println("Stop #2");
		System.out.println("   " + trip.getTotalDistance());
		System.out.println("   " + trip.getTotalFuel());
		System.out.println("   "+Math.round(trip.getMPG() * Math.pow(10, 1)) / Math.pow(10, 1) + "\n"); //rounds MPG
		
		
		//adds 3rd travel to distance variable (now at 574.2 from last two trips)
		trip.addDistance(312.9);
		//adds continued travel fuel to fuel variable
		trip.addFuel(16.8);
		
		//adds 4th distance to distance vairable
		trip.addDistance(108.6);
		//adds 4th fuel used to fuel variable
		trip.addFuel(7.5);
		
		//prints out the total value of all the variables (fuel, distance, MPG) and prints as the total used for final trip
		System.out.println(trip);
		
	}
	
	
}
