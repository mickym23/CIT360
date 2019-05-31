package mvc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller{
	
	/* This is the Controller class of the MVC Pattern. Here all the 
	 * data is trafficked through from the Model to the View. It holds the 
	 * MVC together and connects between all the various classes. 
	 */
		// Input 
		Scanner input = new Scanner(System.in);
	
	 	// Connects variable view to the View class
		View view = new View();	
		
		// Connects variable model to the Model class
		Model model = new Model();	
		
		// This method runs though the whole process needed for login
		public void loginProcess() {
				
			// Get file's name
			System.out.print("Please enter your file name: ");
			String filename = input.nextLine();
				
			// Create the file and ArrayList to store read data
			@SuppressWarnings("unused")
			File file = new File(filename);
		    ArrayList<String> stringarray = new ArrayList<String>();
		 
		    try {
		    	// BufferedReader created for file
		        BufferedReader buffr = new BufferedReader(new FileReader(filename));
			        
		        // Variable where the data will be added
		        String line;
			        
			    // While loop that determines if there is data to be copied 
		        // and adds it to line variable
			    while((line = buffr.readLine()) != null) {
	        	    stringarray.add(line);
	        	    }
			        	buffr.close();
			        } catch (FileNotFoundException e) {
			            System.err.println("File not found");
			            System.exit(1);
			        } catch (IOException e) {
			            System.err.println("Unable to read the file.");
			            System.exit(1);
			        }
			    
			    // Username login details:
				System.out.print("Please enter your username: ");
				String username = input.nextLine();
				
				// Password login details: 
				System.out.print("Please enter your password: ");
				String password = input.nextLine();
				
				// IF loop that determines if the login details are identical to the file's data
				// This is case-sensitive providing greater security
				if (username.equals(stringarray.get(0)) && password.equals(stringarray.get(1))) {
					System.out.print("User Authenticated.");
				} else {
					System.err.print("Access Denied.");
				}	
				}
			
		// This method allows the user to create an account attached to a file
		public void accountProcess() {
				
			// Ask to enter a username:
			System.out.print("Please enter your new username: ");
		    String username = input.nextLine();
			    
		    // Ask to enter a password:
		    System.out.print("Please enter you new password: ");
		    String password = input.nextLine();
			    
		    // Use the Setter and Getter method for the username
		    model.setUserName(username);
		    String userName = model.getUserName();
			    
		    // Use the Setter and Getter method for the password
		    model.setPassword(password);
		    String passWord = model.getPassword();
			    
		    // Used a HashMap to connect the username and password
		    HashMap<String, String> map = new HashMap<String, String>();
		    map.put(userName, passWord);
				
		    // Update user on username and password choices
		    for (@SuppressWarnings("unused") Map.Entry<String, String> out:map.entrySet()) {
		    	System.out.println("\nNew username: " + userName + "\n" 
		        + "New password: " + passWord);
		    }
			    
		    // ask the user to write a file name to store the username and password
		    System.out.print("Please enter a file name: ");
			String fileName = input.nextLine();
				
			// Create file
			java.io.File file = new java.io.File(fileName);
			if (file.exists()) {
				System.err.println("Error: File already exists!");
				System.exit(1);
				}
			try {
				// Print data to the file
				PrintWriter out1 = new PrintWriter(file);
				out1.println(userName);
				out1.println(passWord);
				out1.close();
			} catch (FileNotFoundException e) {
				System.err.println("File Not Found!");
				System.exit(1);
			}
			input.close();
			}
		
	public Controller() {

	// IF statement that receives a response from the 
	// View for user choice and calls the respective method
	if (view.Choice() == 1) {
		loginProcess();
		view.updateView();
	} else {
		accountProcess();
		view.updateView();
	}
  }
}