
public class Ride {

	private int id;
	private int source;
	private int destination;
	private int seats;
	static final int AMT_PER_KM = 10;
	private int rideStatus;
	/*
	 * -1 withdrwan
	 * 0- idle
	 * 1-created
	 * 2- closed
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSource() {
		return source;
	}
	public int getRideStatus() {
		return rideStatus;
	}
	public void setRideStatus(int rideStatus) {
		this.rideStatus = rideStatus;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seat) {
		this.seats = seat;
	}
	
	
	public int calculateFare(int source, int destination,boolean isPriorityRider) {
		int dist = destination - source;
		if(seats < 2)
		{
			return (int) (dist * AMT_PER_KM * (isPriorityRider?0.75:1));
		}

		return (int) (dist * seats * AMT_PER_KM * (isPriorityRider?0.5:0.75));
	}
}
