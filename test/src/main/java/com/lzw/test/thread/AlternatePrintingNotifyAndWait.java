package com.lzw.test.thread;

public class AlternatePrintingNotifyAndWait {

    private static Object lock = new Object();
    private static int i;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (i % 2 == 1) {
                        System.out.println("奇数线程打印：" + i++);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread threadB = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (i % 2 == 0) {
                        System.out.println("偶数线程打印" + i++);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
