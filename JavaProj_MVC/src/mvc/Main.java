package mvc;

import mvc.Controller;
import java.util.InputMismatchException;
	public class Main {
		
		/* This is the Main class that contains the main method. 
		 * The main method creates a new Controller object: control. 
		 * the purpose of this is to initiate the Controller to mediate between the 
		 * Model and View classes. 
		 * More simply put, Main -> Controller -> Model -> Controller-> View
		 */
		
		public static void main(String[] args)  throws InputMismatchException{ 
			try {
			@SuppressWarnings("unused")
			Controller control = new Controller();
			} catch (InputMismatchException e) {
				System.err.println("Please enter a valid number!");
			}
	    }
} 

