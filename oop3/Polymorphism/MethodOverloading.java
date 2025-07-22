package Polymorphism;

public class MethodOverloading{

    void display(String message){
        System.out.println(message);
    }

    void display(String message, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    void display(int number){
        System.out.println(number);
    }

    void display(int number, String label){
        System.out.println(label + ": " + number);
    }

    public static void main(String[] args) {
        MethodOverloading printer = new MethodOverloading();

        printer.display("Hello");
        printer.display("Repeat ", 3);
        printer.display(42);
        printer.display(100, "Score");
    }
}
