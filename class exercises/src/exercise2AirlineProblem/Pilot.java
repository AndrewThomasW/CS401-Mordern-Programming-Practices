
package exercise2AirlineProblem;
import java.util.List;

public class Pilot {

	// fields
	List<Flight> flightList;

	// constructor
	public Pilot(List<Flight> flightList) {
			
			this.flightList = flightList;
		}

	// methods

	public List<Flight> getFlightList() {
		return flightList;
	}

	public String getRole() {
		return "Pilot";
	}

}
