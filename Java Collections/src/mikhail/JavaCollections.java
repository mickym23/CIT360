package mikhail;
import java.util.*;
public class JavaCollections {

	public static void main(String[] args) {
		
		  System.out.println("****************************************Lists**************************************");
		  // ArrayList declaration 
	      List<String> a1 = new ArrayList<String>();
	      // Adding elements to the ArrayList
  	      a1.add("Bananas");
	      a1.add("Apples");
	      a1.add("Carrots");
	      a1.add("Dates");
	      a1.add("Guava");
	      a1.add("Clementines");
	      a1.add("Watermelon");
	      a1.add("Pear");
	      System.out.println("\t\t\t\t ArrayList Elements\n");
	    
	      // Print Original List
	      System.out.println("Original ArrayList: " + a1 +  "\n");
	     
	      // Sort and Print the List Alphabetically Ascending
	      Collections.sort(a1);
	      System.out.println("Alphabetical Order (Ascending): " + a1 + "\n");
	      // Sort and Print the List Alphabetically Descending  
	      Collections.sort(a1, Collections.reverseOrder());
	      System.out.println("Alphabetical Order (Descending): " + a1 + "\n");
	     
	      // Remove all Elements in List
	      a1.clear();
	    
	      // Refill the List with Integers
	      List<Integer> a2 = new ArrayList<Integer>();
	      a2.add(1);
	      a2.add(25);
	      a2.add(10);
	      a2.add(4);
	      a2.add(2);
	    
	      // Print New List
	      System.out.println("New Integer ArrayList: " + a2 + "\n");
	    
	      // Sort and Print the List Numerically
	      Collections.sort(a2);
	      System.out.println("Sorted Integer ArrayList: " + a2 + "\n");
	     
	      // Print Each Element Separately Using For Loop
	      System.out.print("Each Element Printed: ");
	      for (int i = 0; i <= a2.size() - 1; i++) {
	    	 if (i == (a2.size() - 1)) {
	    		 System.out.println(a2.get(i) + "\n");
	    	 } else {
	    	 System.out.print(a2.get(i) + ", ");
	    	 }
	      }
	     
	      // Print the Lists Decrementing the Last Element
	      System.out.println("ArrayList With Last Element Decrementing: ");
	      for (int i = (a2.size() - 1); i >= 0; i--) {
	    	 System.out.println(a2);
	    	 a2.remove(i);
	      }

	      // LinkedLists
	      System.out.println("\n\t\t\t\t LinkedList Elements");
	     
	      // Creating input for user to check if a number they enter is in the list
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter an integer below 20: "); 
	      int num = input.nextInt();
	      input.close();
	     
	      // Adding the Elements to the List
	      List<Integer> list = new LinkedList<Integer>();
	      list.add(1);
	      list.add(3);
	      list.add(5);
	      list.add(7);
	      list.add(9);
	      list.add(11);
	      list.add(14);
	      list.add(17);
	      list.add(19);
	      
	      // If/else statement determines whether the list contains the number
	      // that the user enters
	      if (list.contains(num) == true) {
	    	  System.out.println("This LinkedList does contain: " + num);
	      } else {
	    	  System.out.println("This LinkedList does not contain: \"" + num + "\"");
	      }
	      
	      // Print List
	      System.out.println("The Integer LinkedList: " + list);
	      System.out.println("Size of List: " + list.size() + "\n");
	      
	      
	      // Create LinkedList for a Restaurant Menu using Spliterator
	      LinkedList<String> food = new LinkedList<String>();
	      food.add("Lasagne");
	      food.add("Seafood Paella");
	      food.add("Rotisserie Chicken");
	      food.add("Leg of Lamb");
	      food.add("Ratatouille");
	      food.add("Green or Caesar Salad");
	      food.add("Beef Espetada");
	      Spliterator<String> menu = food.spliterator();
	      
	      // Print out the table 
	      System.out.println("---LinkedList Menu for a Restaurant---");
	      System.out.println("| The Dinner Menu:");
	      menu.forEachRemaining((var) -> System.out.println("|     Food: " + var));

	      // Set Banner
		  System.out.println("\n****************************************Sets****************************************");
		  System.out.println("\t\t\t   HashSet & LinkedHashSet Elements");
			
		  // Declared LinkedHashSet to avoid random array elements
		  System.out.println("\n--New Testament Books Written by the Four Gospels--");
		  LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		  set1.add("Matthew");
		  System.out.println("\nBooks written by Matthew: " + set1);
		      
		  // Reset for Mark
		  set1.clear();
		  set1.add("Mark");
		  System.out.println("\nBooks written by Mark: " + set1);
		    
		  // Reset for Luke
		  set1.clear();
		  set1.add("Luke");
		  set1.add("Acts");
		  System.out.println("\nBooks written by Luke: " + set1);
		   
		  // Reset for John
		  set1.clear();
		  set1.add("John");
		  set1.add("1 John");
		  set1.add("2 John");
		  set1.add("3 John");
		  set1.add("Revelation");
		  System.out.println("\nBooks written by John: " + set1 + "\n");
		    
		  // Used to show how sets do not use duplicate elements
		  System.out.println("\n  --Analysis of a sentence--");
		  Set<String> set2 = new HashSet<String>();
		  set2.add("Take");
		  set2.add("the");
		  set2.add("bull");
		  set2.add("by");
		  set2.add("the");
		  set2.add("horns");
		  System.out.println("\nSentence: Take the bull by the horns\n");
		  System.out.println("HashSet: " + set2);
		    
		  // Iterate and display set2's sentence
		  Iterator<String> word1 = set2.iterator();
		  System.out.print("Iterated HashSet: ");
		  while (word1.hasNext()) {
		   	System.out.print(word1.next() + " ");
		  }
		    
		  // This was to show the order correction within the set
		  LinkedHashSet<String> set3 = new LinkedHashSet<String>();
		  set3.add("Take");
		  set3.add("the");
		  set3.add("bull");
		  set3.add("by");
		  set3.add("the");
		  set3.add("horns");
		  System.out.print("\n\nLinkedHashSet: " + set3);
		    
		  // Iterate and display set3's sentence 
		  Iterator<String> word2 = set3.iterator();
		  System.out.print("\nIterated LinkedHashSet: ");
		  while(word2.hasNext()) {
		  	System.out.print(word2.next() + " ");
		  }
		    
		  // Implementation of TreeSets
		  System.out.println("\n\n\t\t\t\t     TreeSets\n");
		  System.out.println("---Working with Integer Values---\n");
		  TreeSet<Integer> tree = new TreeSet<Integer>();
		  tree.add(23);
		  tree.add(118);
		  tree.add(24);
		  tree.add(15);
          tree.add(100);
		  tree.add(22);
		  System.out.println("Integer TreeSet: " + tree);
		  
		  // Finding different values within the TreeSet
		  System.out.println("Size of TreeSet: " + tree.size());
		  System.out.println("Highest Value: " + tree.pollLast());
		  System.out.println("Lowest Value: " + tree.pollFirst());
		  System.out.println("New TreeSet: " + tree);
		  System.out.println("First Element: " + tree.first());
		  System.out.println("Last Element: " + tree.last());
		  System.out.println("New Size of TreeSet: " + tree.size());

	      
		// HashMap
		  System.out.println("\n****************************************Maps****************************************");
	      System.out.println("\t\t\t\t      HashMap");
	      System.out.println("---Grades for Primary School---");
	      
	      HashMap<String, Integer> m1 = new HashMap<String, Integer>(); 
	      // Assigning percentages to the grades
	      m1.put("Grade 1", 92);
	      m1.put("Grade 2", 91);
	      m1.put("Grade 3", 91);
	      m1.put("Grade 4", 88);
	      m1.put("Grade 5", 90);
	      m1.put("Grade 6", 75);
	      m1.put("Grade 7", 95);
	        
	      // Returns Set View (Key, Value) of HashMap
	      Set<Map.Entry<String, Integer> > map = m1.entrySet();    
	  
	      // For loop to print out the HashMap in the desired way
	      for (Map.Entry<String, Integer> hash:map) 
	      { 
	          System.out.print("\t" + hash.getKey() + ": "); 
	          System.out.println(hash.getValue() + "%"); 
	      }
	      System.out.print("\n");
	       
	      // LinkedHashMap
	      System.out.println("\t\t\t\t    LinkedHashMap");
	      System.out.println("   ---A Student's Budget---");
	      LinkedHashMap<String, Double> m2 = new LinkedHashMap<String, Double>();
	      // Assign price values to each category
	      m2.put("Income", 1000.00);
	      m2.put("Rent", 250.00);
	      m2.put("Food", 150.00);
	      m2.put("Tithing", 100.00);
	      m2.put("Savings", 400.00);
	      m2.put("Other", 100.00);
	      
	      // Use For loop to print the LinkedHashMap
	      for (Map.Entry<String, Double> out:m2.entrySet()) {
	    	  System.out.println("\t" + out.getKey() + ": $" + out.getValue());
	      }
	      
	      
	      // TreeMap
	      System.out.println("\n\t\t\t\t      TreeMap");
	      System.out.println("      ---Selected Hymns---");
	      TreeMap<Integer, String> m3 = new TreeMap<Integer, String>();
	      // Assign Hymn numbers to names
	      m3.put(7, "Israel, Israel, God Is Calling");
	      m3.put(26, "Joseph Smith's First Prayer");
	      m3.put(27, "Praise to the Man");
	      m3.put(49, "Adam-ondi-Ahman");
	      m3.put(60, "Battle Hymn of the Republic");
	      m3.put(86, "How Great Thou Art");
	      m3.put(100, "Nearer, My God, to Thee");
	      m3.put(106, "God Speed the Right");
	      m3.put(308, "Love One Another");
	      
	      // Print TreeMap
	      Set<Map.Entry<Integer, String> > set = m3.entrySet();
	      for (Map.Entry<Integer, String> out2 : set) {
	    	  System.out.println("  " + out2.getKey() + ". " + out2.getValue());
	      }
	      
	      // Implementing add/remove changes to the TreeMap
	      m3.put(284, "If You Could Hie to Kolob");
	      m3.remove(49, "Adam-ondi-Ahman");
	      
	      // Print new TreeMap
	      System.out.println("\n  Recently Added - \"If You Could Hie to Kolob\" ");
	      System.out.println("  Recently Removed - \"Adam-ondi-Ahman\"\n");
	      for (Map.Entry<Integer, String> out2 : set) {
	    	  System.out.println("  " + out2.getKey() + ". " + out2.getValue());
	      }
	      
	      // Queues
	      System.out.println("\n*************************************Queues*************************************");
	      Queue<Integer> queue = new LinkedList<>(); 
	       System.out.println("\t\t\t\t Queue Elements\n");
	       System.out.println("   ---Queue Manipulation---");
	       // Add 6 integers to Queue
	       queue.add(0);
	       queue.add(1);
	       queue.add(2);
	       queue.add(3);
	       queue.add(4);
	       queue.add(5);
	        
	      // Print Queue, size, and remove first element within Queue 
	      System.out.println("   Original Queue: " + queue); 
	      int size1 = queue.size();
	      System.out.println("   Queue size: " + size1);   
	      int first = queue.remove(); 
	      System.out.println("   Element removed: \"" + first + "\""); 
	      System.out.println("   New Queue: " + queue); 
	        
	      // View and print the first element in Queue, but keep it 
	      int element1 = queue.peek(); 
	      System.out.println("   First Element in Queue: " + element1); 
	        
	      // View and print new size, remove first element again
	      int sizetwo = queue.size(); 
	      System.out.println("   Size of Queue: " + sizetwo);
	      int firstElement = queue.poll();
	      System.out.println("   Polled Queue: " + firstElement);
	      
	      // Print the latest Queue
	      System.out.println("   New Queue: " + queue);
	      System.out.println("   The First Element: (" + firstElement + ") was identified and removed.");
	      
	      // Show the first element
	      int newH = queue.peek();
	      System.out.println("   New First Element: " + newH);
	}

}