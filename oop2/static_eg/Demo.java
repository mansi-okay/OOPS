package static_eg;

public class Demo {
    public static void main(String[] args) {
        // static variable can be accessed without an object being created
        System.out.println("Total animals in beginning: "+Animal.totalAnimals);

        Animal cat = new Animal("Cat", 5);
        System.out.println("Cat added");

        Animal giraffe = new Animal("giraffe", 19);
        System.out.println("Giraffe added");

        System.out.println("Total animals now: " + Animal.totalAnimals);

        //We need to create an instance of class to access non-static data in static data
        Demo demoInstance = new Demo();
        demoInstance.Message();

    }

    void Message(){
        System.out.println("Animalia kingdom");
    }
}
