package arraywithmethod;
//Write a Java program that defines a method called findAverage which takes an array of integers as a parameter and returns
//        the average of the elements in the array. Also, implement a main method to test your findAverage method with an array of integers.
public class pratice2 {
    public static void main(String[] args) {
        int array[]={2,4,6};
       int a =findAverage(array);
       System.out.println(a);


    }
    static int findAverage(int array[])
    {
        int sum=0;
        for(int i =0;i<array.length;i++){
            sum=sum+array[i];
        }
        int average=sum/array.length;
        return average;
    }
}
