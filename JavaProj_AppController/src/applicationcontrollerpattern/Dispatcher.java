package applicationcontrollerpattern;

import java.util.HashMap;

/*
 * This is the Dispatcher part of the program.
 * Here the two HashMaps are created for the Student's I# and GPA.
 * The HashMaps are used in conjunction with the request from the user. 
 * The request in sent into the dispatcher(by means of AppController), sorted and returned
 * back to the AppController.  
 */

public class Dispatcher {
	
	// HashMap for Student I-Numbers
	@SuppressWarnings("serial")
	public static final HashMap<String, Integer> map  = new HashMap<String, Integer>() {
	{
	put("Adam", 1123953);
	put("Joseph", 1369284);
	put("Kelly", 1092842);
	put("Marie", 1309842);
	put("Powell", 1847263);
	}
	};
	
	// HashMap for Student GPAs  
	@SuppressWarnings("serial")
	public static final HashMap<String, Double> map2  = new HashMap<String, Double>() {
	{
	put("Adam", 4.0);
	put("Joseph", 3.7);
	put("Kelly", 3.9);
	put("Marie", 4.3);
	put("Powell", 3.0);
	}
	};
	
	// Data output to Controller method
	public void dispatch(String req) {
		System.out.println("Student number: #" + map.get(req));
		System.out.println("Student Average GPA: " + map2.get(req));
	}
}


