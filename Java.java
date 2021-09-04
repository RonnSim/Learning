// Print in Java:

public class Hello { 
  // creates a class called 'Hello'
  public static void main(String[] args) {
    System.out.println("New line after this output")
    // System - built-in tool, out - output, println - print
    // this creates a new line after this statement
    System.out.print("Same line as the next output")
    // without the 'ln', next output will be same line as this
  }
}


// Variables:

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


// String type - escape sequence

public class Test_1 {
	public static void main(String[] args) {   
    System.out.println("\"Hello World\"");
    // Prints: "Hello World" (with the quotation marks)
    System.out.println("Backslash:\\");
    // Prints: Backslash:\ (used to print the \)
    System.out.println("Hello\nGoodbye");
    /* Prints: Hello
              Goodbye (on different lines)*/
	}
}


// Print Variables:

public class MyProfile {
	public static void main(String[] args) {   
      String name = "Ronn";
      int age = 27;
      double desiredSalary = 6000.00;
      char gender = 'm';
      boolean lookingForJob = true;
      System.out.println(name + " " + age);
      // prints many variable (with the '+')
	}
}


// Operators: order of operators: ( ), *, /, %, +, -

public class GuessingGame {
	public static void main(String[] args) {   
		int mystery1 = 8 + 6;
    /* java includes arithmetic operators, expressions
    resulting value will be the same data type */
    int mystery2 = 8 - 6;
    System.out.println(mystery2);
	}
}

public class PlusAndMinus {
	public static void main(String[] args) {   
		int zebrasInZoo = 8;
    int giraffesInZoo = 4;
    int animalsInZoo = zebrasInZoo + giraffesInZoo;
    System.out.println(animalsInZoo);
    int numZebrasAfterTrade = zebrasInZoo - 2;
    System.out.println(numZebrasAfterTrade);
	}
}

public class MultAndDivide {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal + (subtotal*tax);
    // Does not matter the (), will follow math sequence
    System.out.println(total);
    double perPerson = total/4;
    System.out.println(perPerson);
	}
}

public class Modulo {
	public static void main(String[] args) {   
		int students = 26;
    int leftOut = students%3;
    System.out.println(leftOut);
	}
}
// Modulo, will determine odd/even 
7 % 2
// 1, odd!
8 % 2
// 0, even!
9 % 2
// 1, odd!


// Compound assignment operators:
addition -> +=
subtraction -> -=
multiplication -> *=
division -> /=
modulo -> %=

public class BakeSale {
	public static void main(String[] args) {   
		int numCookies = 17;
    numCookies -= 3;
    numCookies /= 2;
    // Compounded operators
    System.out.println(numCookies);
	}
}

