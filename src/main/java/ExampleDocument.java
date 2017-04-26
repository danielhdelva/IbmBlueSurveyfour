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
	
    private String _rev = null;


  public ExampleDocument(String id, String eID, String Band, String sl, String BM, String SA, String PJR, String ts,String td,String ET, String WD) {
	   _id=eID;
	   EmployeeName=id;
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
  }

  public String toString() {
    return "{ id: " + _id  + ",\nrev: "  + "EmployeeName:  " +  EmployeeName  + " EmployeeID: " + EmployeeID  +"Band: " + Banda +  "  Service Line: " +Service_Line +  "Bluepages Manager Name: " + Bluepages_Manager_Name+ "Service Area"+ Service_Area+"Primary Job Role: "+Primary_Job_Role  +"Test script creation: " + Test_script_creation + "Testdatacreation: " +Test_data_creation +"Execute Test Scripts" +Execute_test_scripts+ "Write defects: " +Write_defects+  _rev   + "\n}";
  }
}