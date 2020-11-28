
public class Task {

	
	private int id;
	private static int i =1;
	private  TaskType taskType;
	private TaskStatus taskStatus;
	private User user;

	public void setTaskStatus(TaskStatus taskStatus,User user) {
		if(this.user.getId()== user.getId())
		this.taskStatus = taskStatus;
		else
			System.out.println("You cannot chnage the statius of task not created by you");
		
	}

	
	public Task(TaskType taskType,User user) {
		super();
		this.id = getUniqueId();
		this.taskType = taskType;
		this.taskStatus = TaskStatus.OPEN;
		this.user = user;
	}

	private static int getUniqueId() {
		return i++;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskType=" + taskType + ", taskStatus=" + taskStatus + ", user=" + user.getId()
				+  "]";
	}

	
}
