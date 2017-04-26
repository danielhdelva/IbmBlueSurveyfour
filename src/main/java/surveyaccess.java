

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
        String Band = request.getParameter("Band");
        String eID = request.getParameter("eID");
        String ServiceLine = request.getParameter("SL");
        String BluepagesManagerName = request.getParameter("BMN");
        String 	Service_Area = request.getParameter("SA");
        String Primary_Job_Role = request.getParameter("pr");
        String Testscript = request.getParameter("tscript");
        String  Test_data_creation = request.getParameter("tdata");
        String  Execute_test_scripts = request.getParameter("ExecuteTest");
        String Write_defects = request.getParameter("WriteDefects");
        String Effectively_communicate_to_stakeholders_client = request.getParameter("Effectivelycommunicate");
        String Use_of_HP_Application_Lifecycle_Management = request.getParameter("UseofHPApplication");
        String Use_of_Rational_ClearCase = request.getParameter("UseofRational");
        String  Use_of_Rational_Collaborative_Life_cycle_Management = request.getParameter("Use_of_Rational_Collaborative");
        String Use_of_Rational_Doors = request.getParameter("UseofRationalManual");
        String Use_of_Rational_Manual_Tester=request.getParameter("UseofRationalManual");
        String Use_of_Rational_Quality_Manager=request.getParameter("QualityManager");
        String Use_of_Rational_Requirements_Composer=request.getParameter("UseofRationalRequirementsComposer");   
        
        
        
        //String password = request.getParameter("password");
         eename=ename;
        System.out.println("username: " + ename);
        //System.out.println("password: " + password);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone +=  ename + " Thank You for summitting this survey" + "<br/>";      
        //htmlRespone += "Your password is: " + password + "</h2>";    
        htmlRespone += "</html>";
       
        
       
      
        
        SurveyDao danielhdelva= new SurveyDao();
        
       
        
        danielhdelva.create(ename, eID,Band,ServiceLine,BluepagesManagerName,Service_Area,Primary_Job_Role,Testscript,Test_data_creation,Execute_test_scripts,Write_defects,Effectively_communicate_to_stakeholders_client,Use_of_HP_Application_Lifecycle_Management,Use_of_Rational_ClearCase,Use_of_Rational_Collaborative_Life_cycle_Management,Use_of_Rational_Doors,Use_of_Rational_Manual_Tester,Use_of_Rational_Quality_Manager,Use_of_Rational_Requirements_Composer);
        // return response
        writer.println(htmlRespone);
      
    }
 

}
