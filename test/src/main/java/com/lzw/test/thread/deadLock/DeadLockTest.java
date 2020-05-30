package com.lzw.test.thread.deadLock;

public class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {
        DeadLock deadLock = new DeadLock();
        Thread0 thread0 = new Thread0(deadLock);
        Thread1 thread1 = new Thread1(deadLock);
        thread0.start();
        thread1.start();
    }
}
