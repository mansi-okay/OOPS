package Interface.InterfaceDemo;

public class demo implements derived{

    // must be public, because interface methods are public by default
    //can't be more restrictive
    @Override
    public void farewell() {
        System.out.println("ByeBye");
    }

    @Override
    public void greet() {
        System.out.println("HelloHello");
    }

    public static void main(String[] args) {
        demo object = new demo();

        object.greet();
        object.farewell();
        object.def();

        base.stat();
    }
}
