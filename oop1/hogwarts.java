import java.util.Scanner;

public class hogwarts{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter name: ");
        String name= sc.nextLine();

        System.out.print("Enter house: ");
        String house= sc.nextLine();

        System.out.print("Enter patronus: ");
        String patronus= sc.nextLine();

        Student student= new Student(name, house, patronus);
        student.greeting();
        System.out.println("Patronus Charm: "+student.charm());

        
        Student defaultStudent= new Student();
        defaultStudent.greeting();
        System.out.println("Patronus Charm: "+defaultStudent.charm());

        sc.close();
    }
}

class Student{
    String name;
    String house;
    String patronus;

    // Constructor overloading
    Student(){
        this.name= "Hermione";
        this.house= "Gryffindor";
        this.patronus= "Otter";
    }

    Student(String name, String house, String patronus){
        this.name= name;
        this.house= house;
        this.patronus= patronus;
    }

    void greeting(){
        System.out.println("Hi, I'm " + this.name + " of " + this.house + " house.");
    }

String charm(){
    return switch (this.patronus){
        case "Stag" -> "Stag 🐴";
        case "Otter" -> "Otter 🦦";
        case "Jack Russell terrier" -> "Jack Russell terrier 🐶";
        default -> "Magic Wand 🪄";
    };
}
}