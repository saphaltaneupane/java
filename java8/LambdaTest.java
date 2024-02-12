package java8;
//interface Test{
//    void print();
//}
//interface Test{
//    void print( int a,int b);
//}
interface Test{
    int print( int a,int b);
}
//class TestImpl implements Test{
//   public void print(){
//       System.out.println("from impl class");
//    }
//public void print(){
//    System.out.println("from impl class");
//}
//}
public class LambdaTest {
    //for implementing functional interface
    //  euta matrai abstract method bako
    public static void main(String[] args) { // anonymous class
//        Test t = new TestImpl();
//        t.print();
//        Test t1 = new Test(){
//            public void print(){
//                System.out.println("from anonymous class");
//            }
//        };
//        t1.print();
        // type 1
//        Test t1 = ()->{
//            System.out.println("from lambda");
//        };
//        t1.print();
        //type 2:
//        Test t1 = (a)->{
//            System.out.println("from lambda");
//        };
//        t1.print(10);
//        Test t1 = (a,b)->{
//            int s =a+b;
//            System.out.println(s);
//            System.out.println("from lambda");
//        };
//        t1.print(10,20);

        
//        type 3:
//        Test t1 = (a,b)->{
//            int s =a+b;
//            return s;
//
//        };
//        t1.print(10,20);
//        System.out.println("result:"+s);
    }
}
