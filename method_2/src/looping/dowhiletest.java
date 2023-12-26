package method_2.src.looping;

public class dowhiletest {
	/*
	 * syntax: 
	 * do{
	 *staements 
	 *increment/decrement
	 *}while(condition); // post increment
	 */
	public static void main(String[] args) {
	  int n=9;
	  int i=1;
	  
	  do {
	  System.out.println(n+"x"+i+"="+(n*i));
	  
	  
	  i++;
	  }while(i<=10);
	  
	  
	}

}
