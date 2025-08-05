package Enums;

public class EnumExample {
    // enums can implement an interface
    enum Week implements Greetable{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        //enum constructor (cannot be public/protected)
        //called automatically once per constant when class is loaded
        Week(){
            System.out.println("Constructor called for: " + this);
        }

        //internally: public static final Week Monday = new Week();  for each constant


        //enum-specific method
        void display() {
            System.out.println("Today is: " + this);
        }

        //implementing method from interface
        @Override
        public void greet() {
            System.out.println("Hello from " + this);
        }
    }

    public static void main(String[] args) {
        //enum reference variable stored on stack
        Week today = Week.Monday;

        //calls method from implemented interface
        today.greet();

        //calls custom method in enum
        today.display();

        //valueOf(): Converts string to enum constant
        Week fromString = Week.valueOf("Monday");
        System.out.println(fromString);

        //values(): Lists all enum constants
        System.out.println("All days:");
        for (Week day : Week.values()) {
            System.out.println(day);
        }

        //ordinal(): Gives index of the constant (starting from 0)
        System.out.println("Ordinal of " + today + " = " + today.ordinal());
    }
}


interface Greetable{
    void greet();
}