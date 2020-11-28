
public class Meeting {

	
	private int start;
	private int end;
	private Room room;
	public Meeting(int start, int end, Room room) {
		super();
		this.start = start;
		this.end = end;
		this.room = room;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
