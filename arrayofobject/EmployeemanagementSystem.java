package arrayofobject;
import java.util.Scanner;
public class EmployeemanagementSystem {
    public static void main(String[] args) {
        Employee e[] = new Employee[1];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<e.length;i++){
            Employee em = new Employee();
            System.out.println("enter the id,");
            em.name=s.next();
            em.city=s.next();
            em.company=s.next();
            em.id=s.nextInt();
            em.salary = s.nextInt();
            em.department=s.next();
            em.post=s.next();
            e[i]=em;
        }
        for (Employee m:e) {
            System.out.println(e);
        }


    }
}
