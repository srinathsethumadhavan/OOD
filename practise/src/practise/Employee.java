package practise;

public final class  Employee implements Cloneable{

	private  final String name;
	private final  Address address;
	public Employee(String name, Address address) throws CloneNotSupportedException  {
		super();
		this.name = name;
		
		this.address =(Address) address.getClone();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address.toString() + "]";
	}
	public String getName() {
		return name;
	}
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) this.address.getClone();
	}
	
	
}
