import java.util.ArrayList;
import java.util.List;

public class Sprint {
 
	private int begin;
	private int end;
	private String name;
	private User user;
	private List<Task> taskList;
		
	
	public Sprint(int begin, int end, String name,User user) {
		
		super();
		this.begin = begin;
		this.end = end;
		this.name = name;
		this.user  = user;
		taskList = new ArrayList<>();
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	
	public void addToSprint(Task task,User user){
		if(this.user.getId()==user.getId())
		this.taskList.add(task);
		else
			System.out.println("You cannot add tasks to the sprint  not created by you");
	}
	
	public void removeFromSprint(Task task,User user){
		if(this.user.getId()==user.getId())
		this.taskList.remove(task);
		else
			System.out.println("You cannot remove tasks from the sprint  not created by you");
	}
	
	
	@Override
	public String toString() {
		return "Sprint [begin=" + begin + ", end=" + end + ", name=" + name +"]";
	} 
	
	
	
	
	
	
	
	
}
