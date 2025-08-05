package abstractDemo;

public abstract class Character {
    String name;
    int age;
    final String city;

    //We can define constructors in abstract classes, but we can't instantiate abstract classes directly.
    //The constructor exists to initialize common fields when a subclass is created.
    public Character(String name, int age){
        this.name = name;
        this.age = age;
        this.city = "New York";
    }

    abstract void job();
    abstract void CatchPhrase();

    //normal method
    void hangout(){
        System.out.println(this.name + " hangs out in Central Perk");
    }

    static void group(){
        System.out.println("The One with Best Friends");
    }
}
