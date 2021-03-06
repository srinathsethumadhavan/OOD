import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		
		/*
		 * 1 fiction
		 * 2 science
		 * 3 mystery
		 * 4 fable
		 *5 mythology
		 */
		int id = 1;
		Book b1 = new Book(id++,"book1","author1",2000,400,100,1);
		Book b2 = new Book(id++,"book2","author2",2000,400,300,2);
		Book b3 = new Book(id++,"book3","author1",2000,400,500,3);
		Book b4 = new Book(id++,"book4","author1",2000,400,600,2);
		Book b5 = new Book(id++,"book5","author1",2000,400,800,4);
		Book b6 = new Book(id++,"book6","author2",2000,400,900,2);
		Book b7 = new Book(id++,"book7","author1",2000,400,1000,1);
		Book b8 = new Book(id++,"book8","author1",2000,400,1060,2);
		Book b9 = new Book(id++,"book9","author1",2000,400,160,2);
		Book b10 = new Book(id++,"book10","author3",1000,300,1360,5);
		Book b11 = new Book(id++,"book10","author4",1860,320,1750,2);
		List<Book> books= new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
		books.add(b8);
		books.add(b9);
		books.add(b10);
		
		Catalog catalog = new Catalog();
		catalog.addBooks(books);
		
		List<Book> allBooks =catalog.getBooks();
		for(Book b : allBooks)
			System.out.println(b.toString());
		
	System.out.println("*********************************************************************\n");
	
		Book b = catalog.getBookById(5);
		if(b!=null)
			System.out.println(b.toString());
		else
			System.out.println("no book found with the given name - ");
		
		
		System.out.println("***********************************************************************\n");
		
		
		 b = catalog.getBookByName("book9");
		if(b!=null)
			System.out.println(b.toString());
		else
			System.out.println("no book found with the given name - ");
	
		System.out.println("***********************************************************************\n");
				
	List<Book> bookListByAuthor= catalog.getBookByAuthor("author3");
		if(bookListByAuthor!=null)
		for(Book book : bookListByAuthor)
			System.out.println(book.toString());
		
		
System.out.println("***********************************************************************\n");
		
		List<Book> bookListByCategory= catalog.getBookByCategory(5);
		if(bookListByCategory!=null)
	for(Book book : bookListByCategory)
			System.out.println(book.toString());
	

		
		
		
		
		System.out.println("***********************************************************************\n");
	
		List<Book> bookMostSoldListByAuthor= catalog.getMostBookSoldByAuthor("author1",17);
		if(bookMostSoldListByAuthor!=null)
		for(Book book : bookMostSoldListByAuthor)
			System.out.println(book.toString());
		
		

		System.out.println("***********************************************************************\n");
	
		List<Book> bookMostSoldListByCategory= catalog.getMostBookSoldByCategory(2,5);
		if(bookMostSoldListByCategory!=null)
		for(Book book : bookMostSoldListByCategory)
			System.out.println(book.toString());
		
		
		
		
}

}