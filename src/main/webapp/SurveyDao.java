package IbmSurveyDao;
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
	

	
	
	
	public static void main (String []args){
		
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
		dbb.save(new ExampleDocument(true));
		
		
	}




	
















}

