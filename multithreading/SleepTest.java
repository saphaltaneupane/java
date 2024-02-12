package multithreading;

public class SleepTest extends Thread{
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepTest t1 = new SleepTest();
        SleepTest t2 = new SleepTest();
        SleepTest t3 = new SleepTest();
        t1.start();
        t1.join();//  first ma yesto sab execute garxaa
        t2.start();
        t3.start();
    }
    }

