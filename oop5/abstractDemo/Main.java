package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Character chandler = new Chandler("Chandler Bing", 32);

        chandler.job();
        System.out.println(chandler.city);
        System.out.println(chandler.age);
        chandler.CatchPhrase();
        chandler.hangout();

        Character.group();
    }
}
