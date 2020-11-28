
public class Main {

	public static void main(String[] args) {
		
		Driver driver = new Driver("driver1");
		Rider rider = new Rider("user1");
		
		rider.createRide(1, 10, 20, 2);
		rider.updateRide(1,10,30,3);
		System.out.println(rider.closeRide(1));		
		
		rider.createRide(2, 10, 20, 2);
		rider.withdrawRide(2);
		
		rider.closeRide(2);
		
		

		
	}

}
