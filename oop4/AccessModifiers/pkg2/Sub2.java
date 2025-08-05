package AccessModifiers.pkg2;

import AccessModifiers.pkg1.Base;

// subclass in different package

public class Sub2 extends Base {
    public static void main(String[] args) {
        Sub2 s = new Sub2();
        System.out.println(s.publicStr);
        System.out.println(s.proStr);
        //Error
        // System.out.println(s.defStr);
        // System.out.println(s.privStr);
    }
}
