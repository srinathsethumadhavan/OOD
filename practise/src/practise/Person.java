package practise;

public class Person {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id)throws InvalidIdException{
		if(id<0)
			
				throw new InvalidIdException("id cannot be negative");

		else
			this.id = id;
	}
	public void setName(String name) {
		if(name==null)throw new IllegalArgumentException();
		this.name = name;
	}
	
}
