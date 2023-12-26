package method_2.src.looping;

public class JumpingTest {
	/*  for loop method bitra hunxa method class bitra 
	 * 1>break; exit from loop 
	 * 2>continue:  skip 
	 * 3>return     : exist from method , it doesnt need loop*/
	public static void  main(String args[]) {
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
//				break;
				// continue;
				return ;// main method return hunxa ; main method jvm ma return hunxa
				// cant be written any after these words
			}
			System.out.println(i);
		}
		System.out.println("end for loop");
	}

}
