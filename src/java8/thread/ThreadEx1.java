package java8.thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

//        t1.run();
//        t2.run();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(currentThread().getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
