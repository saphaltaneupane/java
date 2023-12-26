package method_2.src.controlstm.selection;
import java.util.Scanner;
public class laddertest {
	public static void main (String [] args) {
		/*
		 ..........Syntax...........
		 if(){
		 }
		 else if(){
		 }
		 else{}
		 */
		/*
		 * units             feee
		 * 80                  no charge
		 * 80-150            5
		 * 151-250           7
		 * 251-300           10
		 * 350 -above        12
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the unit:");
		int units = s.nextInt();
		if(units<80) {
			System.out.println("no charge");
		}
		else if(units>=80 && units<=150){
			System.out.println("charge is 5");
	
		}
		else if(units>=151 && units<=250) {
			System.out.println("charge is 7");
		}
		else if(units>=251 && units<=300) {
			System.out.println("charge is 10");
		}
		else {
			System.out.println("12 rupess");
		}
	}

}
