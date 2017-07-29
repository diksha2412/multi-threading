/**
 * Created by ttnd on 15/07/17.
 */
public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("Hiii, thread is running !");
        for (int i=1;i<=20; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        new MyThread().start();
    }
}
