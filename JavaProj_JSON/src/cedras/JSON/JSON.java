package cedras.JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {

	/* 
	 * This is my JSON Program. I used json-simple-1.1.1.jar to access
	 * the JSON library and added it in my Build Path.
	 * Here in the first part, I create new JSONObjects and JSONArrays 
	 * and send them to JSONStrings. The main purpose of this is to
	 * convert objects into JSON form. 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		try {
			
			/**********************************************************
			 *********************Object -> JSON*********************** 
			 *********************************************************/
			
			System.out.println
			("===============================================================\n" +
								"\t\t\tObject -> JSON\n" + 									
			 "===============================================================\n");

			 // Beef object
			 JSONObject beef = new JSONObject();
			 
			 // Ignored and takes the last instance of "seasoning"
			 beef.put("seasoning", "salt and pepper");
			 beef.put("seasoning", "steak spice");
			 beef.put("grams", new Integer(500));
			 beef.put("cut", "sirloin"); 
			 
			 // Chicken object
			 JSONObject chicken = new JSONObject();
			 chicken.put("seasoning", "peri-peri");
			 chicken.put("grams", new Integer(300));
			 chicken.put("cut", "thigh");
			
			 // Meat object
			 JSONObject meat = new JSONObject();
			 meat.put("BEEF", beef);
			 meat.put("CHICKEN", chicken);
			 
			 // JSON Array for herbs
			 JSONArray herb = new JSONArray();
			 herb.add(0, "Rosemary");
			 herb.add(1, "Sage");
			 herb.add(2, "Parsley");
			 herb.add(3, "Thyme");
			 herb.add(4, "Basil");
			 
			 // JSON meat object output
			 System.out.println("\t\t\tBraai Ingredients");
			 System.out.println("\t\t    ***JSON Object: [meat]***");
			 System.out.println("Beef: " + meat.get("BEEF"));
			 System.out.println("Chicken: " + meat.get("CHICKEN") + "\n\n");
			 
			 
			 // JSON herb array output
			 System.out.println("\t\t\tHerb Garden");
			 System.out.println("\t\t   ***JSON Array: [herb]***");
			 for ( int i = 0; i < herb.size(); i++) {
				 System.out.println(i + ". " + herb.get(i));
			 }
			 
			 try {
				 
			 // Ask the user to enter an element's index
			 // to remove from the array	 
			 Scanner input = new Scanner(System.in);
			 System.out.print("\nEnter an element to remove: ");
			 int index = input.nextInt();
			 
			 // Output which element will be removed
			 System.out.println("Removing element: " + 
			 			herb.remove(index));
			 
			 input.close();
			 } catch (IndexOutOfBoundsException e) {
				 // Catch IndexOutOfBoundsException as I didn't initially 
				 // tell the user the exact range of indicies to enter
				 System.err.println("ERROR! Enter index between 0 and " + (herb.size() - 1));
				 System.exit(1);
			 }
			 
			 // New herb output minus the removed element
			 System.out.println("\n\t\t\tNew Herb Garden");
			 for ( int i = 0; i < herb.size(); i++) {
				 System.out.println(i + ". " + herb.get(i));
			 }
			 
			 
			/*
			 * This is the second part of the JSON Program.
			 * I created a file: table.json that contains JSON data
			 * I use the Parse method and store it in JSONObjects and
			 * a JSONArray and then output certain information I want.
			 */
			/**********************************************************
			 ********************JSON -> Object************************ 
			 *********************************************************/
			 
			System.out.println
			("\n\n================================================================\n" +
						      "\t\t\tJSON -> Object\n" + 									
			 "================================================================"); 

			// FileReader to get and read file
			FileReader file = new FileReader("table.json");
			
			// Parser runs through file and stores it to the JSONObject
			JSONParser parser = new JSONParser();
			
			// Parse method is used
            JSONObject obj = (JSONObject) parser.parse(file);
            
            // Get username from JSONObject and output
            String username = (String) obj.get("username");
            System.out.println("\n\nStudent username: " + username);
            
            // Get surname from JSONObject and output
            String surname = (String) obj.get("surname");
            System.out.println("Student surname: " + surname);
 
            // Get byuid from JSONObject and output
            /***Not too sure why Long has to be used instead of int, float, or double***/
            long byuid =  (long) obj.get("byu-id");
            System.out.println("BYU-ID: #" + byuid);
 
            // Create a JSONArray and store "Course Info" in array
            JSONArray courses = (JSONArray) obj.get("Course Info");
             
            // Output each index within the JSONArray
            for(int i = 0; i < courses.size() - 1; i++){
                System.out.println("Array Index: " + i + " = " + courses.get(i));
            }
            
            // Output course information a certain format
            System.out.println("\n\t\t\tCourse Information");
            @SuppressWarnings("rawtypes")
			Iterator iterator = courses.iterator();
            while (iterator.hasNext()) {
                JSONObject newobj = (JSONObject) iterator.next();
                System.out.println("Course: "+ newobj.get("Name") + " | "
                		+ "Language: "+ newobj.get("Language"));
            }
           
            // Create and save "Degrees" to new JSONObject
            JSONObject degrees = (JSONObject) obj.get("Degrees");
            System.out.println("\n\t\t\tDegrees\n" + 
            					"CS: " + degrees.get("CS") +
            					"\nCIT: " + degrees.get("CIT"));

            // Output degrees JSONObject to JSONString
            System.out.println("\n" + degrees.toJSONString() + "\n\n");
            
		} catch (FileNotFoundException e) {
			System.err.println("File not found.");
		} catch (ParseException e) {
			System.err.println("Parse failed!");
		} catch (IOException e) {
			System.err.println("File could not be read.");
		}
	}
}