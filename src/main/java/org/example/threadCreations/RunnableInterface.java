package org.example.threadCreations;

public class RunnableInterface implements Runnable{
    @Override
    public void run(){
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String args[]){
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread  t1 = new Thread(runnableInterface);
        t1.start();
    }
}
