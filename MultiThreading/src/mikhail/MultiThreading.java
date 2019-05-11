package mikhail;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.concurrent.*;

public class MultiThreading implements Runnable {
			
			public static void main(String[] args) {

		    // Five Threads are created:
	        Runnable th1 = new MultiThreading("Thread 1"); 
	        Runnable th2 = new MultiThreading("Thread 2"); 
	        Runnable th3 = new MultiThreading("Thread 3"); 
	        Runnable th4 = new MultiThreading("Thread 4"); 
	        Runnable th5 = new MultiThreading("Thread 5");       
	        
	        // Maximum size of Threadpool: 5
	        ExecutorService tp = Executors.newFixedThreadPool(5);   
	         
	        // Executes threads 
	        tp.execute(th1); 
	        tp.execute(th2); 
	        tp.execute(th3); 
	        tp.execute(th4); 
	        tp.execute(th5);  
	          
	        // Executor Service stops all Client tasks incoming 
	        tp.shutdown();
			} 

			// Declaring thread variable
		 	public String thread; 
	     
		 	// Constructor
		    public MultiThreading(String task) { 
		        thread = task; 
		    } 
		       
		    public void run() { 
		       try { 
		          // For loop iterates through each thread
		          for (int i = 0; i<=5; i++) { 
		              if (i==0) {
		            	  
		                 // Adding Date and Time for speed analysis
		                 Date d = new Date(); 
		                 SimpleDateFormat format = new SimpleDateFormat("  hh:mm:ss, yyyy/MM/dd");
		                  
		                 // Initialization of Thread, Date, and Time is printed
		                 System.out.println("Initializing: " + thread + " = " + format.format(d));  
		              } 
		              else {
		                 Date d = new Date(); 
		                 SimpleDateFormat format = new SimpleDateFormat("   hh:mm:ss, yyyy/MM/dd");
		                 
		                 // Execution of Thread, Date, and Time is printed
		                 System.out.println("Executing: "+  thread + " = " +format.format(d));      
		              } 
		              Thread.sleep(1000); 
		         } 
		         System.out.println("Completed: " + thread); 
		      } 
		      catch(InterruptedException e1) {
		    	 // Will print a Java error backtrace to the exception 
		         e1.printStackTrace(); 
		      } 
		  }     
	}
