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


// Methods

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

