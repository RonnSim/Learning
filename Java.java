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


            // < , >

            public class GreaterLessThan {
              public static void main(String[] args) {   
                double creditsEarned = 176.5;
                double creditsOfSeminar = 8;
                double creditsToGraduate = 180;
                System.out.println(creditsEarned < creditsOfSeminar);
                // prints true/false when compared <, >
                
                double myBalance = 200.05;
                double costOfBuyingNewLaptop = 1000.05;
                boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
                // set boolean data type to variable
              }
            }

          // >=, <=

          double paycheckAmount = 620;
          double calculatedPaycheck = 15.50 * 40;
          System.out.println(paycheckAmount >= calculatedPaycheck);
          //this will print true, since paycheckAmount equals calculatedPaycheck

          public class GreaterThanEqualTo {
              public static void main(String[] args){
                double recommendedWaterIntake = 8;
                double daysInChallenge = 30;
                double yourWaterIntake = 235.5;
                double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
                boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
                System.out.println(isChallengeComplete); 
              }       
          }


          // ==

          double paycheckAmount = 620;
          double calculatedPaycheck = 15.50 * 40;
          System.out.print(paycheckAmount == calculatedPaycheck);
          // This will print true, since paycheckAmount equals calculatedPaycheck

          double balance = 20000.0;
          double amountToDeposit = 620;
          double updatedBalance = balance + amountToDeposit;
          boolean balanceHasChanged = balance != updatedBalance;
          // balanceHasChanged holds true, since balance does not equal updatedBalance

          public class EqualNotEqual {
            public static void main(String[] args) {   
              int songsA = 9;
              int songsB = 9;
              int albumLengthA = 41;
              int albumLengthB = 53;
              boolean sameNumberOfSongs = songsA == songsB;
            }
          }


          // .equals() - for comparing strings, .equals is an in-built function

          String person1 = "Paul";
          String person2 = "John";
          String person3 = "Paul";
          System.out.println(person1.equals(person2));
          // Prints false, since "Paul" is not "John"
          System.out.println(person1.equals(person3));
          // Prints true, since "Paul" is "Paul"

          public class Song {
              public static void main(String[] args){
                String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
                String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
                String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
                System.out.println(line2.equals(line3));
              }       
          }


// String Concatenate - to join

          String username = "PrinceNelson";
          System.out.println("Your username is: " + username);
          // prints the combined 

          int balance = 10000;
          String message = "your balance is: " + balance;
          System.out.println(message);
          // automatically converts to String data type

          public class Zoo {
              public static void main(String[] args){
                int animals = 12;
                String species = "zebra";
                String zooDescription = "Our zoo has " + animals + " " + species + "s!";
                System.out.println(zooDescription);
                //prints 'Our zoo has 12 zebras!'
              }       
          }


// final keyword - for variables that should not be changed

          final int yearBorn = 1968;
          //prepend 'final' to the variable

          public class Final {
            public static void main(String[] args) { 
                final double pi = 3.14;
                System.out.println(pi);
                pi = pi + 1;
                // will have an error as we cannot change values to a final variable
            }
          }


/* Object-oriented programming - Class
Describes how an instance behaves and what information can be stored */

          public class Car {
            // defines class named Car, public - access level modifier that allows other classes to interact with this class
            public static void main(String[] args) {
              // main() - lists the program's tasks to be performed, it runs when executing the compiled Car.class file
            }
            // end of scope for main()
          }
          // end of scope for Class Car


// Class - Constructors

          public class Car {
            // Constructor method - Car()
            public Car() {
              // instructions for creating a Car instance
            }  
          
            public static void main(String[] args) {
              // body of main method
            
              Car ferrari = new Car();
              /* Invoke the Car() constructor, ferrari variable is declared a referenced data type called Car
              after '=' we invoke the constructor method 'Car()', and keyword 'new', indicates creating an instance */
            }
          }

/* Output Example: Car thunderBird = new Car();
System.out.println(thunderBird); // Prints: Car@76ed5528
 
thunderBird = null; // change value to null
System.out.println(thunderBird); // Prints: null */

          public class Store {
            // new method: Store () constructor!
            public Store() {
              System.out.println("I am inside the constructor method.");
            }
            // main method is where we create instances! main() runs first in the code
            public static void main(String[] args) {
              System.out.println("Start of the main method.");
              Store lemonadeStand = new Store();
              // created instance, therefore moves to Store() constructor code
              System.out.println(lemonadeStand);
              // comes back to main() after Store () code runs
            }
          }
          /* Output is: Start of the main method.
                        I am inside the constructor method.
                        Store@2aae9190
            Since no field information is input yet,
            Store is the class, @2aae9190 refers to the location stored in the computer memory */


