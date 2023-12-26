package Inheritance;

public class Programmer extends Employee{
    String proLang;
    String project;
    int bonus;
    void print(){
       super.print();
        System.out.println("prolang:"+proLang);
        System.out.println("project:"+project);
        System.out.println("bonus:"+bonus);
    }
}
