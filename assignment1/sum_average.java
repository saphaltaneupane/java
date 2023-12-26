package assignment1;
import java.util.*;
public class sum_average {
     public static void main(String [] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the value of a:");
    	int a = s.nextInt();
    	System.out.println("enter the value of b:");
    	int b = s.nextInt();
    	int sum=a+b;
    	int avg=sum/2;
    	System.out.println("the value of sum:"+sum);
    	System.out.println("the value of average:"+avg);
     }
}
