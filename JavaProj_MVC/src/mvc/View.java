package mvc;

import java.util.*;

/* This is the View class of the MVC Pattern, here all the necessary 
 * information is displayed to the user. Main interaction is done from here.
 */
public class View {
	
	// No-args Constructor
	public View () {
		
	}
	
	// This displays the choice given to the user to log in or create an account
	public int Choice() {
		System.out.print("Please enter \"1\" to log in or \"2\" to create an account: ");
		Scanner input = new Scanner(System.in);
		int numChoice = input.nextInt();
		return numChoice;
	}
	
	// This helps me keep track of when the end of the program has been reached
	// It notifies that the MVC has been updated.
	public void updateView() {
		System.out.println("\nView has been updated!");
	}
}

