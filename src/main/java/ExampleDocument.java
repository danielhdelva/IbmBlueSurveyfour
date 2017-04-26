public class ExampleDocument {
  
//	surveyaccess  s = new surveyaccess();
//	private String _id = s.eename;
	public  String _id ="";
  private String _rev = null;
  private boolean isExample;

  public ExampleDocument(String id) {
	   _id=id;
  }

  public String toString() {
    return "{ id: " + _id + ",\nrev: " + _rev + ",\nisExample: " + isExample + "\n}";
  }
}