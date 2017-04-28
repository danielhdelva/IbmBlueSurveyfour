public class ExampleDocument {
  
//	surveyaccess  s = new surveyaccess();
//	private String _id = s.eename;
	public  String _id ="";
	public String EmployeeName="";
	public  String Banda="";
	public  String EmployeeID="";
	public  String Service_Line="";
	public  String Bluepages_Manager_Name="";
	public  String Service_Area="";
	public  String Primary_Job_Role="";
	public  String Test_script_creation ="";
	public  String Test_data_creation="";
	public  String Execute_test_scripts="";
	public  String Write_defects="";
	public  String Effectively_communicate="";
	public  String Use_of_HP_Application_Lifecycle_Management_ALM="";
	public  String Use_of_Rational_ClearCase_and_ClearQuest="";
	public  String Use_of_Rational_Collaborative_Life_cycle_Management_clm_product="";
	public String Use_of_Rational_Doors= null;
	public String  Use_of_Rational_Manual_Tester= null;
	public String  Use_of_Rational_Quality_Manager= null;
	public String  Use_of_Rational_Requirements_Composer= null;
	public String  Use_of_Rational_RequisitePro= null;
	public String  Use_of_Rational_Software_Architect_Design_Manager= null;
	public String  Use_of_Rational_Team_Concert= null;
	public String  Use_Rational_TestManager= null;
	public String  Continuos_Integration_Continuous_Testing= null;
	public String  Test_driven_development_TDD_Behavior_driven_development_BDD= null;
	public String  Test_Architect_Technical_Leadership= null;
	public String   Create_test_plan= null;
	public String   Create_test_data_plan= null;
	public String    Create_test_schedule= null;
	public String    Review_and_track_test_team_schedule_progress= null;
	public String Resource_onboarding = null;
	public String  Create_and_present_test_status_and_reports_to_key_stakeholders = null;
	public String  Prepare_Analyze_test_metrics = null;
	public String Perform_defect_management = null;
	public String Create_test_estimates_and_budgets = null;
	public String Perform_cost_accounting_and_provide_status = null;
	public String Agile_SCRUM_Master_experience = null;
	public String Consult_on_test_solutions = null;
	public String Experience_in_Yrs__with_Software_Dev_Methodology_SDLC_Agile_SCRUM_Kanban_Iterative = null;
	public String Participate_in_and_support_test_assessments = null;
	public String Lead_test_assessments = null;
	public String Experience_in_Yrs_testing_using_accelerators_like_CTD_Combinatorial_Test_Design = null;
	public String Conduct_data_analytics_study = null;
	
	private String _rev = null;


  public ExampleDocument(String name, String eID, String Band, String sl, String BM, String SA, String PJR, String ts,String td,String ET, String WD, String Ec, String useofhp, String useofrational, String useofrationalcol, String rationald, String urmt,String urqm, String urrc, String uorp,String uoras, String uortc, String uortest, String Continuos_Integration, String tdd,String taa, String ctp,String ctdp,String ctts, String rattsp, String rss, String cprss,String pstm,String perd,String ctead, String pcaap,String agsme,String Consult_on_test, String ewsdmsdlc, String piasta, String Lead_test_assessment,String eintd, String cdas) {
	   _id=eID;
	  
	   System.out.println(_id);
	   EmployeeName=name;
	   EmployeeID=eID;
	   Banda=Band;
	   Service_Line=sl;
	   Bluepages_Manager_Name=BM;
	   Service_Area=SA;
	   Primary_Job_Role=PJR;
	   Test_script_creation=ts;
	   Test_data_creation=td;
	   Execute_test_scripts=ET;
	   Write_defects=WD;
	   Effectively_communicate =Ec;
	   Use_of_HP_Application_Lifecycle_Management_ALM=useofhp;
	   Use_of_Rational_ClearCase_and_ClearQuest=useofrational;
	   Use_of_Rational_Collaborative_Life_cycle_Management_clm_product=useofrationalcol;
	   Use_of_Rational_Doors=rationald;
	   Use_of_Rational_Manual_Tester=urmt;
	   Use_of_Rational_Quality_Manager=urqm;
	   Use_of_Rational_Requirements_Composer= urrc;
	   Use_of_Rational_RequisitePro=uorp;
	   Use_of_Rational_Software_Architect_Design_Manager=uoras;
	   Use_of_Rational_Team_Concert=uortc;
	   Use_Rational_TestManager=uortest;
	   Continuos_Integration_Continuous_Testing=Continuos_Integration;
	   Test_driven_development_TDD_Behavior_driven_development_BDD=tdd;
	   Test_Architect_Technical_Leadership=taa;
	   Create_test_plan=ctp;
	   Create_test_data_plan=ctdp;
	   Create_test_schedule=ctts;
	   Review_and_track_test_team_schedule_progress=rattsp;
	   Resource_onboarding=rss;
	   Create_and_present_test_status_and_reports_to_key_stakeholders=cprss;
	   Prepare_Analyze_test_metrics=pstm;
	   Perform_defect_management=perd;
	   Create_test_estimates_and_budgets=ctead;
	   Perform_cost_accounting_and_provide_status=pcaap;
	   Agile_SCRUM_Master_experience=agsme;
	   Consult_on_test_solutions=Consult_on_test;
	   Experience_in_Yrs__with_Software_Dev_Methodology_SDLC_Agile_SCRUM_Kanban_Iterative=ewsdmsdlc;
	   Participate_in_and_support_test_assessments=piasta;
	   Lead_test_assessments=Lead_test_assessment;
	   Experience_in_Yrs_testing_using_accelerators_like_CTD_Combinatorial_Test_Design=eintd;
	   Conduct_data_analytics_study=cdas;
	   
	   if(eID==""){
			  _id=""+Math.random(); 
			  
		   }
  }

  public String toString() {
    return "{ id: " + _id  + ",\nrev: "  + "EmployeeName:  " +  EmployeeName  + " EmployeeID: " + EmployeeID  +"Band: " + Banda +  "  Service Line: " +Service_Line +  "Bluepages Manager Name: " + Bluepages_Manager_Name+ "Service Area"+ Service_Area+"Primary Job Role: "+Primary_Job_Role  +"Test script creation: " + Test_script_creation + "Testdatacreation: " +Test_data_creation +"Execute Test Scripts" +Execute_test_scripts+ "Write defects: " +Write_defects+ "Effectively communicate to stakeholders/client: "+Effectively_communicate  + _rev   + "Use of HP Application Lifecycle" + Use_of_HP_Application_Lifecycle_Management_ALM+ "Use of Rational ClearCase: "+Use_of_Rational_ClearCase_and_ClearQuest+ "Use_of_Rational_Collaborative_Life_cycle_Management"+Use_of_Rational_Collaborative_Life_cycle_Management_clm_product + Use_of_Rational_Doors+  Use_of_Rational_Manual_Tester+ Use_of_Rational_Quality_Manager +Use_of_Rational_Requirements_Composer+Use_of_Rational_RequisitePro+Use_of_Rational_Software_Architect_Design_Manager +Use_of_Rational_Team_Concert+Use_Rational_TestManager +
    		
    		
    		 Continuos_Integration_Continuous_Testing+ Test_driven_development_TDD_Behavior_driven_development_BDD + Test_Architect_Technical_Leadership+ Create_test_plan+Create_test_data_plan+  Review_and_track_test_team_schedule_progress +Resource_onboarding+Prepare_Analyze_test_metrics+Create_test_estimates_and_budgets+Perform_cost_accounting_and_provide_status+Agile_SCRUM_Master_experience+Consult_on_test_solutions+Participate_in_and_support_test_assessments+Lead_test_assessments+Experience_in_Yrs_testing_using_accelerators_like_CTD_Combinatorial_Test_Design+Conduct_data_analytics_study+"\n}";
  }
}