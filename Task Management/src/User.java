import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private List<Task> taskList;
	private List<Sprint> sprintList;
	public int getId() {
		return id;
	}
	
	
	public User( int id) {
		super();
		taskList = new ArrayList<>();
		sprintList = new ArrayList<>();
		this.id = id;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	
	public List<Sprint> getSprintList() {
		return sprintList;
	}
	
	public Task createTask(TaskType taskType) {
		Task t = new Task(taskType,this);
		taskList.add(t);
		return t;
	}
	public Sprint createSprint(int i, int j, String name) {
		Sprint s = new Sprint(i,j,name,this);
		return s ;
		
	}
	public void changeStatus(Task task, TaskStatus taskStatus) {
		
		task.setTaskStatus(taskStatus,this);
		
	}
	public void addToSprint(Sprint sprint, Task task) {
		if(this.taskList.contains(task))
		sprint.addToSprint(task,this);
		else
			System.out.println("You cannot add tasks that is not created by you to the sprint");
		
		
	}
	public void removeFromSprint(Sprint sprint, Task task) {
		if(this.taskList.contains(task))
			{
			taskList.remove(task);
			sprint.removeFromSprint(task, this);
			}
		else
			System.out.println(" there is no such task in your taskList");
			
	}
	
	
	public void printAllTasks() {
		for(Task task :taskList)
			System.out.println(task);
		
	}
	
	
}
