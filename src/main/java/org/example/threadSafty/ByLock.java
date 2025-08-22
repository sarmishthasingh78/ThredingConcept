package org.example.threadSafty;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ByLock {                       // For a advanced thread safety in java

     public static void main(String args[]) throws InterruptedException {
         Counting c = new Counting();
         Thread t1 = new Thread(() -> {
             for (int i = 1; i <= 1000; i++) {
                 c.MyCounting();
             }
         });

         Thread t2 = new Thread(() -> {
             for (int i = 1; i <= 1000; i++) {
                 c.MyCounting();
             }
         });

         t1.start();
         t2.start();
         t1.join();
         t1.join();
         System.out.println("Final count = "+ c.count);
     }
}

class Counting{
    private Lock lock = new ReentrantLock();
    int count = 0;
     void MyCounting(){
        lock.lock();
        try{
            count++;
        }
        finally {
           lock.unlock();
        }

    }
}
