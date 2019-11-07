package exercise2AirlineProblem;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Flight {
	//fields
	double fare;
	Airline airline;
	LocalDateTime scheduledDepature;
	LocalDateTime actualDepature;
	LocalDateTime scheduledArrival;
	LocalDateTime actualArrival;
	
	//constructor
	public Flight(double fare, Airline airline, LocalDateTime scheduledDepature, LocalDateTime actualDepature,
			LocalDateTime scheduledArrival, LocalDateTime actualArrival) {
		
		this.fare = fare;
		this.airline = airline;
		this.scheduledDepature = scheduledDepature;
		this.actualDepature = actualDepature;
		this.scheduledArrival = scheduledArrival;
		this.actualArrival = actualArrival;
	}
	
	//methods

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public LocalDateTime getScheduledDepature() {
		return scheduledDepature;
	}

	public void setScheduledDepature(LocalDateTime scheduledDepature) {
		this.scheduledDepature = scheduledDepature;
	}

	public LocalDateTime getActualDepature() {
		return actualDepature;
	}

	public void setActualDepature(LocalDateTime actualDepature) {
		this.actualDepature = actualDepature;
	}

	public LocalDateTime getScheduledArrival() {
		return scheduledArrival;
	}

	public void setScheduledArrival(LocalDateTime scheduledArrival) {
		this.scheduledArrival = scheduledArrival;
	}

	public LocalDateTime getActualArrival() {
		return actualArrival;
	}

	public void setActualArrival(LocalDateTime actualArrival) {
		this.actualArrival = actualArrival;
	}
	
	public int getTotalDelay() {
		
		long diff1 = ChronoUnit.MILLIS.between(scheduledDepature, actualDepature);
		long diff2 = ChronoUnit.MILLIS.between(scheduledArrival, actualArrival);
		
		
		return (int) (diff1 + diff2);
	}
	
	
	
	
	

}
