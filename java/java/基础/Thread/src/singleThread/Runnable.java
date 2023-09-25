package singleThread;

class MyRunnable extends Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class Runnable {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new MyRunnable().toString());
        thread2.start(); // 启动线程
    }
}
