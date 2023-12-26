package array;
import java.util.Scanner;
public class bookpriceinarray {
    public static void main(String[] args) {

        int bookprice[] = new int[10];
        Scanner s = new Scanner(System.in);
        int  total=0;
        for(int i=0; i<bookprice.length;i++){
            System.out.println("enter the price of the 10  books");
            bookprice[i]=s.nextInt();
            total=total+bookprice[i];
        }
        int average=total/10;
        System.out.println("the total price of the book are:"+total);
        System.out.println("the average price of the book are:"+average);

        }
    }


