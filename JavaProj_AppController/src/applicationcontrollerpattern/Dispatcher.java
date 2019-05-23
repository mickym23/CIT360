package applicationcontrollerpattern;

/*
 * This is the Dispatcher part of the program.
 * This is designed to connect all the separate helper classes. 
 * It collects all the data from the various classes and moves it to 
 * the AppController class to handle it (the data) further. 
 */

public class Dispatcher {

	// Variables are created for each class
	private Suits_Rating Suits;
	private Lost_Rating Lost;
	private TWD_Rating TWD;
	private NCIS_Rating NCIS;
	
	// Connect the new variables to their classes 
	public Dispatcher() {
		Suits = new Suits_Rating();
		Lost = new Lost_Rating();
		TWD = new TWD_Rating();
		NCIS = new NCIS_Rating();
	}
	
	// Determines which request the user enters
	public void dispatch(String req) {
		
		// equalsIgnoreCase method is used to make it easier for user input
		if (req.equalsIgnoreCase("Suits")) {
			Suits.show();
		} else if (req.equalsIgnoreCase("Lost")) {
			Lost.show();
		} else if (req.equalsIgnoreCase("TWD")) {
			TWD.show();
		} else  {
			NCIS.show();
		}
	}
}
