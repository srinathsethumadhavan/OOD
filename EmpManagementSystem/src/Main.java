
public class Main {

	public static void main(String[] args) {
		Employee employee1= new Employee("Hector");
		Employee employee2= new Employee("Paris");
		Employee employee3= new Employee("Helen");
		Employee employee4= new Employee("AliBaba");
	
		
	Register register= new Register();
//		
		register.registerEmployee(employee1);
		register.registerEmployee(employee2);
		register.registerEmployee(employee3);
		register.registerEmployee(employee4);
		
//		
		register.registerManager(employee1.getEmployeeId(), employee4.getEmployeeId());
		register.registerManager(employee2.getEmployeeId(), employee3.getEmployeeId());
		register.registerManager(employee3.getEmployeeId(), employee4.getEmployeeId());
	    register.printEmployeeDetails(1);
		System.out.println("********************************************************************\n");

		register.printEmployeeDetails("A");

	System.out.println("********************************************************************\n");

	for(Employee e: register.getSubordinates(employee4.getName()))
		{
		System.out.println(e.getName() + " "+ e.getEmployeeId()	);
	}

		System.out.println("********************************************************************\n");

		for(Employee e: register.getSubordinates(employee3.getEmployeeId()))
		{
			System.out.println(e.getName() + " "+ e.getEmployeeId()	);
		}

		System.out.println("********************************************************************\n");

		
		

		for(Employee e: register.getSubordinates(employee4.getEmployeeId()))
		{
			System.out.println(e.getName() + " "+ e.getEmployeeId()	);
		}

}
}
