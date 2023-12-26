package method_2.src.looping;

public class fortest {
	/*  --------------------forloop----------
	 * Syntax: 
	 * for(initialization; condition; inc/dec)*/
	public static void main(String[] args) {
//		int sum=0;
//		for(int i=1;i<=100;i++) {
////			System.out.println("hello world");
//			sum=sum+i;
//		}
//		System.out.println("sum is"+sum);
		// sum of odd and even numbers
		int sumodd=0;
		int sumeven=0;
		for(int i =1;i<=100;i++ ) {
			if(i%2==0) {
				sumeven=sumeven+i;
			}
			else {
				sumodd=sumodd+i;
			}
		}
		System.out.println("sumodd:"+sumodd);
		System.out.println("sumeven:"+sumeven);
		
	}

}
