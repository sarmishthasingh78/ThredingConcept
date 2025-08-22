package org.example.threadCreations;

import java.util.concurrent.*;
public class ExecutorThread {
    public static void main(String args[]){
       ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 1;i<=5;i++){
            int threadId = i;
            service.submit(() -> {
                System.out.println(threadId + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}
