public class FinalKeyword {
    public static void main(String[] args) {
        final int n = 32;
        //Gives error can't reassign primitives
        //n = 9;

        final Person person = new Person("Draco");
        //fields can be modified for "final" objects
        person.name = "Hermione";

        System.out.println(person.name);

        //Can not reassign non-primitives
        //person = new Person("Ron");
    }
}

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
