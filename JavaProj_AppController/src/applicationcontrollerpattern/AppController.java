package applicationcontrollerpattern;

/*
 * This is the Controller part of the program.
 * The request of the user is tracked and sent to the Dispatcher class.
 * The required data is returned and output to the Main.
 * This class handles all system requests. 
 */

public class AppController {
	
	// Creates dispatcher variable from Dispatcher Class
   private Dispatcher dispatcher;

   // Connect dispatcher variable to class
   public AppController() {
	   dispatcher = new Dispatcher();
   }
   
   // Method notifies when the program commences
   private void startReq() {
	   System.out.println("\nStarting request...\n");
   }
   
   // Output for requested student
   private void trackReq(String req) {
	   System.out.println("Student requested: " + req);
   }
   
   // Method notifies when the program is completed
   private void endReq() {
	   System.out.println("\nEnding request...");
   }
   
   // Complete output method
   public void outputReq (String req) {
	   startReq();
	   trackReq(req);
	   dispatcher.dispatch(req);
	   endReq();
   }
}
