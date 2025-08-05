package generics.genericInterface;

public class Book implements Comparable<Book>{
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " $" + price;
    }


    //Compare by price is by default
    @Override
    public int compareTo(Book o) {
        //return (int) (this.price - o.price);
        // compare returns | -1 a<b | 0 a == b | 1 a>b
        return Double.compare(this.price, o.price);
    }
}
