/* WAP to calculate total salary of the following post  
 *          post         basic salary        bonus       total salary 
 *          MD             230000             20%              ?
 *          CEO             250000            25.79%          ?
 *          MANAGER         176000             16%            ?
 *          HELPER          145900             9%             ?           */
package assignment1;
import java.util.*;

public class totalsalary { 
//	public static void main(String [] args)
//	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter the post:");
//		String ch = s.next();
//		switch(ch) {
//		case "MD":
//			System.out.println("the basic salary is 230000");
//			double salary = 230000+230000*0.2;
//			System.out.println("the total salary after bonus is"+salary);
//			break;
//		case "CEO":
//			System.out.println("the basic salary is 250000");
//			double salary1 = 250000+(250000)*0.2579;
//			System.out.println("the total salary after bonus is"+salary1);
//			break;
//		case "manager":
//			System.out.println("the basic salary is 176000");
//			double salary2 = 176000+176000*0.16;
//			System.out.println("the total salary after bonus is"+salary2);
//			break;
//		case "helper":
//			System.out.println("the basic salary is 145900");
//			double salary3 = 145900+(145900)*0.9;
//			System.out.println("the total salary after bonus is"+salary3);
//			break;
//			default:
//				System.out.println("invalid input");
//
//
//		}
//	}
//}



public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Enter the post:");
        String post = s.next();
        if(post.equals("MD")){
            double salary = 2300000+230000*0.2;//(2300000*20)/100
            System.out.println("Total Salary: "+salary);
        }
        else if(post.equals("CEO")){
            double salary = 250000+250000*0.2579;
            System.out.println("Total Salary: "+ salary);
        }
        else if(post.equals("MANAGER")){
            double salary = 176000+176000*0.09;
            System.out.println("Total Salary: "+salary);
        }
        else if(post.equals("HELPER")){
            double salary = 145900+145900*0.09;
            System.out.println("Total Salary: "+salary);
        }
        else{
            System.out.println("Wrong input");
        }
    }
}

