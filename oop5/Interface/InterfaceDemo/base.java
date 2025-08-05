package Interface.InterfaceDemo;

public interface base {
    void greet();

    // default methods work like normal methods, no need to override them
    default void def(){
        System.out.println("Default method in base");
    }

    //static methods can have to have body in interfaces
    static void stat(){
        System.out.println("Static method in base");
    }
}
