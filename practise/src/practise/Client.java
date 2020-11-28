package practise;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException   {
		Address add = new Address("ganAAAdhi street","chennai","tamilnadu");
		Employee e1 = null;
		e1 = new Employee("ali",add);
		System.out.println(add);
		
System.out.println(e1);
System.out.println("******************************************************");
  add.setCity("kovai");
add.setState("kerlala");
add.setStreet("mandap street");
System.out.println("******************************************************");
e1.getAddress().setStreet("MODIFIED");
System.out.println(add);


System.out.println(e1.getAddress());

Address add2 = new Address("guntakak street","padi","odisha");
Employee e2 = new Employee("qqqqqali",add2);
System.out.println("******************************************************");
System.out.println(e2);
add2.setCity("kovai2");
add2.setState("kerlala2");
add2.setStreet("mandap street2");
System.out.println(add2);
	}

}
