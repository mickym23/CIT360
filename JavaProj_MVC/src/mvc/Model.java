package mvc;

import java.io.*;
import java.util.*;

/* This is the Model section of the MVC, it contains the data needed for the 
 * program to work properly. It does not call any other classes, however, it 
 * affects the View class through the Controller class that handles the data 
 * correctly. Two large methods were created to allow for user choice in View.
 */
public class Model{
	
	// The two core variables
	private String username;
	private String password;
	
	// Create Scanner input for methods
	Scanner input = new Scanner(System.in);
	
	// No-args Constructor
	public Model () {
		
	}
	
	// username Getter method
	public String getUserName() {
		return username;
	}
	 
	// username Setter method
	public void setUserName(String username) {
		this.username = username;
	}
	
	// password Getter method
	public String getPassword() {
		return password;
	}
	
	// password Setter method
	public void setPassword(String password) {
		this.password = password;
	}	
	
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
	    setUserName(username);
	    String userName = getUserName();
	    
	    // Use the Setter and Getter method for the password
	    setPassword(password);
	    String passWord = getPassword();
	    
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
			e.printStackTrace();
			System.exit(1);
		}
		input.close();
	}
} 


