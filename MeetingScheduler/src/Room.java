import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
private String name ;
private Map<Integer,ArrayList<Meeting>> calender ;




public Room(String name) {
	
	this.name = name;
	this.calender = new HashMap<>();
	for(int i=0;i<31;i++)
		calender.put(i,new ArrayList<Meeting>());
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}




public boolean book(int day,int start,int end) {
	

		
		for(Meeting m:  calender.get((Integer)day))
	
	{
		if(m.getStart() < end && start < m.getEnd())
			return false;
	}
		
	

	Meeting meeting= new Meeting(start, end, this);
	calender.get((Integer)day).add(meeting);

	return true;
}


}