// Declaring instance fields
            public class Car {
              // declare fields inside the class by specifying the type and name
              String color;
          
            public Car() {
            }
          
            public static void main(String[] args) {
            }
          }


// Constructor Parameters

          public class Car {
            String color;
            public Car(String carColor) {
              // constructor method with a parameter
              // parameter value assigned to the field - (String carColor)
              // signature = Car(String carColor)
              color = carColor;
              // assign parameter value to instance field
            }
            public static void main(String[] args) {
              // program tasks
            }
          }


          public class Car {
            String color;
            int mpg;
            boolean isElectric;
          
            // constructor 1:
            public Car(String carColor, int milesPerGallon) {
              color = carColor;
              mpg = milesPerGallon;
            }
            // constructor 2:
            public Car(boolean electricCar, int milesPerGallon) {
              isElectric = electricCar;
              mpg = milesPerGallon;
            }
          }
          /* input: Car myCar = new Car(true, 40), 
          this will automatically refer back to the signatures and compile with the correct constructor */


// Default instance fields - will follow default if none input 

          public class Car {
            String color = "red";
            boolean isElectric = false;
            int cupHolders = 4;
            // sets the default values as above
          
            public static void main(String[] args) {
              Car myCar = new Car();
              System.out.println(myCar.color); 
              // Prints: red, due to the default
            }
          }


// Accessing a field 

          public class Car {
            String color;
          
            public Car(String carColor) {
              // assign parameter value to instance field
              color = carColor;
            }
          
            public static void main(String[] args) {
              // parameter value supplied when calling constructor
              Car ferrari = new Car("red");
            }
          }
          // accessing a field: objectName.fieldName
          // ferrari.color - returns "red"

    // Example 
          public class Store {
            // instance fields
            String productType;
            
            // constructor method
            public Store(String product) {
              productType = product;
            }
            
            // main method
            public static void main(String[] args) {
              Store lemonadeStand = new Store("lemonade");
              System.out.println(lemonadeStand.productType);
              // accessing fields must use the instance field (not parameter)
            }
          }


// Multiple instance fields

          public class Car {
            String color;
            // new fields!
            boolean isRunning;
            int velocity;
          
            // new parameters that correspond to the new fields
            public Car(String carColor, boolean carRunning, int milesPerHour) {
              color = carColor;
              // assign new parameters to the new fields
              isRunning = carRunning;
              velocity = milesPerHour;
            }
          
            public static void main(String[] args) {
              // new values passed into the method call
              // values must match order in parameters
              Car ferrari = new Car("red", true, 27);
              Car renault = new Car("blue", false, 70);
          
              System.out.println(renault.isRunning);
              // false
              System.out.println(ferrari.velocity);
              // 27
            }
          }


// Review of classes

          public class Dog {
            String breed;
            boolean hasOwner;
            int age;
            
            public Dog(String dogBreed, boolean dogOwned, int dogYears) {
              System.out.println("Constructor invoked!");
              breed = dogBreed;
              hasOwner = dogOwned;
              age = dogYears;
            }
            
            public static void main(String[] args) {
              System.out.println("Main method started");
              Dog fido = new Dog("poodle", false, 4);
              Dog nunzio = new Dog("shiba inu", true, 12);
              boolean isFidoOlder = fido.age > nunzio.age;
              int totalDogYears = nunzio.age + fido.age;
              System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
              System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
              System.out.println("The total age of the dogs is: " + totalDogYears);
              System.out.println("Main method finished");
            }
          }


