package AccessModifiers.pkg2;

import AccessModifiers.pkg1.Base;

//not subclass in different package

public class Other2 {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.publicStr);
        //Error
        // System.out.println(b.proStr);
        // System.out.println(b.defStr);
        // System.out.println(b.privStr);
    }
}
