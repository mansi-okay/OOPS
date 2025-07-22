package static_eg;

public class Animal {
    String species;
    int age;
    static long totalAnimals;

    public Animal(String species, int age){
        this.species = species;
        this.age = age;
        // increments the static count when a new Animal object is created
        Animal.totalAnimals++;
    }
}
