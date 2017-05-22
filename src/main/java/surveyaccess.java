

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
        try{ 
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
        String Use_of_Rational_Pro=request.getParameter("UseOfRationalRPro"); 
        String Use_of_Rational_Software_Architect_Design_Manager=request.getParameter("Usadm");
        String Use_of_Rational_Team_Concert=request.getParameter("Useteamc");
        String Use_Rational_TestManager=request.getParameter("Use_Rational_TestManager");
        String Continuos_Integration_Continuous_Testing=request.getParameter("Continuos_Integration_Continuous_Testing");
        String  Test_driven_development_TDD_Behavior_driven_development_BDD=request.getParameter("TDD");
        String  Test_Architect_Technical_Leadership=request.getParameter("TestArch");
        String  Create_test_plan=request.getParameter("Createtestplan");
        String  Create_test_plan_data=request.getParameter("Create_test_data_plan");
        String Create_test_schedula=request.getParameter("Create_test_schedul");
        String Review_and_track_test_team_schedule_progress=request.getParameter("Review_and_track");
        String Resource_onboarding=request.getParameter("Resource_onboarding");
        String Create_and_present_test_status_and_reports_to_key_stakeholders=request.getParameter("Create_and_present_test_s");
        String Prepare_Analyze_test_metric=request.getParameter("Prepare_Analyze_test_metric");
        String Perform_defect_management=request.getParameter("Perform_defect_management");
        String Create_test_estimates_and_budgets=request.getParameter("creattestestimates");
        String Perform_cost_accounting_and_provide_status=request.getParameter("performcostaccounting");
        String Agile_SCRUM_Master_experience=request.getParameter("Agile_SCRUM_Master_experience");
        String Consult_on_test_solutions=request.getParameter("Consult_on_test_solutions");
        String Experience_in_Yrs__with_Software_Dev_Methodology_SDLC_Agile_SCRUM_Kanban_Iterative=request.getParameter("einyrsws");
        String Participate_in_and_support=request.getParameter("Participate_in_and_support");
        String Lead_test_assessments=request.getParameter("Participate_in_and_support");
        String testing_using_accelerators=request.getParameter("testing_using_acceleratorst");
        String Conduct_data_analytics_study=request.getParameter("conductdataana");
        String Support_troubled_test_programs =request.getParameter("Support_troubled_test_programs");
        String Develop_Test_proposals =request.getParameter("Develop_Test_proposals");
        String  Build_test_automation_frameworks =request.getParameter("Build_test_automation");
        String  Lead_test_automation_efforts =request.getParameter("LeadTestA");
        String  Design_test_automation_scripts =request.getParameter("Design_test_automation_scripts");
        String  Knowledge_of_Programming_Languages =request.getParameter("Knowledge_of_Programming_Languages");
        String Write_performance_testing_scripts =request.getParameter("Write_performance_testing_scripts");
        String Rational_Functional_Tester =request.getParameter("Rational_Functional_Tester");
        String IBM_ATA_Automating_Test_Automation =request.getParameter("IBM_ATA_Automating_Test_Automation");
        String QA_Partner =request.getParameter("QA_Partner");
        String HP_Quality_Center_QC =request.getParameter("HP_Quality_Center_QC");
        String HP_WinRunner =request.getParameter("HP_WinRunner");
        String HP_Unified_Functional_Testing_UFT =request.getParameter("HP_Unified_Functional_Testing_UFT");
        String HP_QuickTest_Pro_QTP  =request.getParameter("HP_QuickTest_Pro_QTP ");
        String Selenium_IDE_Integrated_Development_Environment  =request.getParameter("Selenium_IDE_Integrated_Development_Environment");
        String Selenium_RC_WebDriver  =request.getParameter("Selenium_RC_WebDriver");
        String Build_performance_testing_frameworks  =request.getParameter("Build_performance_testing_frameworks");
        String leadperformancetest  =request.getParameter("leadperformancetest");
        String Design_performance_testing_scripts  =request.getParameter("Design_performance_testing_scripts");
        String Knowledge_of_Programming_Languagestwo  =request.getParameter("Knowledge_of_Programming_Languagestwo");
        String Write_performance_testing_scriptstw0  =request.getParameter("Write_performance_testing_scriptstw0");
        String Rational_Performance_Tester0 =request.getParameter("Rational_Performance_Tester0");
        String HP_Quality_Center_LoadRunner =request.getParameter("HP_Quality_Center_LoadRunner");
        String HP_Performance_Center =request.getParameter("HP_Performance_Center");
        String Silk_Performer =request.getParameter("Silk_Performer");
        String Apache_Jmeter =request.getParameter("Apache_Jmeter");
        String Parasoft_SOAtest =request.getParameter("Parasoft_SOAtest");
        String Perform_mobile_application_testing =request.getParameter("Perform_mobile_application_testing");
        String Perform_security_testing =request.getParameter("Perform_security_testing");
        String Perform_data_analytics_testing =request.getParameter("Perform_data_analytics_testing");
        String Perform_testing_in_the_Cloud =request.getParameter("Perform_testing_in_the_Cloud");
        String Perfrom_Agile_testing =request.getParameter("Perfrom_Agile_testing");
        String Junit_TestNG_Java=request.getParameter("Junit_TestNG_Java");
        String Cucumber_Celerity=request.getParameter("Cucumber_Celerity");
        String _508_Testing_tools_JAWS=request.getParameter("508_Testing_tools_JAWS");
        String _508_Testing_tools_Dragon=request.getParameter("_508_Testing_tools_Dragon");
        String _508_Testing_tools_Zoomtext=request.getParameter("_508_Testing_tools_Zoomtext");
        String _508_Testing_tools_Compliance_Sheriff=request.getParameter("_508_Testing_tools_Compliance_Sheriff");
        String _508_Testing_tools_Object_Inspector=request.getParameter("_508_Testing_tools_Object_Inspector");
        String _508_Testing_tools_Java_Ferret=request.getParameter("_508_Testing_tools_Java_Ferret");
        String _508_Testing_tools_Web_Accessibility_Toolbar_WAT=request.getParameter("_508_Testing_tools_Web_Accessibility_Toolbar_WAT");
        String _508_Testing_tools_Adobe_Acrobat_Pro_PDF=request.getParameter("_508_Testing_tools_Adobe_Acrobat_Pro_PDF");
        String IA_Tool_Scan_FortiFy=request.getParameter("IA_Tool_Scan_FortiFy");
        String IA_Tool_Scan_AppScan=request.getParameter("IA_Tool_Scan_AppScan");
        String _Knowledge_of_Programming_Languages=request.getParameter("_Knowledge_of_Programming_Languages");
        String Java_J2EE_Net_Perl_Python_Shell_Scripting_Power_Shell_SQL_Other_Pls_list=request.getParameter("javajee");
        String Retail=request.getParameter("Retail");
        String Manufacturing=request.getParameter("Manufacturing");
        String Health_Care=request.getParameter("Health_Care");
        String Transportation=request.getParameter("Transportation");
        String Banking=request.getParameter("Banking");
        String Finance=request.getParameter("Finance");
        String Government=request.getParameter("Government");
        String Current_Clearance_s_status=request.getParameter("Current_Clearance_s_status");
        String Additional_Comments=request.getParameter("Additional_Comments");
        String E=request.getParameter("SLw");
        String p=request.getParameter("p");
        PrintWriter writerr = response.getWriter();
        
        int []dan=new int[3];
        for(int i=0; i<3; i++){
     	   
        
        
        while(Testscript==""){
        	   writerr.println("entered while");
        	   writerr.println(i);
        	 dan[3]=0;
        	 
        }
        }
       if (E=="y"){
    	   writerr.println("entered error phase"+ E);
    	   writerr.println("entered error phase "+Testscript);
    	   dan[3]=0;
    	   
    	  
       }
       else{
    	   writerr.println("entered else0 " +E );
    	   writerr.println("entered else0 "+ p);
       }
        
        
    
        
        
        
        
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
        
//        if(eID=="" ||eID==null){
//			  eID=""+Math.random(); 
//			  
//		   }
        
        danielhdelva.create(ename, eID,Band,ServiceLine,BluepagesManagerName,Service_Area,Primary_Job_Role,Testscript,Test_data_creation,Execute_test_scripts,Write_defects,Effectively_communicate_to_stakeholders_client,Use_of_HP_Application_Lifecycle_Management,Use_of_Rational_ClearCase,Use_of_Rational_Collaborative_Life_cycle_Management,Use_of_Rational_Doors,Use_of_Rational_Manual_Tester,Use_of_Rational_Quality_Manager,Use_of_Rational_Requirements_Composer,Use_of_Rational_Pro,Use_of_Rational_Software_Architect_Design_Manager,Use_of_Rational_Team_Concert,Use_Rational_TestManager,Continuos_Integration_Continuous_Testing,Test_driven_development_TDD_Behavior_driven_development_BDD,Test_Architect_Technical_Leadership,
        		Create_test_plan, Create_test_plan_data,Create_test_schedula,Review_and_track_test_team_schedule_progress,  Resource_onboarding,Create_and_present_test_status_and_reports_to_key_stakeholders,Prepare_Analyze_test_metric,Perform_defect_management,Create_test_estimates_and_budgets,Perform_cost_accounting_and_provide_status,Agile_SCRUM_Master_experience,Consult_on_test_solutions,Experience_in_Yrs__with_Software_Dev_Methodology_SDLC_Agile_SCRUM_Kanban_Iterative,Participate_in_and_support,Lead_test_assessments,testing_using_accelerators,Conduct_data_analytics_study,Support_troubled_test_programs,Develop_Test_proposals,Build_test_automation_frameworks,Lead_test_automation_efforts,Design_test_automation_scripts,
        		Knowledge_of_Programming_Languages,Write_performance_testing_scripts,Rational_Functional_Tester,IBM_ATA_Automating_Test_Automation,QA_Partner,HP_Quality_Center_QC,HP_WinRunner,HP_Unified_Functional_Testing_UFT,HP_QuickTest_Pro_QTP,Selenium_IDE_Integrated_Development_Environment,Selenium_RC_WebDriver,Build_performance_testing_frameworks,leadperformancetest,Design_performance_testing_scripts,Knowledge_of_Programming_Languagestwo,
        		Write_performance_testing_scriptstw0,Rational_Performance_Tester0,HP_Quality_Center_LoadRunner,HP_Performance_Center,Silk_Performer,Apache_Jmeter,Parasoft_SOAtest,Perform_mobile_application_testing,Perform_security_testing,Perform_data_analytics_testing,Perform_testing_in_the_Cloud,Perfrom_Agile_testing,Junit_TestNG_Java,Cucumber_Celerity,_508_Testing_tools_JAWS,_508_Testing_tools_Dragon,_508_Testing_tools_Zoomtext,_508_Testing_tools_Compliance_Sheriff,_508_Testing_tools_Object_Inspector,_508_Testing_tools_Java_Ferret,_508_Testing_tools_Web_Accessibility_Toolbar_WAT,_508_Testing_tools_Adobe_Acrobat_Pro_PDF,IA_Tool_Scan_FortiFy,IA_Tool_Scan_AppScan,_Knowledge_of_Programming_Languages,Java_J2EE_Net_Perl_Python_Shell_Scripting_Power_Shell_SQL_Other_Pls_list,Retail,Manufacturing,Health_Care,Transportation,Banking,Finance,Government,Current_Clearance_s_status,Additional_Comments);
        // return response
        writer.println(htmlRespone);
        }catch(Throwable e){ 
        	PrintWriter writer = response.getWriter();
        	writer.println("Please Enter Valid  EmployeeId That is unique");}
    }
 

}
