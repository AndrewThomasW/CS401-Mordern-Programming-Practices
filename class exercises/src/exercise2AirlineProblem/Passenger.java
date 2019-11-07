package exercise2AirlineProblem;

import java.util.List;

public class Passenger implements Role{
	
	//fields
	List<Flight> flightList;
	
	//constructor
	public Passenger(List<Flight> flightList) {
		
		this.flightList = flightList;
	}
	
	//methods
	
	public List<Flight> getFlightList() {
		return flightList;
	}

	public String getRole() {
		return "Passenger";
	}
}
