package cloning;

public class Person implements Cloneable{
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException{
        //Shallow copy
        return super.clone();
    }
}

class Address{
    String city;

    public Address(String city) {
        this.city = city;
    }
}