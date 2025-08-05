package ExceptionHandling;

public class DivideExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0.");
        }
        return a / b;
    }
}
