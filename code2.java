import java.io.*;
class ThreadDemo implements Runnable {
  
  public void run()
  { 
        System.out.println("Thread Name: "+Thread.currentThread().getName());
  }
  public static void main(String args[]){
    ThreadDemo demo = new ThreadDemo();
    Thread thread1 = new Thread(demo, "First Thread");
    Thread thread2 = new Thread(demo, "Second Thread");
    thread1.start();
    thread2.start();
 }
}
