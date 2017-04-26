

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
 



/**
 * Servlet implementation class surveyaccess
 */
@WebServlet("/surveyaccess")
public class surveyaccess extends HttpServlet {
	public String  eename="dan";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public surveyaccess() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String ename = request.getParameter("ename");
        //String password = request.getParameter("password");
         eename=ename;
        System.out.println("username: " + ename);
        //System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " + ename + "<br/>";      
        //htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
       
        
       
      
        
        SurveyDao danielhdelva= new SurveyDao();
        
       
        
        danielhdelva.create(ename);
        // return response
        writer.println(htmlRespone);
         
    }
 

}
