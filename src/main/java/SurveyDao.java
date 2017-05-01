
import java.util.ArrayList;
import java.util.List;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import com.cloudant.client.api.Database;



public class SurveyDao {
	
	
	
private static final CloudantClient client = getCloudantClient();
	
	private static CloudantClient getCloudantClient(){
		CloudantClient client = ClientBuilder.account("5060a956-7908-48c8-9073-62fabef1f984-bluemix")
        .username("5060a956-7908-48c8-9073-62fabef1f984-bluemix")
        .password("740a2711602c0ed2dc0caf054b2954fe80f39e88994a8b193081da9647d29a09")
        .build();
		
		return client;
	}
	
	public static Database getibmbluesurveyDB(){
		//get database. if it does not exist create it
		return client.database("ibmbluesurvey_db", true);
	}
	

	
	
	
	public  void create (String id, String eid, String Band,String Serviceline, String Bmaneger, String ServiceArea, String PJR, String testS, String td, String ET, String WD, String Ec,String useofhp, String useofrational, String clm,String rd, String urmt,String urqm, String urrc, String urp, String uorsa,String uortc,String uortest, String cici,
			
			
			
			String tdd, String taa, String cpp, String cttt,String ctts,String sctts, String rca,String crty, String pat,String aaa,String crteab, String Perform_cost_accounting,String Agile_SCRUM_Master_experience, String Consult_on_test_solutions, String  Experience_in, String Participate_in_and_support_test_assessments, String Lead_test_assessments, String ta,String cd,String cdb,String dtpp,String btq,
			String leadt,String dt, String kp, String Write_p, String Rational, String ibmr, String qa, String HPq, String HPw, String HPu, String hpq, String ide, String strw, String Bulidp, String leadtEst, String dpt, String ktpba, String wpsc,
			String prt0, String hpqvlr, String hpc, String silickp, String apjj, String Parasoft_SOAtest, String Perform_mobile_application_testing, String Perform_security_testing, String Perform_data_analytics_testing, String Perform_testing_in_the_Cloud,String Perfrom_Agile_testing,String Junit_TestNG_Java, String Cucumber_Celerity,String _508_Testing_tools_JAWS,String _508_Testing_tools_Dragon,String _508_Testing_tools_Zoomtext,String _508_Testing_tools_Compliance_Sheriff,String _508_Testing_tools_Object_Inspector,String _508_Testing_tools_Java_Ferret,String _508_Testing_tools_Web_Accessibility_Toolbar_WAT,String _508_Testing_tools_Adobe_Acrobat_Pro_PDF,String iatcf, String IA_Tool_Scan_AppScan, String _Knowledge_of_Programming_Languages,String Java_J2EE_Net_Perl_Python, String retail, String manufact, String Health_Care, String Transportation, String banking, String finance, String Government, String Current_Clearance_s_status, String Additional_Comments  ){
		
		System.out.println("Server Version: " + client.serverVersion());
		
		
		
		List<String> databases = client.getAllDbs();
		System.out.println("All my databases : ");
		for ( String db : databases ) {
			System.out.println(db);
		}
	
		
//		client.createDB("example_db");
//		Database db = client.database("example_db", false);
//		db.save(new ExampleDocument(true));
//		System.out.println("You have inserted the document");
	
		  
		
		Database dbb= getibmbluesurveyDB();
		dbb.save(new ExampleDocument(id,eid,Band,Serviceline,Bmaneger,ServiceArea,PJR,testS, td,ET,WD,Ec,useofhp,useofrational,clm,rd,urmt,urqm,urrc,urp,uorsa,uortc,uortest,cici,tdd,taa,cpp,cttt,ctts,sctts,rca,crty,pat,aaa,crteab,Perform_cost_accounting,Agile_SCRUM_Master_experience,Consult_on_test_solutions,Experience_in,Participate_in_and_support_test_assessments,Lead_test_assessments,ta,cd,cdb,dtpp,btq,leadt,
				dt,kp, Write_p, Rational,ibmr,qa,HPq,HPw,HPu,hpq,ide,strw,Bulidp,leadtEst,dpt,ktpba,wpsc,prt0,hpqvlr,hpc,silickp,apjj,Parasoft_SOAtest,Perform_mobile_application_testing,Perform_security_testing,Perform_data_analytics_testing, Perform_testing_in_the_Cloud, Perfrom_Agile_testing,Junit_TestNG_Java,Cucumber_Celerity,_508_Testing_tools_JAWS,_508_Testing_tools_Dragon,_508_Testing_tools_Zoomtext,_508_Testing_tools_Compliance_Sheriff,_508_Testing_tools_Object_Inspector,_508_Testing_tools_Java_Ferret,_508_Testing_tools_Web_Accessibility_Toolbar_WAT,_508_Testing_tools_Adobe_Acrobat_Pro_PDF,iatcf,IA_Tool_Scan_AppScan,_Knowledge_of_Programming_Languages,Java_J2EE_Net_Perl_Python,retail,manufact,Health_Care,Transportation,banking,finance,Government,Current_Clearance_s_status, Additional_Comments));
		
		
	}




	
















}

