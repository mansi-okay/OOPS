package ExceptionHandling;

public class ManualThrowExample {
    public static void main(String[] args) {
        try{
            throw new Exception("Something went wrong");
        }
        //more specific exceptions must come before more general ones
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This will always execute");
        }
    }
}
