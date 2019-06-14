package cedrasservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* 	This is the first Servlet.
 *  This connects to the HTTPServlet which creates two methods (doPost and doGet)
 *  Here, the first HTML file calls the doPost method which redirects to 
 *  the doGet method and sets the input received from the HTML.
 *  The page redirects to the second HTML page.
 */

@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ServletOne() {
    	// HttpServlet super connector
        super();
    }
    
    // doPost HttpSession Object
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 				// Start doGet method
 				doGet(request, response);
 	}

    // doGet HttpSession Object
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				// Getting the specific parameters set out in firstpage.html
				String fname = request.getParameter("fname");
				String lname = request.getParameter("lname");
				String address = request.getParameter("address");
				String email = request.getParameter("email");
				String cnumber = request.getParameter("number"); 
				String dob = request.getParameter("dob");
				
				// Output to Console
				System.out.println("First Name: " + fname);
				System.out.println("Last Name: " + lname);
				System.out.println("Physical Address: " + address);
				System.out.println("Email Address: " + email);
				System.out.println("Contact Number: " + cnumber);
				System.out.println("Date of Birth: " + dob);
				
				
				try {
				// 	Goes to the current session and connects the String to the Object required
				// IllegalStateexception caught	
				request.getSession().setAttribute("fname", fname);
				request.getSession().setAttribute("lname", lname);
				request.getSession().setAttribute("address", address);
				request.getSession().setAttribute("email", email);
				request.getSession().setAttribute("number", cnumber);
				request.getSession().setAttribute("dob", dob);
				} catch (IllegalStateException e) {
					System.out.println("Method invoked at illegal time!");
				}
				
				// Send web browser to location: secondpage.html
				try {
					response.sendRedirect("secondpage.html");
					} catch (IllegalStateException e) {
						System.out.println("Method invoked at illegal time!");
					} catch (IOException e) {
						System.out.println("Location invalid.");
					}
	}
}
