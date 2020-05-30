package com.lzw.test.thread.deadLock;

public class Thread0 extends Thread {

    private DeadLock deadLock;

    public Thread0(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    public void run() {
        try {
            deadLock.leftRight();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
