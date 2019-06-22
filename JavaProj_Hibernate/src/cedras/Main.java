package cedras;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	/* This program is made up of 4 different components, 
	 * the Main class that handles all data imported and exported
	 * from database.
	 * 
	 * The Shop class that handles all the getters and setters 
	 * necessary for the data, including a String output method. 
	 * 
	 * The local shop.hbm.xml file that handles the hibernate mapping.
	 * 
	 * The hibernate.cfg.xml file. This file is the configuration document
	 * that connects to the correct database using the correct drivers, etc.
	 * 
	 * This program is designed to take data from a supplier to a shop and 
	 * store it within a database and be able to retrieve the information as well. 
	 */
	public static void main(String[] args) {
		
		// Configure the hibernate.cfg.xml file
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		
		// Create SessionFactory interface
		@SuppressWarnings("deprecation")
		SessionFactory factory = configure.buildSessionFactory();
		
		// Start session
		Session session = factory.openSession();
		
		// Ask the user for input to store in DataBase
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Please enter how many Tomatoes you want: ");
		String tom = input.nextLine();
		
		System.out.print("Please enter how many onions you want: ");
		String on = input.nextLine();
		
		System.out.print("Please enter how many potatoes you want: ");
		String pot = input.nextLine(); 
	
		// Start database transaction
		session.beginTransaction();
	
		// Set up Shop and save to session
		Shop shop = new Shop();
		shop.setName(name);
		shop.setTomato(tom);
		shop.setOnion(on);
		shop.setPotato(pot);
		session.save(shop); 
		
		// Output console string of variables
		System.out.println("\n\n=============================================\n\t\tConsole Output");
		System.out.println("Output: " +shop.toString() + "\n\n");
		
		// Collect information and commit to database
		Transaction trans = session.getTransaction();
		trans.commit();
		
		// Show after information is exported to the database
		System.out.println("\nExported to Database!\n");
		
		// Create a query from table 'shop' and output data form database
		Query query = session.createQuery("from Shop");
		@SuppressWarnings("rawtypes")
		java.util.List out;
		out = query.list();
		System.out.println("\n\n==============================================\n\t\tDatabase Output");
		System.out.println(out + "\n\n");

		//close session, input, and factory
		session.close();
		input.close();
		factory.close();
	}
}
