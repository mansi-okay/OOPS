package generics;

public class LambdaCalc {
    public static void main(String[] args) {
        //assigning a lambda expression to a variable of type Operation gives that variable access to interface method
        Operation sum = (a,b) -> a+b;
        Operation multiply = (int a, int b) -> a*b;

        LambdaCalc calc = new LambdaCalc();
        System.out.println(calc.operate(4,2, sum));
        System.out.println(calc.operate(4,2, multiply));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}