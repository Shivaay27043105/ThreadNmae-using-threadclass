import java.io.*;
class ThreadNaming extends Thread {
  ThreadNaming(String name)
    {
      super(name);
    }
    @Override public void run()
    {
        
        System.out.println("Thread is running.");
    }
}
class mainMethod {
  
   
    public static void main(String[] args)
    {
  
        // Creating two threads
        ThreadNaming thread1 = new ThreadNaming("shivam");
        ThreadNaming thread2 = new ThreadNaming("shukla");
  
        // Getting the above created threads names.
        System.out.println("Thread 1: " + thread1.getName());
        System.out.println("Thread 2: " + thread2.getName());
  
        // Starting threads using start() method
        thread1.start();
        thread2.start();
    }
}
