package arraywithmethod;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int array[]={4,5,6,785,5677554,3556,432,26,54,34,85,43,356665};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println("---Reverse array----------");
//        for(int i=array.length-1;i>=0;i--){
//            System.out.println(array[i]);
//        }
        System.out.println(Arrays.toString(Arrays.copyOf(array,8)));// first 8 data
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,5,10)));
        Arrays.fill(array,50);
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,5,10,400);
        System.out.println(Arrays.toString(array));
    }
}
