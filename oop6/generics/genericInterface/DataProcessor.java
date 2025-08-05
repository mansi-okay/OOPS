package generics.genericInterface;

//Generic interface
public interface DataProcessor<T> {
        void process(T data);
}

class StringProcessor implements DataProcessor<String>{
    public void process(String data){
        System.out.println(data.toUpperCase());
    }
}

class Demo {
    public static void main(String[] args) {
        DataProcessor<String> str = new StringProcessor();
        str.process("hello");
    }
}