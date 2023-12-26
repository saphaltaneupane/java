package assignment1;
import java.util.*;
public class simpleinterest {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the principal:");
	int p = s.nextInt();
	System.out.println("enter the time:");
	int t = s.nextInt();
	System.out.println("enter the rate:");
	int r = s.nextInt();
	int i=(p*t*r)/(100);
	System.out.println("Interest:" +i);
}
}
