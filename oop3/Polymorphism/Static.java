package Polymorphism;

import javax.swing.plaf.basic.BasicSplitPaneUI;

class Hogwarts{
    static void Message(){
        System.out.println("Hogwarts School of Witchcraft and Wizardry");
    }
}

class Gryffindor extends Hogwarts{
    //when new static method with same name is defined in subclass
    // it hides the static method from Hogwarts instead of overriding it
    static void Message(){
        System.out.println("Gryffindor Tower");
    }
}


public class Static {
    public static void main(String[] args) {
        Hogwarts h1 = new Gryffindor();
        Gryffindor g1 = new Gryffindor();


        Hogwarts.Message();
        Gryffindor.Message();

        //static methods are called based on the class name
        // used in the call, not the object type.
        //It is not polymorphism. It’s called method hiding, not overriding.
        h1.Message();
        g1.Message();

    }
}