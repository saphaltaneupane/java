package assignmentinheritance;

public class main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.Address="ktm";
        e.Age=36;
        e.Name="hiiii";
        e.Salary=20000;
        e.specialization="java";
        e.phoeno=93893444;
        Manager m = new Manager();
        m.Address = "sagarmatha";
        m.Name = "sagar";
        m.Age = 23;
        m.Salary = 23454323;
        m.deparment = "IT";
        System.out.println(e.Name);
        System.out.println(e.Age);
        System.out.println(e.Salary);
        System.out.println(e.phoeno);
        System.out.println(e.specialization);
        System.out.println(m.Name);
        System.out.println(m.Address);
        System.out.println(m.Age);
    }
}
class member{

    String Name;
    int Age;
    int phoeno;
    String Address;
    int Salary;




    void  printSalary(){
      System.out.println("The salary of the members are:"+Salary);
    }

}
class Employee extends member{
    String specialization;


    }

class Manager extends member{
    String deparment;
}