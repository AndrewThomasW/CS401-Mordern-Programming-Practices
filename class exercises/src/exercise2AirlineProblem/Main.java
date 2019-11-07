package exercise2AirlineProblem;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	
	static TriFunction<List<Person>,Integer,Integer,Double> calcTotalfare = (personList,minAge,maxAge) ->
	
	personList.parallelStream()
	.filter(p -> p.getAge() > minAge)
	.filter(p -> p.getAge() < maxAge)
	.flatMap(p -> p.getRoleList().stream())
	.filter(p -> p instanceof Passenger)
	.map(p -> (Passenger)p)
	.flatMap(p -> p.getFlightList().stream())
	.mapToDouble(p -> p.getFare())
	.sum();
	
	
	static BiFunction<List<Person>,Integer,List<Airline> > worstKAirlines = (personList,k) ->
			
	personList.stream()
			.flatMap(p -> p.getRoleList().stream())
			.filter(p -> p instanceof Passenger)
			.map(p -> (Passenger) p)
			.flatMap(p -> p.getFlightList().stream())
			.sorted( (f1,f2) -> f2.getTotalDelay() -f1.getTotalDelay())
			.map(f -> f.getAirline())
			.limit(k)
			.collect(Collectors.toList());
			
			
			


	
	
}
