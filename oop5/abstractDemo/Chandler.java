package abstractDemo;

public class Chandler extends Character {

    public Chandler(String name, int age) {
        super(name, age);
    }

    @Override
    void job() {
        System.out.println(name + " works in statistical analysis and data reconfiguration");
    }

    @Override
    void CatchPhrase() {
        System.out.println("Hi, I'm Chandler. I make jokes when I'm uncomfortable.");
    }

    @Override
    void hangout(){
        super.hangout();
    }
}
