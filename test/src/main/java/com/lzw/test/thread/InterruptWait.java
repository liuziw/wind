package com.lzw.test.thread;

public class InterruptWait {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread1 thread1 = new Thread1(lock);
        thread1.start();
        Thread.sleep(3000);
        thread1.interrupt();
    }

    public static class Thread1 extends Thread {
        private Object lock;

        public Thread1(Object lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                System.out.println("wait start...");
                try {
                    lock.wait();
                    System.out.println("wait end...");
                } catch (InterruptedException e) {
                    System.out.println("wait 打断了");
                    e.printStackTrace();
                }
            }
        }

    }
}
