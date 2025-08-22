package org.example.annonyms_lamdaexpression;

public class ByAnnonyms {
    public static void main(String args[]){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Created Thread my annonymas class");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
