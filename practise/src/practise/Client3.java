package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client3 {

	public static void main(String[] args)  {
		 Person p = new Person();
		 try{
			 p.setName(null);
			 p.setId(-45);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
		    ArrayList<String> unmodifiableList = (ArrayList<String>) Collections.unmodifiableList(list);
		    List<String> unmodifiableList3 =(ArrayList)unmodifiableList.clone();
		    String[] arr = new String[3];
		    List<String> unmodifiableList2 = Arrays.asList(arr);
		    //unmodifiableList2.add("asres");
		  //  unmodifiableList.add("four");
	}

}
