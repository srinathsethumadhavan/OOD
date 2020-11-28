
public class Main {

	public static void main(String[] args) {
		
		
		Notepad notepad = new Notepad("At the starting of the week:At summit talks you'll hear them speak:It's only Monday");
		notepad.display();
	System.out.println("**************************** 0 ***********************************\n");
	System.out.println( "** Displaying content: only first two lines **\n");
	notepad.display(0,1);
	System.out.println("**************************** 1 ***********************************\n");
		System.out.println( "** Inserting yeah to the first line **\n");
		notepad.insert(2, ", Yeah");
		notepad.display();
		System.out.println("**************************** 2 ***********************************\n");
		System.out.println("** Undoing last move **\n");
		notepad.undo();
		notepad.display();
		System.out.println("****************************3 ***********************************\n");
		System.out.println( "** Redoing last move **\n");
		notepad.redo();
		notepad.display();
		System.out.println("**************************** 4 ***********************************\n");
		System.out.println("** Redoing last move **\n");
		notepad.redo();
		System.out.println("**************************** 5 ***********************************\n");
		System.out.println("** Deleting first line **\n");
		notepad.delete(1);
	   notepad.display();
		System.out.println("**************************** 6 ***********************************\n");
		System.out.println("** Undoing last move **\n");
		notepad.undo();
		notepad.display();
		System.out.println("**************************** 7 ***********************************\n");
		System.out.println( "** Undoing last move **\n");
		notepad.undo();
		notepad.display();
		System.out.println("**************************** 8 ***********************************\n");
		System.out.println( "** After deletion of lines 1 to 2 **\n");
		notepad.delete(1,2);
		notepad.display();
		System.out.println("**************************** 9 ***********************************\n");
		System.out.println( "** Undoing last move **\n");
		notepad.undo();
		notepad.display();
		System.out.println("**************************** 10 ***********************************\n");
		System.out.println( "** Copying lines 1 to 2 and pasting them on 3rd line **\n");
		notepad.copy(1,2);
		notepad.paste(2);
		notepad.display();
		System.out.println("**************************** 11 ***********************************\n");
		System.out.println("** Undoing last move **\n");
		notepad.undo();
		notepad.display();
		System.out.println("**************************** 12 ***********************************\n");
		System.out.println("Redoing last move*\n");
		notepad.redo();
		notepad.display();
	}

}
