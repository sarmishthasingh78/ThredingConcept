package org.example.threadCreations;

public class ByThreadClass extends Thread{
   public void run(){

       for(int i = 1; i <= 5; i++){
           System.out.println(i);
           System.out.println(Thread.currentThread().getName());
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }
   public static void main(String args[]){
       ByThreadClass b1 = new ByThreadClass();
       b1.start();
       // System.out.println("Testing the join method");
       try {
           b1.join(500000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Testing the join method");
   }
}
