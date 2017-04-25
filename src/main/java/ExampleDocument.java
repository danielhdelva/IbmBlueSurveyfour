public class ExampleDocument {
  
	surveyaccess  s = new surveyaccess();
	private String _id = s.eename;
  private String _rev = null;
  private boolean isExample;

  public ExampleDocument(boolean isExample) {
    this.isExample = isExample;
  }

  public String toString() {
    return "{ id: " + _id + ",\nrev: " + _rev + ",\nisExample: " + isExample + "\n}";
  }
}