package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        //Consumer<Integer> means it takes an Integer input and returns nothing.
        Consumer<Integer> printDouble = (item) -> System.out.println(item * 2);

        //Applies the lambda function printDouble to each element of the numbers
        //internally calls printDouble.accept(items) for each element in the list numbers.
        numbers.forEach(printDouble);
    }
}