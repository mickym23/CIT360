package cedrasservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ServletTwo() {
    	// HttpServlet super connector
    	super();
    }

    // doGet HttpSession Object
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				// Getting the specific parameters set out in secondpage.html
				String inum = request.getParameter("inum");
				String course = request.getParameter("course");
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				// Output to console
				System.out.println("BYUI I-Number: " + inum);
				System.out.println("Course Enrolled: " + course);
				System.out.println("BYUI Username: " + username);
				System.out.println("BYUI Password: " + password);
				
				try {
				// Goes to the current session and connects the String to the Object required
				// IllegalStateexception caught	
				request.getSession().setAttribute("inum", inum);
				request.getSession().setAttribute("course", course);
				request.getSession().setAttribute("username", username);
				request.getSession().setAttribute("password", password);
				} catch (IllegalStateException e) {
					System.out.println("Method invoked at illegal time!");
				}
				
				
				// Send web browser to location: output.jsp
				try {
				response.sendRedirect("output.jsp");
				} catch (IllegalStateException e) {
					System.out.println("Method invoked at illegal time!");
				} catch (IOException e) {
					System.out.println("Location invalid.");
				}
	}

	 // doPost HttpSession Object
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Start doGet method
		doGet(request, response);
	}

}
