package arraywithmethod;
import java.util.Scanner;
public class multidarray {
    /*---------multiarray-----
     *  #use to manage data in row and column or matrix form
     * syntax:
     *  data_type array_name[][] = new data_tyoe [row][column]*/
    public static void main(String[] args) {
        int mat[][] = new int[2][2];
        Scanner s = new Scanner(System.in);
        // write data
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("enter the value for mat:");
                mat[i][j] = s.nextInt();

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(mat[i][j] + "");
            }
            System.out.println();
        }
    }
}

