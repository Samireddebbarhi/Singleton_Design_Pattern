package com.example.samir;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Runnable r1 = () -> {
            DBConnection.getInstance("Thread 1");
        };
        Runnable r2 = () -> {
            DBConnection.getInstance("Thread 2");
        };
        Runnable r3 = () -> {
            DBConnection.getInstance("Thread 3");
        };
        Runnable r4 = () -> {
            DBConnection.getInstance("Thread 4");
        };
             Thread t1 = new Thread(r1);
             Thread t2 = new Thread(r2);
             Thread t3 = new Thread(r3);
             Thread t4 = new Thread(r4);

             t1.start();
             t2.start();
             t3.start();
             t4.start();
    }
}