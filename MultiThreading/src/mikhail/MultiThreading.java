package mikhail;

public class MultiThreading {
	
	/* This program shows incrementing threads.
	 * It shows each thread as they are created and completed.
	 * Several exceptions can be thrown and are accounted for.
	 */
	
	// Thread output: name + value
	 public static void threadOut(int increment) {
		String thread = Thread.currentThread().getName();
		System.out.println(thread + "'s Current Increment: " + increment);
	 }
		
	 // Runnable interface used
     private static class threadLoop implements Runnable {
	 public void run() { 
		 try {
			 // integer array used as increment, couldn't figure out
			 // how to add it using a FOR loop
			int[] loop = {
					0,
					1, 
					2,
					3,
					4,
					5,
					6,
					7,
					8,
					9,
					10
		};
		try {
			// Passes the increment value to the output method at 1 second intervals
			for (int i = 0; i < loop.length; i++) {
				Thread.sleep(1000);
				threadOut(loop[i]);
			}
		// Two possible exceptions dealt with	
		} catch (InterruptedException e) {
			System.err.println("Error: Not completed.");
		}
	  } catch (RuntimeException e) {
		  System.err.println("Something went wrong!");
	  }
		 
    }
}
     
    // Main method organizes the order in which everything runs
	public static void main(String[] args) {
      System.out.println("Beginning Thread Increments");
      
      // Creates new threadLoop class and initiates it
      Thread thread = new Thread(new threadLoop());
      thread.start();
      while (thread.isAlive()) {
         System.out.println("\tInitiating!");
         try {
        	// Join method waits until the previous thread is completed 
			thread.join(700);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
     System.out.println((" Threads Successfully Completed."));
	}
} 