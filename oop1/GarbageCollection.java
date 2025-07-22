public class GarbageCollection {
    public static void main(String[] args) {
        Whatever obj = new Whatever("xyz");

        System.out.println(obj);

        //multiple objects being created for the reference variable obj and each previous one ends up as garbage value
        for (int i = 0; i < 1000000000; i++) {
            obj = new Whatever("Random");
        }
    }
}

class Whatever{
    String name;
    Whatever(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}