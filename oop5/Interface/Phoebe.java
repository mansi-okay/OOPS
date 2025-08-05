package Interface;

public class Phoebe implements Hobby{
    @Override
    public void relax() {
        System.out.println("Singing at Central Perk");
    }

    @Override
    public void react() {
        System.out.println("Weird spiritual insight");
    }
}
