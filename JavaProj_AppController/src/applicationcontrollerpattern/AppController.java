package applicationcontrollerpattern;

/*
 * This is the Controller part of the program. 
 * Here, the program determines if the user authenticated (This can be done more professionally
 * by adding a HashMap and connecting usernames and passwords.)
 * The request of the user is also tracked and is output to the console.
 * This class handles all system requests. 
 */

public class AppController {
	
	// Creates dispatcher variable from Dispatcher Class
   private Dispatcher dispatcher;

   // Connect variable to its class
   public AppController() {
	   dispatcher = new Dispatcher();
   }
   
   // Verifies that the user has been authenticated
   private boolean Authenticated_User() {
	   System.out.println("User authenticated.");
	   return true;
   }
   
   // Output for requested rating
   private void trackReq(String req) {
	   System.out.println("Review requested: " + req);
   }
   
   // Method used to send the necessary output to the View
   public void dispatchReq (String req) {
	   trackReq(req);
	   
	   if (Authenticated_User()) {
		   dispatcher.dispatch(req);
	   }
   }
}
