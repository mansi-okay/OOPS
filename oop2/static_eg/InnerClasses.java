public class InnerClasses {

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    // default toString would print something like Book@15db9742, override alters it
        @Override
        public String toString(){
        return  "\"" + this.title + "\"" + " by " + this.author;
    }
    }

    public static void main(String[] args) {
        // Book is static, so main can create its objects without an InnerClasses instance because they’re independent
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Brave New World", "Aldous Huxley");

        System.out.println(book1);

        System.out.println("Author of book1: " + book1.author);
        System.out.println("Author of book2: " + book2.author);

    }
}