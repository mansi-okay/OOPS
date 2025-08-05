package abstractDemo;

public class Demo {
    public static void main(String[] args) {
        //When creating Character object it leads to overriding so we can't just directly create object of abstract class.
        Character joey = new Character("Joey Tribbiani", 31) {
            @Override
            void job() {
                System.out.println(name + " is an actor.");
            }

            @Override
            void CatchPhrase() {
                System.out.println("How you doin'?");
            }
        };
    }
}
