import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		List<Room> roomsList =  new ArrayList<>();
		Room room1 = new Room("001");
		Room room2 = new Room("002");
		Room room3 = new Room("003");
		roomsList.add(room1);
		roomsList.add(room2);
		roomsList.add(room3);
		
		Scheduler scheduler =new Scheduler(roomsList);
		
		
		System.out.println(scheduler.book(1,2,5));	//001
		System.out.println(scheduler.book(1,5,8));	//001
		System.out.println(scheduler.book(1,9,10)) ;	//002
		System.out.println(scheduler.book(1,11,12)) ;	//003
		System.out.println(scheduler.book(1,7,8)) ;	//003
		System.out.println(scheduler.book(1,11,12)) ;	//001
		

	}

}
