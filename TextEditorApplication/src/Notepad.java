import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Notepad {

	
	List<String> allContent;
	Stack<List<String>> undoStack;
	Stack<List<String>> redoStack;
	List<String> splittedText;
	List<String> buffer;
	
	public Notepad(String text) {
	
		allContent= new ArrayList<>();
		buffer= new ArrayList<>();
		 undoStack= new Stack<>();
		  redoStack= new Stack<>();
		  String[]  allContentArray = text.split(":");
		for(int i=0;i<allContentArray.length;i++)
		  allContent.add(allContentArray[i]);
		 
	}
	
	
	public void display() {
		for(String s: allContent)
			System.out.println(s+"\n");
	}
	
	
	public boolean display(int m,int n) {
		if(!checkRange(m,n))
			return false;
		
		
		for(int i=m;i<=n;i++)
		{
			System.out.println(allContent.get(i));
		}
		return true;
		
	}
	
	
	
	public boolean insert(int m,String text) {
		if(!checkIndex(m))
			return false;

		undoStack.push(new ArrayList<>(allContent));
		allContent.add(m,text);
		
		return true;
	}
	
	
public boolean delete(int m ) {
	if(!checkIndex(m))
		return false;
	undoStack.push(new ArrayList<>(allContent));
	allContent.remove(m);
	
	return true;
	}




	
	public boolean delete(int m , int n) {
		if(!checkRange(m,n))
			return false;
		
		undoStack.push(new ArrayList<>(allContent));
		for(int i=0;i<n-m+1;i++)
			allContent.remove(m);
		
		return true;
	}
	
	public boolean copy(int m,int n) {

		if(!checkRange(m,n))
			return false;
		
		for(int i=m;i<=n;i++)
		{
			buffer.add(allContent.get(i));
		}
		return true;
		
	}
	
	public boolean paste(int m) {
		
		if(!checkIndex(m))
			return false;
		undoStack.push(new ArrayList<>(allContent));
		for(int i=0;i<buffer.size();i++)
		allContent.add(buffer.get(i));
		return true;
		}
	
	
	public boolean undo() {
		if(undoStack.isEmpty())
		{
			System.out.println("Nothing to undo!\n");
			return false;
		}

		redoStack.push(new ArrayList<>(allContent));
		allContent = undoStack.pop();
	
		return true;
			}
	
	public boolean redo() {
		if(redoStack.isEmpty())
		{
			System.out.println("Nothing to redo!\n");
			return false;
		}
		undoStack.push(new ArrayList<>(allContent));
		allContent =redoStack.pop();
		

		return true;
	}
	
	
	public boolean checkRange(int m,int n) {
		if (m > allContent.size())
		{
			System.out.println("The value of n exceeds number of lines in the file\n");
			return false;
		}
		if (n > allContent.size())
		{
			System.out.println("The value of m exceeds number of lines in the file\n");
			return false;
		}
		if (m>n)
		{
			System.out.println("The value of n exceeds the value of m\n");
			return false;
		}
		
		return true;
	}
	
	
	public boolean checkIndex(int  m){
		if (m > allContent.size())
		{
			System.out.println("The value of m exceeds number of lines in the file\n");
			return false;
		}

		return true;
	}
}
