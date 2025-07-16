public class file{
    public static void main(String[] args){
        Integer a = 10;

        Integer b = 20;
        swap(a,b);
        
        final A mansi = new A("Mansi");
        mansi.name = "other name";

        // when a non primitive is final, you can not reassign it.
        //mansi = new A("new object");
        
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a= b;
        b= temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
    
}