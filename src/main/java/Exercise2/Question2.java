package Exercise2;

public class Question2 extends Thread {

    static int noOfThreads = 4;

    public static void main(String[] args) {
        for (int i=1; i<=noOfThreads; i++) {
            new Question2().start();
        }
    }

    @Override
    public void run() {
        for (int j=1; j<=10; j=j+noOfThreads)
            System.out.println(Thread.currentThread().getName() + ":" + j);
    }
}
