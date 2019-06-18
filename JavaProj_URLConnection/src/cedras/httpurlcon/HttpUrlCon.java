package cedras.httpurlcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;


public class HttpUrlCon {
	/* This program demonstrates how the HTTP/URL connection works.
	 * A URL is given and the BufferedReader and getInputStream collects 
	 * the HTML data of the URL web page and prints it in the console.
	 * This shows how data can be found and used within a Java application.
	 * A couple main exceptions were also caught.
	 */
public static void main(String[] args) throws Exception {  
		
		try {
			 System.out.println("Processing...\n");
			 
			// Creating the URL class
			URL url = new URL("https://mikhail-website.glitch.me/");   
			
			// Creating the URLConnection to the URL 
			URLConnection connection = (HttpURLConnection) url.openConnection();   
	   
			try {
			// Request GET method from Http, can throw ProtocolException
			((HttpURLConnection) connection).setRequestMethod("GET");
			} catch (ProtocolException e) {
				e.printStackTrace();
			}
			
			// Timeout in 20 seconds
			connection.setReadTimeout(20000);   
				
	   // Retrieve the Input Stream of the URLConnection
	   // BufferedReader to scan through website HTML
	   BufferedReader buff = new BufferedReader(new InputStreamReader (connection.getInputStream()));   
	   String i;   
	  
	   
	   // Scan through read data printing the data.
	   while ((i = buff.readLine()) != null)    
	   {   
	    System.out.println(i);   
	   }      
	    	    
	   // Return and print nth Header Field Key and Value
	   for(int iterator = 1; iterator <= 10; iterator++) {
	      System.out.println(connection.getHeaderFieldKey(iterator) + " = " + connection.getHeaderField(iterator));
	   }
	    	 
	   // Disconnect from Http
	   ((HttpURLConnection) connection).disconnect();
	  
	// Exceptions that may arise
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (MalformedURLException e) { 
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}