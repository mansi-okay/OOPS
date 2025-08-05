package Inheritance;

class A {
    //private field prevents direct access to variables from outside the class
    private String str;

    public A(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

// Subclass
class B extends A {
    int n;
    //private does not prevent from passing values as
    // arguments to a constructor or method like in B() and super()
    public B(String str, int n) {
        super(str);
        this.n = n;
    }
}

public class Private {
    public static void main(String[] args) {
        B obj = new B("xyz",7);
        System.out.println(obj.n);
        //str is private, its direct access gives error
        //System.out.println(obj.str);
        System.out.println(obj.getStr());
    }
}
