import java.util.List;

public class Scheduler {

	private List<Room> rooms;

	public Scheduler(List<Room> rooms) {
		super();
		this.rooms = rooms;
	}
	

	public String book(int day, int start,int end) {
		for(Room room: rooms)
		{
			boolean flag = room.book(day, start, end);
			if(flag == true)
				return room.getName();
		}

		return "No rooms available";
		
		
	}
}
