package org.example.threadSafty;

public class WithoutSynchronization {
    public static void main(String args[]) throws InterruptedException {
        Counter1 c = new Counter1();

        Thread t1 = new Thread(() ->{
            for(int i = 1; i <= 1000;i++){
                c.MyCount();
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i =1; i <= 1000;i++){
                c.MyCount();
            }
        });
        t1.start();
        t2.start();
        t1.join();           // Yha join() isly use kr rhe nhi to main method phle he execute ho jayega
        // thread se phle
        t2.join();

        System.out.println("final count "+ c.count);
    }

}

class Counter1{
    int count = 0;
    public void MyCount(){
        count++;
    }
}
