package Methods_In_Java;

public class methodTest{
    public static void main(String[] args) {
        sum(12,56);
        int x = sum2(2,5);
        System.out.println(x);
    }
    public static void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static int sum2(int a,int b){
        return a*b;
    }
    public static void divide(){
        sum(5,6);
       int y=  sum2(5,6);
    }
}
