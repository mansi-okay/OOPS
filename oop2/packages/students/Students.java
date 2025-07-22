package packages.students;

public class Students{
    String name;

    public Students(String name){
        this.name = name;
    }

    public void greet(){
        System.out.println("Hi! I'm "+ this.name);
    }
}
