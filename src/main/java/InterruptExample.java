/**
 * Created by ttnd on 21/07/17.
 */
public class InterruptExample  {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> print(), "Child");
        t.start();
        Thread.sleep(100);
        t.interrupt();
        System.out.println(Thread.currentThread().getName()+" :: Execution complete..");
    }
    public static synchronized void print(){
        while(!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName()+" Active...");
        }
    }
}