// Methods - it is a task that an object of a class performs

          public void checkBalance(){
            // public - other classes can access this method
            // void - no specific output from the method
            // checkBalance - name of method
            // method signature - name of method + parameters eg. checkBalance()
            System.out.println("Hello!");
            System.out.println("Your balance is " + balance);
            // body of method - within the {}
          }

      // Example 1
          public class Store {
            // instance fields
            String productType;
            
            // constructor method
            public Store(String product) {
              productType = product;
            }
            
            // additionally added advertise method
            public void advertise() {
              System.out.println("Come spend some money!");
              System.out.println("Selling " + productType + "!");
              // but this does not print out yet, does not get executed without calling
            }
            // main method
            public static void main(String[] args) {
              
            }
          }

      // Calling a method - to get executed
          class Car {
          
            String color;
          
            public Car(String carColor) {
              color = carColor;
            }
          
            public void startEngine() {
              // adding the scope of the method:
              System.out.println("Starting the car!");
              System.out.println("Vroom!");
            }
          
            public static void main(String[] args){
              Car myFastCar = new Car("red");
              // Call a method on an object:
              myFastCar.startEngine();
              // reference to object  - myFastCar
              // use '.' operator to call the method - startEngine()
              System.out.println("That was one fast car!");
            }
          }
          /* Output: Starting the car!
                      Vroom!
                      That was one fast car! */
          // code runs starting from the main method, other methods are ignored unless being called


      // Calling method multiple times
          public class Store {
            // instance fields
            String productType;
            
            // constructor method
            public Store(String product) {
              productType = product;
            }
            
            // advertise method
            public void advertise() {
              System.out.println("Selling " + productType + "!");
              System.out.println("Come spend some money!");
            }
            
            // main method
            public static void main(String[] args) {
              Store lemonadeStand = new Store("Lemonade");
              lemonadeStand.advertise();
              lemonadeStand.advertise();
              lemonadeStand.advertise();
              // able to easily call on method multiple times
            }
          }


      // Scope of method - tasks in the {} of methods
          class Car {
            // variables declared at the top of the class can be used in all the methods
            String color;
            int milesDriven;
          
            public Car(String carColor) {
              color = carColor;
              milesDriven = 0;         
            }
          
            public void drive() {
              // 'message' variable declared in specific methods can only be used in the specific method
              String message = "Miles driven: " + milesDriven;
              System.out.println(message);
            }
          
            public static void main(String[] args){
              Car myFastCar = new Car("red");
              myFastCar.drive();
            }
          }

          //Example of method error:
            public class Store {
              String productType;
              
              // constructor method
              public Store(String product) {
                productType = product;
              }
              
              // advertise method
              public void advertise() {
                String message = "Selling " + cookie + "!";
                // error occurs - cookie only declared in main method
                System.out.println(message);
              }
              
              // main method
              public static void main(String[] args) {
                String cookie = "Cookies";
                Store cookieShop = new Store(cookie);
                
                cookieShop.advertise();
                System.out.println(message);
                // error occured - 'message' variable only declared in advertise method
              }
            }


      // Adding parameters

          class Car {
    
            String color;
          
            public Car(String carColor) {
              color = carColor;         
            }
          
            public void startRadio(double stationNum, String stationName) {
              // adding parameters, does not have to be in the instance field
              System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
              System.out.println("Enjoy!");
            }
          
            public static void main(String[] args){
              Car myCar = new Car("red");
              myCar.startRadio(103.7, "Meditation Station");
            }
          }
          /* output from above: 
          Turning on the radio to 103.7, Meditation Station!
          Enjoy! */


      // Mulitple methods with the same name - as long as parameter is unique

          // Method 1
          public void startRadio(double stationNum, String stationName) {
            System.out.println("Turning on the radio to " + stationNum + ", " + station + "!");
            System.out.println("Enjoy!");
          }
          
          // Method 2
          public void startRadio(double stationNum) {
            System.out.println("Turning on the radio to " + stationNum + "!");
          }
          
          public static void main(String[] args){
            Car myCar = new Car("red");
            // Calls the first startRadio() method
            myCar.startRadio(103.7, "Meditation Station");
          
            // Calls the second startRadio() method
            myCar.startRadio(98.2);
          }


      // Reassigning instance fields
          public SavingsAccount{
            double balance;
            public SavingsAccount(double startingBalance){
              balance = startingBalance;
            }
          
            public void deposit(double amountToDeposit){
              //Task to add amountToDeposit to the balance
              double updatedBalance = balance + amountToDeposit;
              balance = updatedBalance;
              // Change the value of the variable 'balance' to the new balance value
            }
          
            public void withdraw(double amountToWithdraw){
              //Task to subtract amountToWithdraw from the balance
            }
          
            public static void main(String[] args){
              SavingsAccount myAccount = new SavingsAccount(2000);
              System.out.println(myAccount.balance);
              myAccount.deposit(100);
              // when we call on the deposit method, it will change the value of the instance field
              System.out.println(myAccount.balance);
            }
            }
          }

          // Example

          public class Store {
            // instance fields
            String productType;
            double price;
            
            // constructor method
            public Store(String product, double initialPrice) {
              productType = product;
              price = initialPrice;
            }
            
            // increase price method
            public void increasePrice(double priceToAdd){
              double newPrice = price + priceToAdd;
              // new variable newprice = changes to initial price
              price = newPrice;
              // reassigning price to become newprice
            }
            
            // main method
            public static void main(String[] args) {
              Store lemonadeStand = new Store("Lemonade", 3.75);
              lemonadeStand.increasePrice(1.5);
              // calls increase price method
              System.out.println(lemonadeStand.price);
            }
          }


      // Return - returns a value when it is called

          public int numberOfTires() {
            // replaced 'void' with 'int' signify that return type to be an 'int'
            // void means no value is returned after calling the method
            int tires = 4;
            // return statement, any code after the 'return' statement is ignored by the compiler
            // return value type must match the value type of the method
            return tires;
          }
          public static void main(String[] args){
            Car myCar = new Car("red");
            int numTires = myCar.numberOfTires();
            // non-void methods can be used as variable value or part of an expression
            // print of numTires will be 4
          }

        // Returning an object - instead of primitive numbers
          class CarLot {
            Car carInLot;
            public CarLot(Car givenCar) {
                carInLot = givenCar;
            }
        
            public Car returnACar() {
                // return Car object
                return carInLot;
            }
        
            public static void main(String[] args) {
                Car myCar = new Car("red", 70);
                System.out.println(myCar); 
                CarLot myCarLot = new CarLot(myCar);
                System.out.println(myCarLot.returnACar());
            }
        }
          /* output: Car@2f333739
                      Car@2f333739 as they have the same memory address */

          
          //Example

          public class Store {
            // instance fields
            String productType;
            double price;
            
            // constructor method
            public Store(String product, double initialPrice) {
              productType = product;
              price = initialPrice;
            }
            
            // get price with tax method
            public double getPriceWithTax() {
              double totalPrice = price + price*0.08;
              return totalPrice;
            }
            // main method
            public static void main(String[] args) {
              Store lemonadeStand = new Store("Lemonade", 3.75);
              double lemonadePrice = lemonadeStand.getPriceWithTax();
              System.out.println(lemonadePrice);
            }
          }
 

      // toString() method - to return a string instead of Car@2f333739 (memory address)

            class Car {
 
              String color;
          
              public Car(String carColor) {
                  color = carColor;
              }
          
              public static void main(String[] args){
                  Car myCar = new Car("red");
                  System.out.println(myCar);
              }
          
            public String toString(){
                return "This is a " + color + " car!";
            }
          }
          // output: This is a red car!

        // Example
          public class Store {
            // instance fields
            String productType;
            double price;
            
            // constructor method
            public Store(String product, double initialPrice) {
              productType = product;
              price = initialPrice;
            }
            
            // increase price method
            public void increasePrice(double priceToAdd){
              double newPrice = price + priceToAdd;
              price = newPrice;
            }
            
            // get price with tax method
            public double getPriceWithTax(){
              double tax = 0.08;
              double totalPrice = price + price*tax;
              return totalPrice;
            }

            // main method
            public static void main(String[] args) {
              Store lemonadeStand = new Store("Lemonade", 3.75);
              Store cookieShop = new Store("Cookies", 5);
              System.out.println(lemonadeStand);
              System.out.println(cookieShop);
            }

            public String toString() {
              return "This store sells " + productType + " at a price of " + price + ".";
            }
          }


      // Review of methods
            public class SavingsAccount {
  
              int balance;
            
            public SavingsAccount(int initialBalance){
              balance = initialBalance;
            }
            
            public void checkBalance() {
              System.out.println("Hello!");
              System.out.println("Your balance is " + balance);
            }

            public void deposit(int amountToDeposit) {
              int newBalance = balance + amountToDeposit;
              balance = newBalance;
              System.out.println("You just deposited " + amountToDeposit);
            }

            public int withdraw(int amountToWithdraw) {
              int newNewBalance = balance - amountToWithdraw;
              balance = newNewBalance;
              System.out.println("You just withdrew " + amountToWithdraw);
              return amountToWithdraw;
            }

            public static void main(String[] args){
              SavingsAccount savings = new SavingsAccount(2000);
              
              //Check balance:
              savings.checkBalance();
              
              //Withdrawing:
              savings.withdraw(300);
              
              //Check balance:
              savings.checkBalance();
              
              //Deposit:
              savings.deposit(600);
              
              //Check balance:
              savings.checkBalance();
              
              //Deposit:
              savings.deposit(600);
              
              //Check balance:
              savings.checkBalance();
              
            }

            public String toString() {
              return "Your balance is " + balance;
            }   
          }


