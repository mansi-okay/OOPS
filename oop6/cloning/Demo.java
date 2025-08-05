package cloning;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address add = new Address("New York");
        Person p1 = new Person("Someone", 20, add);
        Person p2 = (Person) p1.clone();

        System.out.println(p1.address.city);
        System.out.println(p2.address.city);

        //Affects original object because of shallow copy
        p2.address.city = "London";

        System.out.println(p1.address.city);
    }
}
