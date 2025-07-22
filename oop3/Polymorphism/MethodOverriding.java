package Polymorphism;

import java.time.Period;

public class MethodOverriding{
    String something;
    int num;

    MethodOverriding(String something, int num){
        this.something = something;
        this.num = num;
    }

    @Override
    public String toString(){
        return "Something: " + this.something + ", Num: " + this.num;
    }

    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding("Whatever", 15);
        System.out.println(obj);
    }
}
