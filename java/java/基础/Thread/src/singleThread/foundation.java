package singleThread;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1: " + i);
        }
    }
}

public class foundation {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start(); // 启动线程
    }
}

