import java.util.ArrayList;
import java.util.List;

public class Rider extends Person {

	
	
	//private List<Ride> totalRides = new ArrayList<>();
	private Ride currentRide ; 
	public Rider(String name) {
		this.name= name;
	}
	
	public void createRide(int id,int source,int destination,int seats) {
		if (source >= destination)
		{
			System.out.println("Wrong values of Origin and Destination provided. Can't create ride\n");
			return;
		}
		currentRide= new Ride();
		
	currentRide.setId(id);
	currentRide.setSource(source);
	currentRide.setDestination(destination);
	currentRide.setSeats(seats);
	currentRide.setRideStatus(1);
		System.out.println("Ride successfullly created\n");
	
		
	}
	
	
public void updateRide(int id,int source,int destination,int seats) {
	if (currentRide.getRideStatus() == -1)
	{
		System.out.println( "Can't update ride. Ride was withdrawn\n");
		return;
	}
	if (currentRide.getRideStatus() == 2)
	{
		System.out.println( "Can't update ride. Ride already complete\n");
		return;
	}

	createRide(id, source, destination, seats);
	}


	public void withdrawRide(int id) {
		System.out.println(currentRide.getRideStatus());
	if (currentRide.getId() != id)
	{
		
		System.out.println( "Wrong ride Id as input. Can't withdraw current ride\n");
		
		return;
	}
	if (currentRide.getRideStatus() != 1)
	{
		System.out.println("Ride wasn't in progress. Can't withdraw ride\n");
		
		return;
	}

	currentRide.setRideStatus(-1);
}

public int  closeRide(int id) {
	
	if (currentRide.getId() != id)
	{
		
		System.out.println( "Wrong ride Id as input. Can't close current ride\n");
		
		return 0;
	}
	if (currentRide.getRideStatus() != 1)
	{
		System.out.println("Ride wasn't in progress. Can't close ride\n");
		return 0;
	}
	//totalRides.add(currentRide);
	currentRide.setRideStatus(2);
	//System.out.println(totalRides.size());
	//if(totalRides.size()>=10)
		
	//return currentRide.calculateFare(source,destination, true);
	//else
	
		return currentRide.calculateFare(currentRide.getSource(),currentRide.getDestination(), false);
}

	
	
	
}
