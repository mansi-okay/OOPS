package AccessModifiers.pkg1;

// subclass in same package

public class Sub1 extends Base{
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        System.out.println(s.publicStr);
        System.out.println(s.proStr);
        System.out.println(s.defStr);
        //Error
        // System.out.println(s.privStr);
    }
}
