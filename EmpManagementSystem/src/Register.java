import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {

	
	private List<Employee> employees;
    private Map<Integer,List<Employee>> Managers;
    
       
	public Register() {
		super();
		employees = new ArrayList<>();
		Managers = new HashMap<>();
	}


	public List<Employee> getEmployees() {
		return employees;
	}

	
	
	public void registerEmployee(Employee employee)
	{
		employees.add(employee);
		Managers.put(employee.getEmployeeId(), new ArrayList<Employee>());
	}
	
	
	public void registerManager(int employeeId,int ManagerId) {
		
		Employee e = employees.get(employeeId);
		Managers.get(ManagerId).add(e);
		e.setManagerId(ManagerId);
	}
	
	public void printEmployeeDetails(int id) {
		
		Employee e = employees.get(id);
		if(e!=null)
				System.out.println(e.toString());
		else
			System.out.println("Employee not registered! Please provide correct Id and retry\n");
			
		}



	public void printEmployeeDetails(String string) {
		for(Employee e : employees) {
			if(e.getName().indexOf(string)==0)
				System.out.println(e.getName()+ " "+ e.getEmployeeId()+" "+ e.getManagerId());
		}
		
	}
	
	
	
	public List<Employee> getSubordinates(int empId)
	{
		
		
		if(empId>Managers.size())		
			System.out.println( "Employee not registered! Please provide correct Id and retry\n");
		return (Managers.get(empId));
			
		}

	
	public List<Employee> getSubordinates(String name)
	{
		
		
		for(Employee e : employees) {
			if(e.getName().equals(name))
				return  Managers.get(e.getEmployeeId());
		}		
		System.out.println( "Employee not registered! Please provide correct Id and retry\n");
			List<Employee> dummy = null;
			return dummy;
		}

	
	
	
	
}
