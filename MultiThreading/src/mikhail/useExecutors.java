package mikhail;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* This class was designed to show how 
 * executors are used to create and run threads 
 * using a Runnable and ExecutorService. 
 */
public class  useExecutors {
	
	public static void main(String args[]) {
		
	System.out.println("  ***ExecutorService Threads***");
		
	// Cached Thread Pool to create the necessary threads
	ExecutorService tp = Executors.newCachedThreadPool();		
	
	// Runnable will allow the Executor Service to run the threads
    Runnable iterator = new Runnable() {	
       public void run() {
    	   
    	  // Get name and ID of the exact thread 
          String thread = Thread.currentThread().getName();
          
          // FOR loop that outputs the threads
          for (int i = 1; i <= 5; i++) { 
        	  System.out.println("     " + thread + " = " + i);
          }
       }
   };
   
   { for (int i = 0; i < 5; i++ ) {
    	// Executing 1 Pool and 5 Threads
    	tp.execute(iterator);
   }
        // Shutdown executor to prevent system crash
        tp.shutdown();
   }  
}
}