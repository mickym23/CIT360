package cedras;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Please enter how many Tomatoes you want: ");
		String tom = input.nextLine();
		
		System.out.print("Please enter how many onions you want: ");
		String on = input.nextLine();
		
		System.out.print("Please enter how many potatoes you want: ");
		String pot = input.nextLine(); 
	
		
		session.beginTransaction();
	
		Shop shop = new Shop();
		shop.setName(name);
		shop.setTomato(tom);
		shop.setOnion(on);
		shop.setPotato(pot);
	
		session.save(shop); 
		System.out.println("\n\n=============================================\n\t\tConsole Output");
		System.out.println("Output: " +shop.toString() + "\n\n");
		
		
		 Transaction trans = session.getTransaction();
		 trans.commit();
		System.out.println("\nExported to Database!\n");
		
		Query query = session.createQuery("from Shop");
		@SuppressWarnings("rawtypes")
		java.util.List out;
		out = query.list();
		System.out.println("\n\n==============================================\n\t\tDatabase Output");
		System.out.println(out + "\n\n");
		
		session.close();
		input.close();
		factory.close();
	}
}
