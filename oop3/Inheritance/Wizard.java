package Inheritance;

public class Wizard {
    String name;
    int age;

    Wizard(){
        //super();   This called the object class
        this.name = "Unknown Wizard";
        this.age = 11;
    }

    Wizard(String name, int age){
        this.name = name;
        this.age = age;
    }

    Wizard(Wizard other){
        this.name = other.name;
        this.age = other.age;
    }
}