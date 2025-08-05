package AccessModifiers.pkg1;

// not subclass in same package

public class Other1 {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.publicStr);
        System.out.println(b.proStr);
        System.out.println(b.defStr);
        //Error
        // System.out.println(b.privStr);
    }
}
