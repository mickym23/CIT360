package applicationcontrollerpattern;

import java.util.Scanner;

/*
 * This aim of this Application Controller program is to show the 
 * different sections: Controller, View, and Dispatcher.
 * Each class will be defined to which role it plays in the program.
 */

public class Main_AppController {

/*  This is the Main class that is the View for the Application Controller Program.
 *  It calls the AppController and eventually the Dispatcher class for its elements. 
 */
	
	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tStudent I-Number Requester");
		
		// Asking the user for input for the different students
		System.out.print("Enter student (Adam, Joseph, Kelly, Marie, Powell) name: ");
		
		// Creates AppController class access
		AppController app = new AppController();
		
		// This calls the outputReq method and displayed the required data
     	app.outputReq(input.next());
     	
     	// Resource leak is closed
		input.close();
	}
}
