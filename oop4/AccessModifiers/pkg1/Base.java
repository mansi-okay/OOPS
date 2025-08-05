package AccessModifiers.pkg1;

// class itself

public class Base {
    public String publicStr = "Public";
    protected String proStr = "Protected";
    String defStr = "Default";
    private String privStr = "Private";

    public static void main(String[] args) {
        Base b = new Base();
        System.out.println(b.publicStr);
        System.out.println(b.proStr);
        System.out.println(b.defStr);
        System.out.println(b.privStr);
    }
}
