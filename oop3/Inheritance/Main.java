package Inheritance;

public class Main {
    public static void main(String[] args) {
        Wizard w1 = new Wizard("Dumbledore", 115);
        System.out.println(w1.name + " " + w1.age);

        //subclass object
        HogwartsStudent s1 = new HogwartsStudent("Harry", 12, "Gryffindor");
        System.out.println(s1.name + " " + s1.age + " " + s1.house);

        //superclass reference holding subclass object
        Wizard w2 = new HogwartsStudent("Hermione", 13, "Gryffindor");
        System.out.println(w2.name + " " + w2.age);

        //accessing weight gives an error because reference type determines what is accessible
        //System.out.println(w2.house);

        //Causes error because HogwartsStudent has access to properties which Wizard doesn't know and is unable to initialise.
        //HogwartsStudent s2 = new Wizard("Snape", 45); // Error

        HogwartsStudent s3 = new HogwartsStudent(s1);
        System.out.println(s3.name + " " + s3.age + " " + s3.house);

        // subclass object HogwartsStudent
        Prefect p1 = new Prefect("Percy", 17, "Gryffindor", "Enforce rules");

        Prefect p2 = new Prefect(p1);
        System.out.println(p2.name + " " + p2.age + " " + p2.house + " " + p2.responsibility);
    }

}
