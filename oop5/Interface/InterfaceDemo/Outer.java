package Interface.InterfaceDemo;

public class Outer {

    //nested interface
    public interface Nested{
        void show();
    }

    public void display(){
        System.out.println("Inside outer class");
    }
}

class implement implements Outer.Nested{

    @Override
    public void show() {
        System.out.println("Implemented");
    }
}