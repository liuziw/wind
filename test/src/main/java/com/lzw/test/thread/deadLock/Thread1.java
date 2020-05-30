package com.lzw.test.thread.deadLock;

public class Thread1 extends Thread {

    private DeadLock deadLock;

    public Thread1(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    public void run() {
        try {
            deadLock.rightLeft();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
