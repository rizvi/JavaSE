/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package books.java.concurrency;

/**
 *
 * @author Masudul Haque
 */
public class NoVisibility {

    /**
     * @param args the command line arguments
     */
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
            }
        
    }

    public static void main(String[] args) {

        for (int i = 0; i <100; i++) {
            new ReaderThread().start();
        }
        number = 42;
        ready = true;
    }

}
