
public class Player {

	private int id;
	private String name;
	private int currentPosition;
	
	private static int i=1;
	
	public Player( String name) {
		super();
		this.id = getUniqueInd();
		this.name = name;
		this.currentPosition=0;
	}
	private int getUniqueInd() {
		
		return i++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
}
