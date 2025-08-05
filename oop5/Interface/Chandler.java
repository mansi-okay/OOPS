package Interface;

public class Chandler implements Job, Personality, Hobby{
    @Override
    public void relax() {
        System.out.println("Watching Baywatch with Joey.");
    }

    @Override
    public void work() {
        System.out.println("I work in statistical analysis and data reconfiguration");
    }

    @Override
    public void joke() {
        System.out.println("Hi, I'm Chandler. I make jokes when I'm uncomfortable.");
    }

    @Override
    //In both hobby and Personality
    //Since the method is abstract in both interfaces, and identical in signature, it's treated as one.
    public void react() {
        System.out.println("Sarcasm");
    }
}
