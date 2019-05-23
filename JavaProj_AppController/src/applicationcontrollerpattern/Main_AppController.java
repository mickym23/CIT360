package applicationcontrollerpattern;

import java.util.Scanner;

/*
 * This aim of this Application Controller program is to show the 
 * different sections: Controller, View, Dispatcher, and Helper.
 * Each class will be defined to which role it plays in the program.
 */

public class Main_AppController {

/*
 *  This is the main args class that is the View for the Application Controller Program.
 * It calls the AppController and eventually the Dispatcher class for their elements. 
 */
	
	public static void main(String[] args) {
		// Input
		Scanner input = new Scanner(System.in);
		
		// Asking the user for input for the different ratings
		System.out.print("Please enter (Suits, TWD, Lost, or NCIS) for their reviews: ");
		
		// Creates 'app' from AppController class
		AppController app = new AppController();
		
		// This calls the dispatchReq method and outputs the request the user asked for
     	app.dispatchReq(input.next());
     	
     	// Resource leak is closed
		input.close();
	}

}
