package Inheritance;

public class HogwartsStudent extends Wizard{
    String house;

    HogwartsStudent() {
        super();
        this.house = "Undecided";
    }

    HogwartsStudent(String name, int age, String house){

        // Calling the parent constructor and initialising values present in parent class
        //If this wasn't initialise it would call the default values
        super(name, age);

        this.house = house;

       // System.out.println(super.age);

        //Super used to explicitly call house, if superclass also had a house property it would not give an error
        //System.out.println(super.house);
    }

    HogwartsStudent(HogwartsStudent other){
        //Even if you pass a HogwartsStudent object to super(other), the Wizard constructor only sees and works with
        // the Wizard fields — like name and age.
        super(other);

        //To handle the extra part, it is initialized
        this.house = other.house;
    }
}