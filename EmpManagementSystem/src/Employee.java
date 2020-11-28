import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int EmployeeId;
	private String name;
	private int ManagerId;
	

	private static int index =0;


	private static int id=0;
	
	
	public Employee(String name) {
		super();
		this.name = name;
		this.EmployeeId= getUniqueId();
		this.ManagerId=0;
	
	}

	private int getUniqueId() {
		
		return index++;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getManagerId() {
		return ManagerId;
	}
	
	

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + 
	EmployeeId + 
	", name=" +
	name + 
	", ManagerId=" + 
	ManagerId  + 
	"]";			
	}

	public void setManagerId(int managerId) {
		this.ManagerId = managerId;
	}
	
}
