package mvc;

/* This is the Model section of the MVC, it contains the data needed for the 
 * program to work properly. It does not call any other classes, however, it 
 * affects the View class through the Controller class that handles the data 
 * correctly. 
 * 
 * Update: The Model class controls the update of the username and password variables.
 * Here are two getter and setter methods that facilitate that function. 
 */
public class Model{
	
	// The two core variables
	private String username;
	private String password;;
	
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
} 


