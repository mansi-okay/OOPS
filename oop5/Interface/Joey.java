package Interface;

public class Joey implements Job, Personality{

    @Override
    public void work() {
        System.out.println("I'm an actor.");
    }

    @Override
    public void joke() {
        System.out.println("How you doin'?");
    }

    @Override
    public void react() {
        System.out.println("Looks confused, but still flirts.");
    }
}
