package applicationcontrollerpattern;
/*
 * @author Mikhail
 */
public class AppController {
   private Dispatcher dispatcher;
   
   public AppController() {
	   dispatcher = new Dispatcher();
   }
   
   private boolean isAuthenticUser() {
	   System.out.println("User authenticated.");
	   return true;
   }
   
   private void trackRequest(String request) {
	   System.out.println("Review requested: " + request);
   }
   public void dispatchReq (String request) {
	   trackRequest(request);
	   
	   if (isAuthenticUser()) {
		   dispatcher.dispatch(request);
	   }
   }
}
