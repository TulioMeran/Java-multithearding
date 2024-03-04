package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyMultiTheardingClass myMultiThread = new MyMultiTheardingClass();
        MyMultiThreadingClass2 myMultiThread2 = new MyMultiThreadingClass2();
        Thread myThread = new Thread(myMultiThread2);
        myMultiThread.start();
        myThread.start();
    }
}