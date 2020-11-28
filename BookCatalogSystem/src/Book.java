
public class Book {

	private int id;
	private String name;
	private String author;
	private int yearPublished;
	private double price;
	private int copiesSold;
	private int category;
	
	
	public Book(int id, String name, String author, int yearPublished, double price, int copiesSold, int category) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.yearPublished = yearPublished;
		this.price = price;
		this.copiesSold = copiesSold;
		this.category = category;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getCopiesSold() {
		return copiesSold;
	}
	


	public int getCategory() {
		return category;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", yearPublished=" + yearPublished
				+ ", price=" + price + ", copiesSold=" + copiesSold + ", category=" + category + "]";
	}
	
	
	
	
	
}
