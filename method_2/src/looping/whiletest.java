package method_2.src.looping;

public class whiletest {
	/* 
	 * syntax :
	 * while(condition)
	 * {
	 // statements
	  inc/dec */
	public static void main(String[] args) {
		int n=6;
		int fact=1;
		while(n>1) {
			fact=fact*n;
			n--;
		}
		System.out.println("Result:"+fact);
	}

}
