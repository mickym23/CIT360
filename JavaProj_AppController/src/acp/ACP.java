package acp;

import java.util.HashMap;
import java.util.Scanner;

public class ACP {

	@SuppressWarnings("unused")
	private static App out;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		out = new App();
		String brand = "Test";
		int price = 0;
		int speed = 0;
		String req;
		
		System.out.println("\t\t\tSupercar Showroom");
		
		System.out.print("Enter a car brand(Ferrari, Bugatti, Aston Martin, or Mercedes): ");
		req = input.nextLine();
		
		System.out.println("\n\t\t\tCar requested: " + req);
		App.handleCommand(req, brand, price, speed);
		
		input.close();
	}
}

class App {
	public static HashMap<String, HandleReq> m = new HashMap<String, HandleReq>();
	
	public App () {
		
	}
	
	public static void handleCommand(String req, String brand, int price, int speed) {
		m.put("Ferrari", new Ferrari());
		m.put("Bugatti", new Bugatti());
		m.put("Aston Martin", new AM());
		m.put("Mercedes", new Mercedes());
		
		HandleReq handle = m.get(req);
		handle.execute(brand, price, speed);
	}
}

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