// Control flow / conditional - IF-ELSE

          if (true) {
          // 'if' marks the beginning of the statement 
          // within () is the boolean data type
            System.out.println("Hello World!");
          }

      // Example1
          boolean isValidPassword = true;
            if (isValidPassword) {
              System.out.println("Password accepted!");
            }
            // Prints "Password accepted!"
      
      // Example2
          int numberOfItemsInCart = 9;
            if (numberOfItemsInCart > 12) {
              System.out.println("Express checkout not available");
            }
            // Nothing is printed.

      // If condition is short, can omit {}
          if (true) System.out.println("Brevity is the soul of wit");
          // conditional statements does not end with ';'

      // IF-ELSE statements
          public class Order {
            public static void main(String[] args) {
              boolean isFilled = false;
              // Write an if-then-else statement:
              if (isFilled == true) {
                System.out.println("Shipping");
              } else {
                System.out.println("Order not ready");
              }
            }
          }

      // Only the FIRST 'true' condition will be run 
          int testScore = 72;
          if (testScore >= 90) {
            System.out.println("A");
          } else if (testScore >= 80) {
            System.out.println("B");
          } else if (testScore >= 70) {
            System.out.println("C");
          } else if (testScore >= 60) {
            System.out.println("D");
          } else {
            System.out.println("F");
          }
          // prints: C

      // Example
          String course = "Theatre";
          if (course.equals("Biology")) {
            // Enroll in Biology course
          } else if (course.equals("Algebra")) {
            // Enroll in Algebra course
          } else if (course.equals("Theatre")) {
            // Enroll in Theatre course
          } else {
            System.out.println("Course not found!");
          }

      //Example2
          public double calculateShipping() {
              // declare conditional statement here
              if (shipping == "Regular") {
                return 0;
              } else if (shipping == "Express") {
                return 1.75;
              } else {
                return 0.50;
              }
            } 

      // Nested conditional statements
          if (outer condition) {
            // outer statement evaluated first
            if (nested condition) {
              // nested statement evaluated next if outer is true
              Instruction to execute if both conditions are true
            }
          }

        //Example
            int temp = 45;
            boolean raining = true;
            
            if (temp < 60) {
              System.out.println("Wear a jacket!");
              if (raining == true) {
                System.out.println("Bring your umbrella.");
              } else {
                System.out.println("Leave your umbrella home.");
              }
            }

        //Example 2
            public double calculateShipping() {
                if (shipping.equals("Regular")) {
                  return 0;
                } else if (shipping.equals("Express")) {
                  // Add your code here
                    if (couponCode == "ship50") {
                      return 0.85;
                    } else {
                      return 1.75;
                    }
                } else {
                  return .50;
                }
              }

      // Switch statement - chaining if-else 
          String course = "History";
          
          switch (course) {
            case "Algebra": 
              // Enroll in Algebra
              break; 
            case "Biology": 
              // Enroll in Biology
              break;
            case "History": 
              // Enroll in History
              break;
            case "Theatre":
              // Enroll in Theatre
              break;
            default:
              System.out.println("Course not found");
          }
          // in this case, will enroll in the history course
          // if no value, default will be used (similar to the 'else' usage)

      // Example
            String course = "Biology";
            
            switch (course) {
              case "Algebra": 
                // Enroll in Algebra
              case "Biology": 
                // Enroll in Biology
              case "History": 
                // Enroll in History
              case "Theatre":
                // Enroll in Theatre
              default:
                System.out.println("Course not found");
            }
            // if the 'break' is removed, code continues to run after finding 'true'
            // enrolls student in Biology... AND History and Theatre!

      //Example 2 
            public double calculateShipping() {
              double shippingCost;
              // declare switch statement here
              switch (shipping) {
                case "Regular":
                shippingCost = 0; 
                  break;
                case "Express":
                shippingCost = 1.75; 
                  break;
                default: 
                shippingCost = 0.50;
              }
              return shippingCost;
            }

      //Review conditional statements
          public class Order {
            boolean isFilled;
            double billAmount;
            String shipping;
            
            public Order(boolean filled, double cost, String shippingMethod) {
              if (cost > 24.00) {
                System.out.println("High value item!");
              } else {
                System.out.println("Low value item!");
              }
              isFilled = filled;
              billAmount = cost;
              shipping = shippingMethod;
            }
            
            public void ship() {
              if (isFilled) {
                System.out.println("Shipping");
              } else {
                System.out.println("Order not ready");
              }
              
              double shippingCost = calculateShipping();
              
              System.out.println("Shipping cost: ");
              System.out.println(shippingCost);
            }
            
            public double calculateShipping() {
              double shippingCost;
              switch (shipping) {
                case "Regular":
                  shippingCost = 0;
                  break;
                case "Express":    
                  shippingCost = 1.75;
                  break;
                default:
                  shippingCost = .50; 
              }
              return shippingCost;
            }
            
            public static void main(String[] args) {
              // create instances and call methods here!
              Order newOrder = new Order(true, 25.00, "Express");
            }
          }


