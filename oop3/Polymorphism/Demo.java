package Polymorphism;

class Vehicle{
    void speed(){
        System.out.println("Vehicle moves at a normal speed.");
    }

    //final methods can not be overridden but can be inherited by subclass
    final void fuelType(){
        System.out.println("Vehicle uses normal fuel.");
    }

    static void type(){
        System.out.println("This is a normal vehicle.");

    }
}

class Car extends Vehicle{
    //runs when Car object created which overrides the superclass speed method.
    @Override
    void speed(){
        System.out.println("Car moves at 100 km/h.");
    }

    //Gives error
//    void fuelType(){
//        System.out.println("Car uses petrol.");
//    }

}

class Bicycle extends Vehicle{
    @Override
    void speed(){
        System.out.println("Bicycle moves at 20 km/h.");
    }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        //upcasting
        Vehicle v2 = new Car();
        Vehicle v3 = new Bicycle();

        // determination of which method to run done by Dynamic Method Dispatch
        // and is dependent on the type of object
        v2.speed();
        v3.fuelType();
    }
}
