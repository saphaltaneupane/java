package Methods_In_Java;
import java.util.Scanner;
public class Type2Method {
    public static void main(String[] args) {

        //for taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which table is to be calculated:");
        int x = sc.nextInt();
        printTable(x);//n is the argument hai
    }
    //no return type with arguments
    static void printTable(int n){
        for(int i =1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+ (n*i) );
        }
    }
}
