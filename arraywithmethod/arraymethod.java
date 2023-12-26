package arraywithmethod;
// tyo int further use baneko area of cube and volume nikalda garney
import java.util.Arrays;
public class arraymethod {
    /*
     * ---------Array with method---------
     * 1>array as argument
     * void add(int a[]){}
     * 2> array as returnType:
     * int[] get10Intvalues(){
     * // array=343,565,6777,456,4566
     * return array;*/
    public static void main(String[] args) {

        int array[] = {3, 4, 5, 6, 7, 8, 8, 8, 9};
        sum(array); // anonomos array sum(new int[] {7,5,6,7,7,6,7,8});
        int[] odds = getOddNumsFrom1to100();
        System.out.println(Arrays.toString(odds));

    }

    //-------array as arguments-------------
    static void sum(int values[]) {
        int s = 0;
        for (int x : values) {
            s += x;// array processing,read,write garna
        }
        System.out.println("total:" + s);
    }

    //------array as return type---------
    static int[] getOddNumsFrom1to100() {
        int oddnums[] = new int[50];
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddnums[j] = i;
                j++;
            }
        }
        return oddnums;
    }
}
