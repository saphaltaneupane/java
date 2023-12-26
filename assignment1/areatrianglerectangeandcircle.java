package assignment1;
import java.util.*;
import java.math.*;
public class areatrianglerectangeandcircle {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
//	System.out.println("enter the length:");
//	int l = s.nextInt();
//	System.out.println("enter the breadth:");
//	int b = s.nextInt();
//	int area=l*b;
//	System.out.println("area of rectangle::"+area);
	System.out.println("enter the values of a,b,c:");
	int a =s.nextInt();
	int c = s.nextInt();
	int d = s.nextInt();
	int sd=(a+c+d)/2;
	double areatriangle= Math.sqrt(sd*(sd-a)*(sd-c)*(sd-d));
	System.out.println("area of triangle:"+areatriangle);
}
}


