public class WrapperClasses{
    public static void main(String[] args) {
        //Wrapper classes
        Integer a = 10;
        // b points to same object as a
        Integer b = a;

        System.out.println(a + " " + b);

        // a points to new Integer object
        a = 20;

        //b remains same because Integer class is immutable
        System.out.println(a + " " + b);

        // Cannot mutate the internal value of Integer
        // There's no a.value = 30; possible so only reassignment is possible.

        // Custom0 classes
        Money m1 = new Money(1000000);
        Money m2 = m1;

        System.out.println(m1.amount + " " + m2.amount);

        //m1.amount goes to the object that m1 refers to, and modifies the amount field
        m1.amount = 50000;

        // both references see the change because they point to the same object in memory, and that object has been modified.
        System.out.println(m1.amount + " " + m2.amount);

    }
}

class Money{
    int amount;
    Money(int amount){
        this.amount = amount;
    }
}