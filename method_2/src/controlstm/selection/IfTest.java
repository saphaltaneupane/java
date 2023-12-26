package method_2.src.controlstm.selection;
import java.util.*;

public class IfTest {
public static void main(String args[]) {
	// used for single statements
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter salary of the employee");
	int salary =s.nextInt();
	if(salary<30000) {
	salary=salary+8000;
	}
	System.out.print("total salary"+salary);
	
}
}
