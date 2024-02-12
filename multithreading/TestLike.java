package multithreading;

public class TestLike {
    public static void main(String[] args) {
        FacebookLike fb = new FacebookLike(1500);
   for(int i = 1; i<=10; i++) {
       Thread user1 = new Thread() {
           public void run() {
               fb.doLike();
           }
       };
       user1.start();
   }
    }
}
