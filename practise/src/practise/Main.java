package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {

	public static void main(String[] args) {
		
		
//		Runnable r1 = new Runnable(){
//			public void run(){
//				System.out.println("Hi");
//			}
//		};
//
//	
//	Thread t1 = new Thread(r1);
//	t1.start();
//	
//	
//	Runnable r2 = ()->{
//		System.out.println("By");
//	};
//	
//	Thread t2 = new Thread(r2);
//	t2.start();
	
	
	
//	List<Product> productsList = new ArrayList<Product>();  
//    //Adding Products  
//    productsList.add(new Product(1,"HP Laptop",25000f));  
//    productsList.add(new Product(2,"Dell Laptop",30000f));  
//    productsList.add(new Product(3,"Lenevo Laptop",28000f));  
//    productsList.add(new Product(4,"Sony Laptop",28000f));  
//    productsList.add(new Product(5,"Apple Laptop",90000f)); 
//    
//    List<Product> productsListPice = productsList
//    		.stream()
//    		.filter((p)-> p.price>30000)
//    		.map(p->p.price)
//    		.collect(Collectors.toList());
//	
//	float p  = Stream.iterate(-10, element->element+1)  
//     .filter(element->element%5==0)  
//     .reduce(0,(sum,element)-> sum+element);
//	System.out.println();
//      
    
	 
		
	//	A -cp "abc" 'a s d' mail.com  21

	int[] arr1 = {1,2,3};
	int [] arr2 = arr1;
	
	if(Arrays.equals(arr1, arr2))
			System.out.println("true");
	else
		System.out.println("false");
	}
	
	
	public static List<String>  helper(String s){
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<s.length();i++){
			
		}
		return list;
	}
	
	




	
	
}
