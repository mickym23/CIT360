package mvc;

public class Controller{
	
	/* This is the Controller class of the MVC Pattern. Here all the 
	 * data is trafficked through from the Model to the View. It holds the 
	 * MVC together and connects between all the various classes. 
	 */
	
	public Controller() {
	
    // Connects variable view to the View class
	View view = new View();	
	
	// Connects variable model to the Model class
	Model model = new Model();	
	
	// IF statement that receives a response from the 
	// View for user choice and calls the respective method
	if (view.Choice() == 1) {
		model.loginProcess();
		view.updateView();
	} else {
		model.accountProcess();
	    view.updateView();
	}
  }
}
