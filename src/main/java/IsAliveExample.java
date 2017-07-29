/**
 * Created by ttnd on 21/07/17.
 */
public class IsAliveExample extends Thread {

    public void run()
    {
        System.out.println("r1 "+Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ie) { }
        System.out.println("r2 "+ Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        IsAliveExample t1=new IsAliveExample();
        IsAliveExample t2=new IsAliveExample();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive()+Thread.currentThread().getName());
        System.out.println(t2.isAlive()+Thread.currentThread().getName());
    }
}