// Conditional operators - &&, ||, !

      // AND, && operator
          true && true
          // true
          false && true
          // false
          true && false
          // false
          false && false
          // false

          if (tuitionPaid) {
            if (hasPrerequisite) {
              // for enrollment of student
            }
          }
          // can be written in this way with && instead:
          if (tuitionPaid && hasPrerequisite) {
            // enroll student
          }


          // Example1:
          public class Reservation {
            int guestCount;
            int restaurantCapacity;
            boolean isRestaurantOpen;
            boolean isConfirmed;
            
            public Reservation(int count, int capacity, boolean open) {
              guestCount = count;
              restaurantCapacity = capacity;
              isRestaurantOpen = open;
            }  
            
            public void confirmReservation() {
              /* 
                Write conditional
                ~~~~~~~~~~~~~~~~~
                if restaurantCapacity is greater
                or equal to guestCount
                AND
                the restaurant is open:
                  print "Reservation confirmed"
                  set isConfirmed to true
                else:
                  print "Reservation denied"
                  set isConfirmed to false
              */
              if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed.");
            isConfirmed = true;
              } else {
                System.out.println("Reservation denied.");
                isConfirmed = false;
              }
            }

            public void informUser() {
              if (isConfirmed == true) {
                System.out.println("Please enjoy your meal!");
              } else {
                System.out.println("Please come again.");
              }
            }
            
            public static void main(String[] args) {
              Reservation partyOfThree = new Reservation(3, 12, true);
              Reservation partyOfFour = new Reservation(4, 3, true);
              partyOfThree.confirmReservation();
              partyOfThree.informUser();
              partyOfFour.confirmReservation();
              partyOfFour.informUser();
            }
          }


      // OR, || operator 
          true || true
          // true
          false || true
          // true
          true || false
          // true
          false || false
          // false

          if (hasAlgebraPrerequisite) {
            // Enroll in course
          }
          if (hasGeometryPrerequisite) {
            // Enroll in course
          }
          
          // can write in this way instead:
          if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
            // Enroll in course
          }

          // To note: short-circuited evaluation can happen:
          if (1 > 0 || 2 / 0 == 7) {
            System.out.println("No errors here!");
          } // no error even though divided by zero, because first operand is true, skips second operand

          //Example:
          public Reservation(int count, int capacity, boolean open) {
            // Write conditional statement below
            if (count > 8 || count < 1) {
              System.out.println("Invalid reservation!");
            }
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
          }  

      // Logical NOT operator: !
          !false
          // true
          !true
          // false

          // Strange to have a code block that does nothing:
          boolean hasPrerequisite = true;
          if (hasPrerequisite) {
            // do nothing
          } else {
            System.out.println("Must complete prerequisite course!");
          }

          //instead: 
          boolean hasPrerequisite = true;
          if (!hasPrerequisite) {
            System.out.println("Must complete prerequisite course!");
          }

          //Example: 
          public class Reservation {
            int guestCount;
            int restaurantCapacity;
            boolean isRestaurantOpen;
            boolean isConfirmed;
            
            public Reservation(int count, int capacity, boolean open) {
              if (count < 1 || count > 8) {
                System.out.println("Invalid reservation!");
              }
              guestCount = count;
              restaurantCapacity = capacity;
              isRestaurantOpen = open;
            }  
            
            public void confirmReservation() {
              if (restaurantCapacity >= guestCount && isRestaurantOpen) {
                System.out.println("Reservation confirmed");
                isConfirmed = true;
              } else {
                System.out.println("Reservation denied");
                isConfirmed = false;
              }
            }
            
            public void informUser() {
              // Write conditional here
              if (!isConfirmed) {
                System.out.println("Unable to confirm reservation, please contact restaurant.");
              } else {
                System.out.println("Please enjoy your meal!");
              }
            }
            
            public static void main(String[] args) {
              Reservation partyOfThree = new Reservation(3, 12, true);
              Reservation partyOfFour = new Reservation(4, 3, true);
              partyOfThree.confirmReservation();
              partyOfThree.informUser();
              partyOfFour.confirmReservation();
              partyOfFour.informUser();
            }
          }

      // Combination of conditional operators
          boolean foo = true && !(false || !true)
          /* Order of execution:
              1) Conditions placed in parentheses - ()
              2) NOT - !
              3) AND - &&
              4) OR - || */
          
          // Example
          public class Operators {
          public static void main(String[] args) {
            int a = 6;
            int b = 3;

            boolean ex1 = !(a == 7 && (b >= a || a != a));
            System.out.println(ex1);
            //Answer: true

            boolean ex2 = a == b || !(b > 3);
            System.out.println(ex2);
            // answer: true

            boolean ex3 = !(b <= a && b != a + b);
            System.out.println(ex3); 
            //answer: false

          }
        }


