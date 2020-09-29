package flight_demo;

import java.util.HashSet;
import java.util.Set;

public class FlightMain {

	public static void main(String[] args) {
		
		Set<Flight> flightList = new HashSet<>();
		flightList.add(new Flight(101,"AmAir",143.29, 1.3f));
		flightList.add(new Flight(991, "JetRed", 156.41, 4.3f));
		flightList.add(new Flight(992,"JetRed",241.95, 3.6f));
		flightList.add(new Flight(101,"AmAir",143.29, 1.3f));
		flightList.add(new Flight(991, "JetRed", 156.41, 4.3f));
		
		System.out.println("Printing all flights/s");
		printFlights(flightList);

	}
	
	public static void printFlights(Set<Flight> flightList){
		for(Flight f:flightList){
			System.out.println(f);
		}
	}

}
