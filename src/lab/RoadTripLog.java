package lab;

public class RoadTripLog {
	
	private Double distance; //tracks distance
	private Double fuel; //tracks fuel
	private Double MPG; //tracks miles per gallon
	private String name; //holds trips name

	
	
	public RoadTripLog(String name) {
		//restarts the distance and fuel variables
		distance = 0.0;
		fuel = 0.0;
		this.name = name; //makes name variable  equal to parameter
	}

	public void addDistance(double distance) {
		
		this.distance += distance; //adds Parameters distance to RoadTripLog's distance variable
		
	}

	public void addFuel(double fuel) {
	
		this.fuel += fuel; //adds parameter fuel to RoadTripLog's fuel varaible
		
	}

	public double getTotalDistance() {
		
		return distance; //returns distance variable
	}
	
	public double getTotalFuel() {
		
		return fuel; //returns fuel variable
	}
	

	//gets MPG
	public double getMPG() {
		
		this.MPG = distance/fuel; //Miles per gallon is distance divided by fuel
		return MPG ; //returns MPG
	}
	
	//override constructor, when "trip" is printed, this will print all final variable totals
	@Override
	public String toString() {
		return  "Trip: "+ name + "\n   Distance:  " + distance +
		    "\n   Fuel:      " + fuel   +
		    " \n   MPG:       " + Math.floor(MPG);
	}
}
