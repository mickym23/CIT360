package acp;

import java.util.HashMap;
import java.util.Scanner;

/* This program is designed to display the uniqueness of using a 
 * HashMap in the Application Controller Pattern. There is a separate handler 
 * program that uses the Helper classes connect together to display the result. 
 */

/* This is the ACP class, here the main method is found. It is the 
 * main interface which the user interacts with. Here, it calls methods from 
 * the App class which outputs to the display. 
 */
public class ACP {

	// out variable created to connect to App class
	@SuppressWarnings("unused")
	private static App out;

	public static void main(String[] args) {
		// input
		Scanner input = new Scanner(System.in);
		
		// connect to the App class
		out = new App();
		
		// Filler variables to initialize the method.
		String brand = "Test";
		int price = 0;
		int speed = 0;
		String req;
		
		System.out.println("\t\t\tSupercar Showroom");
		
		// Ask the user for car brand input
		System.out.print("Enter a car brand(Ferrari, Bugatti, Aston Martin, or Mercedes): ");
		req = input.nextLine();
		
		// Outputs the user's request
		System.out.println("\n\t\t\tCar requested: " + req);
		
		// Call the handleCommand method from the App class
		App.handleCommand(req, brand, price, speed);
		
		input.close();
	}
}

/* This class acts as the Controller section of the program.
 * Here, the HashMap is created and connected to the various Helpers classes
 * It also calls the Handler interface to execute the classes. 
 */
class App {
	
	// public HashMap is created
	public static HashMap<String, HandleReq> m = new HashMap<String, HandleReq>();
	
	// No-args constructor
	public App () {
		
	}
	
	// method that connects the user input to the required Helper class' methods
	public static void handleCommand(String req, String brand, int price, int speed) {
		m.put("Ferrari", new Ferrari());
		m.put("Bugatti", new Bugatti());
		m.put("Aston Martin", new AM());
		m.put("Mercedes", new Mercedes());
		
		// execute the needed class
		HandleReq handle = m.get(req);
		handle.execute(brand, price, speed);
	}
}

/* Helper class that outputs Ferrari's specifications */
class Ferrari implements HandleReq {
	public void execute(String brand, int price, int speed) {
		brand = "2018 Ferrari 812 Superfast";
		price = 335275;
		speed = 211;
		System.out.println("\n\t\t\tCar: " + brand);
		System.out.println("\n\t\t\tPrice: $" + price + " (US Dollars)");
		System.out.print("\n\t\t\tTop speed: " + speed + "mph");
	}
}

/* Helper class that outputs Bugatti's specifications */
class Bugatti implements HandleReq {
	public void execute(String brand, int price, int speed) {
		brand = "2019 Bugatti Chiron";
		price = 2998000;
		speed = 236;
		System.out.println("\n\t\t\tCar: " + brand);
		System.out.println("\n\t\t\tPrice: $" + price);
		System.out.print("\n\t\t\tTop speed: " + speed + "mph");
	}
}

/* Helper class that outputs Aston Martin's specifications */
class AM implements HandleReq {
	public void execute(String brand, int price, int speed) {
		brand = "2015 Aston Martin Vulcan";
		price = 2300000;
		speed = 200;
		System.out.println("\n\t\t\tCar: " + brand);
		System.out.println("\n\t\t\tPrice: $" + price);
		System.out.print("\n\t\t\tTop speed: " + speed + "mph");
	}
}


/* Helper class that outputs Mercedes' specifications */
class Mercedes implements HandleReq {
	public void execute(String brand, int price, int speed) {
		brand = "2017 Mercedes-AMG Project One";
		price = 2700000;
		speed = 217;
		System.out.println("\n\t\t\tCar: " + brand);
		System.out.println("\n\t\t\tPrice: $" + price);
		System.out.print("\n\t\t\tTop speed: " + speed + "mph");
	}
}