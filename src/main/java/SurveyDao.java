
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
			String prt0, String hpqvlr){
		
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
				dt,kp, Write_p, Rational,ibmr,qa,HPq,HPw,HPu,hpq,ide,strw,Bulidp,leadtEst,dpt,ktpba,wpsc,prt0,hpqvlr));
		
		
	}




	
















}

