package assignment1;
import java.math.*;
import java.util.*;
public class area_circle {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the value of radius:");
	int r = s.nextInt();
	double area= Math.PI*r*r;
	System.out.println(area);
}
}
