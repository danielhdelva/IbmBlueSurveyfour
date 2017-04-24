package IbmSurveyDao;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/loginServlet")
public class ExampleDocument extends HttpServlet {
	  private boolean isExample;
	 public ExampleDocument(boolean isExample) {
		    this.isExample = isExample;
		  }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	 String _id = request.getParameter("sa");
        String password = request.getParameter("password");
         
        System.out.println("username: " + _id);
        System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + _id + "<br/>";      
        htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
         
    }
 
}