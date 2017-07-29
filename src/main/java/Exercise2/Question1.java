package Exercise2;

public class Question1 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printOdd());
        thread1.start();
        Thread thread2 = new Thread(() -> printEven());
        thread2.start();
    }

    public static void printOdd() {
        for (int i=1; i<=10; i+=2)
            System.out.println(Thread.currentThread().getName() + "Odd" + i);
    }

    public static void printEven(){
        for (int i=2; i<=10; i+=2)
            System.out.println(Thread.currentThread().getName() + "Even" + i);
    }
}
