package org.example.annonyms_lamdaexpression;

public class ByLambdaExpresison {
    public static void main(String args[]){
        // Yha apn ne alg se run() ko override nhi kiya hai direct ho gya
        Runnable runnable = () ->{
            System.out.println("Thread created in FEATURE branch using Lambda");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        // join() not necessary to write here
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
