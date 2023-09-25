package singleThread.KeyWords;

class SharedObject {
    private int number;
    private boolean isValueSet = false;

    public synchronized void produce(int value) {
        while (isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = value;
        isValueSet = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!isValueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + number);
        isValueSet = false;
        notify();
    }
}

public class correspond {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedObject.produce(i);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sharedObject.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
