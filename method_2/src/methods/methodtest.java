package method_2.src.methods;

public class methodtest {
public static void main(String [] args) {
	// int a=s.nextInt(); tankey bata  dhara bata bucket
	/* 
	 * -------no return with no arguments--------
	 * */
	sum();
	printTable(34);
	 int x=getSumOf1to100(); // switch ma pass garna if else
	 System.out.println("sum"+x);
	 int a = findsmallestvalue(5, 6);
	 System.out.println(a);
}
 static void sum() { // object banaunu na paros banera static banako 
	int x =343; // scanner can be entered in methods too 
	int y = 600;
	int s= x+y;
	System.out.println(s);
	
}
//2. no return type with arguments------------
	/* 
	 *  */
	 static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+""+i+"="+(n*i));// data jaha hunxa tei scanner input
		}
	}
	// 3. return type with no arguments
	 static int  getSumOf1to100() {
		int s=0;
		for(int i=1; i<=100; i++) {
			s=s+i;
		}
		return s;
	}
	/* 4> return type with arguments
	 * */
	 static int findsmallestvalue(int x, int y) {
		 if(x<y) {
			 return x;
		 }
		 else {
		 return y;
		 }
	 }
}
