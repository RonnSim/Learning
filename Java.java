public class Hello { 
  // creates a class called 'Hello'
  public static void main(String[] args) {
    System.out.println("New line after this output")
    // this creates a new line after this statement
    System.out.print("Same line as the next output")
    // without the 'ln', next output will be same line as this
  }
}

public class Creator {
	public static void main(String[] args) {
    String name = "James Gosling";
    // declaring variable of string named 'name' and assigning a value
   	int yearCreated = 1995;
    System.out.println(name);
    // printing out the variable (no '' needed for the variable)
    System.out.println(yearCreated);
	}
}