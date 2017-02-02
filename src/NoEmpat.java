/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NoEmpat extends Thread
{
    Thread t;
    private String threadName;

    public static void main(String[] args)
    {
        NoEmpat thread1 = new NoEmpat("Thread 1");
        thread1.start();

        NoEmpat thread2 = new NoEmpat("Thread 2");
        thread2.start();
    }

    NoEmpat( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }

    public void start(String threadName)
    {        
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    public void run() {
    
      System.out.println("Running " +  threadName );
      try {
         for(int i = 0; i <= 5; i++) {
            System.out.println("Thread: " + threadName + " melakukan looping ke " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " selesai");
   }

}
