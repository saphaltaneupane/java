package assignment1;
import java.util.*;
public class calculationusingswitch {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the values of a and b:");
	double a=s.nextInt();
	double b=s.nextInt();
	System.out.println("enter the expression you want to perform.Enter the following for the operations\n:"
			+ " + for addition:\n"
			+ "- for subtraction\n"
			+ "* for multiplication\n"
			+ "/ for division\n"
			
			);
    String ch=s.next(); //char ch = s.next().charAt(0);
    switch(ch) {
    case "+": // case '+':
    	System.out.println("The sum of the two numbers is:"+(a+b));
    	break;
    case "-": 
    	System.out.println("The subtraction of the two numbers is:"+(a-b));
    	break;
    case "*": 
    	System.out.println("The  multiplication of the two numbers is:"+(a*b));
    	break;
    case "/": 
    	System.out.println("The division of the two numbers is:"+(a/b));
    	break;
    	default:
    		System.out.println("invalid operation");
    	
    }
}
}
