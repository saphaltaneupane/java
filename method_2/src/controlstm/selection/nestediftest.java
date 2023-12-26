package method_2.src.controlstm.selection;
import java.util.*;
public class nestediftest {
public static void main(String [] args) {
	/*
	 * syntax:
	 * if(condition1){
	 * if(condition2){
	 * 
	 * }
	 * else()
	 * }
	 * else{}
	 */
//	String citizen="nepali";
//	int age=33;
//	boolean haveVoteId=true;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the citiaenship nationality");

	String citizen= s.next();
	System.out.println("Enter your age:");
	int age =s.nextInt();
	System.out.println("Do you have voterID?");
	boolean haveVoteID =s.nextBoolean();
	
	if(citizen.equals("nepali"))// method for string 
	{
		if(age>18) {
		if(haveVoteID) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("you dont have voter id");
		}
		}
		else {
			System.out.println("you are under age");
		}
}
	else {
		System.out.println("invalid citizenship");
	}
	}
}
