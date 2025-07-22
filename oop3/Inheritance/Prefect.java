package Inheritance;

public class Prefect extends HogwartsStudent{
    String responsibility;

    Prefect(){
        super();
        this.responsibility = "Help other students";
    }

    Prefect(String name, int age, String house, String responsibility){
        super(name, age, house);
        this.responsibility = responsibility;
    }

    Prefect(Prefect other){
        super(other);
        this.responsibility = other.responsibility;
    }
}
