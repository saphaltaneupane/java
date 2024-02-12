package multithreading;

public class FacebookLike {
    private int like;
    public FacebookLike(int like){
        this.like=like;

    }
    public  synchronized void doLike(){ // at a time one thread use this method
        // euta thread le euta le matrai use garna milxaa
        like++;
        System.out.println("like"+like);
        try{
            Thread.sleep(500);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
