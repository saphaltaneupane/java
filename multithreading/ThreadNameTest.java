package multithreading;

public class ThreadNameTest extends Thread {
    public void run(){
        System.out.println("Name "+Thread.currentThread().getName());
        System.out.println("priority"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadNameTest t1= new ThreadNameTest();
        ThreadNameTest t2= new ThreadNameTest();
        ThreadNameTest t3= new ThreadNameTest();
        t1.setName("1st thread");
        t2.setName("2nd thread");
        t3.setName("3rdthread");
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);//starts from you but while running next time aru feri  j ma ni aauna sakxaa Input priority ho
        t1.start();
        t2.start();
        t3.start();

    }
}
