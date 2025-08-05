public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //gives string representation of an object and when object is print it calls object.toString
    @Override
    public String toString() {
        return super.toString();
    }

    // used in garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // gives unique representation of an object via number
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //compare two objects for logical equality not just reference equality
    @Override
    public boolean equals(Object obj) {
        //type casting the Object obj to class type ObjectDemo
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);

        //this checks if both ref variables address same or not
        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        //comparing by the num values
        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

        // checks if object that obj1 refers to instance of the class or subclass of it
        System.out.println(obj1 instanceof ObjectDemo);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        // same outputs
        System.out.println(obj1.toString());
        System.out.println(obj1);

    }


}
