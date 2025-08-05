package generics.genericInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Random", 399);
        Book b2 = new Book("Book", 299);
        Book b3 = new Book("Something", 450);
        Book b4 = new Book("Whatever", 375);

        Book[] list = {b1, b2, b3, b4};

        //Sorting based on price
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


        //Sorting based on strings
        Arrays.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.title.compareTo(o2.title);
            }
        });
        System.out.println(Arrays.toString(list));


        //Sorting based on string descending
        Arrays.sort(list, (o1, o2) -> o2.title.compareTo(o1.title));
        System.out.println(Arrays.toString(list));



        if (b1.compareTo(b3) < 0){
            System.out.println(b1.title + " cheaper");
        }
        else{
            System.out.println(b3.title + " cheaper");
        }
    }
}
