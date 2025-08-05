package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int num = 7;

        try {
            check(num);
        } catch (CustomException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("normal exception");
        } finally{
            System.out.println("This will always execute");
        }

    }

    static void check(int num) throws CustomException {
        if (num < 10) {
            throw new CustomException("Number less than 10");
        } else {
            System.out.println("done");
        }
    }
}
