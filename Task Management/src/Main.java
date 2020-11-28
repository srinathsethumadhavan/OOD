import java.util.List;

public class Main {

	public static void main(String[] args){
		
		User user1 = new User(1);
		User user2 = new User(2);
		
	Task task1 = user1.createTask(TaskType.FEATURE);
	Task task2 = user2.createTask(TaskType.BUG);
	Task task3= user2.createTask(TaskType.BUG);


		Sprint sprint1 = user1.createSprint(22,33,"Sprint1");
		Sprint sprint2 = user2.createSprint(44,55,"Sprint2");

		 user1.changeStatus(task1, TaskStatus.IN_PROGRESS) ;//1

		 user1.addToSprint(sprint1, task1) ; //1
		  user2.addToSprint(sprint2, task2) ; //1
     	 user1.addToSprint(sprint2, task1) ; //0
		 user2.addToSprint(sprint1, task1) ; //0
	     user2.removeFromSprint(sprint2, task2); //1
	     user1.removeFromSprint(sprint2, task1); //0
		 user2.addToSprint(sprint2, task1) ; //0
	    user2.addToSprint(sprint2, task2) ; //1

		System.out.println(sprint1.toString());
		System.out.println("*******************************************");
		System.out.println(sprint2.toString());
		System.out.println("*******************************************");
		List<Task> taskList =sprint2.getTaskList();
		for(Task t :taskList)
			System.out.println(t);
		
		System.out.println("*******************************************");
		user1.printAllTasks();
		user2.printAllTasks();
	}
}