// Arrays - storing a group of data

          // We can store 4 lottery numbers like this:
          int firstNumber = 4;
          int secondNumber = 8;
          int thirdNumber = 15;
          int fourthNumber = 16;
          int fifthNumber = 23;
          // what about for 100 numbers? - better to use arrays

      // Creating an array
          double[] prices;
          // specify the data type and name of data
          prices = {13.15, 15.87, 14.22, 16.66};
          // initialize the data to contain
          // can alsp do it in the same line:
          double[] prices = {13.15, 15.87, 14.22, 16.66};
          String[] clothes = {"Tank top", "Beanie"};

          // creating method which returns String array - use String[] 
          public String[] getTopics() {
          }

          //Example:
          public class Newsfeed {
            public String[] getTopics() {
              String[] topics = {"Opinion", "Tech", "Science", "Health"};
              return topics;
            }
            public static void main(String[] args){
              Newsfeed sampleFeed = new Newsfeed();
              String[] topics = sampleFeed.getTopics();
              System.out.println(topics);
            }
          } // printed out a memory class - random numbers and letters 

      //Importing an array package

           // Need to use toString method to print more descriptive printout
           // toString method for Java Arrays:
           import java.util.Arrays;
           // put this at the top of the file, before defining the class, to make it available in all the codes
           Arrays.toString()
           // using one of the package's method - package has many useful methods

           //Example:
           import java.util.Arrays;
 
            public class Lottery(){
            
              public static void main(String[] args){
                int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
                String betterPrintout = Arrays.toString(lotteryNumbers);
                System.out.println(betterPrintout);
              }
            
            } // printout: [4, 8, 15, 16, 23, 42]

            //Example2:
            import java.util.Arrays;
            public class Newsfeed {
              public Newsfeed(){
              }
              public String[] getTopics(){
                String[] topics = {"Opinion", "Tech", "Science", "Health"};
                return topics;
              }
              public static void main(String[] args){
                Newsfeed sampleFeed = new Newsfeed();
                String[] topics = sampleFeed.getTopics();
                System.out.println(Arrays.toString(topics));
                //using the array toString method in print function
              }
            }

      // Getting element by index - using [] with index number
          double[] prices = {13.1, 15.87, 14.22, 16.66};
          System.out.println(prices[1]);
          // prints the number from index 1, prints 15.87

          //Example - views to increase by 1 everytime it is read once
          import java.util.Arrays;

          public class Newsfeed {
            
            String[] topics = {"Opinion", "Tech", "Science", "Health"};
            int[] views = {0, 0, 0, 0};
            
            public Newsfeed(){

            }
              
            public String[] getTopics(){
              return topics;
            }
            
            public String getTopTopic(){
              return topics[0];
              // Getting element by index: index 0 = first position
            }
            
            public void viewTopic(int topicIndex){
              // parameter added to index number
            views[topicIndex] = views[topicIndex] + 1;
            } // views[number] = views array position
              // views array will be updated to add 1 to the assigned index location

            public static void main(String[] args){
              Newsfeed sampleFeed = new Newsfeed();
              
              System.out.println("The top topic is "+ sampleFeed.getTopTopic());
              
              sampleFeed.viewTopic(3);
              // calls .viewTopic method with input of 3, topicIndex = 3 (4th position)
              // assigned index 3 location to be run
              System.out.println("The " + sampleFeed.topics[3] + " topic has been viewed " + sampleFeed.views[3] + " times!"); 
            }
          } /* output: The top topic is Opinion
                        The Health topic has been viewed 1 times! */

      // Creating an empty array
          String[] menuItems = new String[5];
          // new array created and declared size of 5, will always be size of 5
          menuItems[0] = "Veggie hot dog";
          menuItems[1] = "Potato salad";
          menuItems[2] = "Cornbread";
          menuItems[3] = "Roasted broccoli";
          menuItems[4] = "Coffee ice cream";
          // we can set each index of the array to be specific item

          // another way of assigning array straight away:
          String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};

          // changing value of certain position in array:
          menuItems[3] = "Baked cauliflower";
          // change position 3 value

          /* For 'new' array created, initial value will be:
          Data Type	| Initialized Value
          int	      | 0
          double	  | 0.0
          boolean	  | false
          Reference	| null 
          eg. String[] my_names = new String[5];
              int[] my_ages = new int[5];
          my_names will contain 5 nulls, my_age will contain 5 0s 
          */

          // Example:
          import java.util.Arrays;

          public class Newsfeed {
            
            String[] topics = {"Opinion", "Tech", "Science", "Health"};
            int[] views = {0, 0, 0, 0};
            String[] favoriteArticles;
            
            public Newsfeed(){
              // In the constructor method, we have to initialize the array 'favoriteArticles':
              favoriteArticles = new String[10];
              // new empty string of size 10
            }
            
            public void setFavoriteArticle(int favoriteIndex, String newArticle){
              // Setting favoriteArticles array with index favoriteIndex to the value of newArticle
              favoriteArticles[favoriteIndex] = newArticle;
              
            }
              
            public static void main(String[] args){
              Newsfeed sampleFeed = new Newsfeed();
              
              sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
              sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
              sampleFeed.setFavoriteArticle(0, "Oil News");
              
              System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
            }
          }
          // outputs: [Oil News, null, Humans: Exterminate Or Not?, Organic Eye Implants, null, null, null, null, null, null]

      // Getting length of array - to quicky know how many values/elements there are in the array
          String[] menuItems = new String[5];
          System.out.println(menuItems.length);
          // output: 5 - 5 slots even though they are empty

          //Example:
          import java.util.Arrays;

          public class Newsfeed {
            
            String[] topics = {"Opinion", "Tech", "Science", "Health"};
            int[] views = {0, 0, 0, 0};
            
            public Newsfeed(){

            }
              
            public String[] getTopics(){
              return topics;
            }
            
            public int getNumTopics(){
              return topics.length;
            }
            
            public static void main(String[] args){
              Newsfeed sampleFeed = new Newsfeed();
              
              System.out.println("The number of topics is "+ sampleFeed.getNumTopics());
            
            }
          } // output: The number of topics is 4

      // String[] args: String[] - String array, args - arguments that we pass in from the terminal when we run the class file (so far empty)
      public class HelloYou {
        public static void main(String[] args) {
          System.out.println("Hello " + args[0]);  
        }
      }
      /* input in terminal: java HelloYou Laura
          output: Hello Laura */
      // 'String[] args' interpreted as an array with 1 element 'Laura'