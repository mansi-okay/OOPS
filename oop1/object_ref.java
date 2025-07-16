public class object_ref {
    public static void main(String[] args){

        //student1 does not directly store the object itself, but rather stores the memory address of the object that was created using new
        Student student1 = new Student();

        Student student2 = student1;

        student1.name = "New name";

        System.out.println(student2.name); 
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        //Constructor chaining
        this(13, "default person", 100.0f);
    }


    Student(int rno, String name, float marks){
        this.rno= rno;
        this.name= name;
        this.marks= marks;
    }
}
