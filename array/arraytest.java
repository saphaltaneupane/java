package array;
import java.util.Scanner;
public class arraytest {

    public static void main(String[] args) {
//        // create array
        int age[] = new int[5];
//        // write data in array
////        age[0]=20;
//        for(int i=0;i< age.length;i++){
//            age[i]=20;
//        }
//
//        // read data from array
//        for(int x:age){
//            System.out.println(x); //sout enter
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < age.length; i++) {
            System.out.println("enter age:");
            age[i] = s.nextInt();

        }
        for (int x : age) {
            System.out.println(x);
        }
    }
}
/*1st iteration
  x = age[0];
  2nd iteration

  x = age[1];
  x = age[2];
 */