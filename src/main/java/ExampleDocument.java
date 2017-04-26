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
	
  private String _rev = null;


  public ExampleDocument(String id, String eID, String Band, String sl, String BM, String SA) {
	   _id=eID;
	   EmployeeName=id;
	   EmployeeID=eID;
	   Banda=Band;
	   Service_Line=sl;
	   Bluepages_Manager_Name=BM;
	   Service_Area=SA;
  }

  public String toString() {
    return "{ id: " + _id  + ",\nrev: "  + "EmployeeName:  " +  EmployeeName  + " EmployeeID: " + EmployeeID  +"Band: " + Banda +  "  Service Line: " +Service_Line +  "Bluepages Manager Name: " + Bluepages_Manager_Name+ "Service Area"+ Service_Area+    _rev   + "\n}";
  }
}