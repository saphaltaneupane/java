package multithreading;

public class TestThread  extends Thread{
    public void run(){
        System.out.println("From thread class");
    }

    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start(); // it calls  run methods
        System.out.println(".....from main thread");
    }
}
