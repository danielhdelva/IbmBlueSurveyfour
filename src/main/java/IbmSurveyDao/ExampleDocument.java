package IbmSurveyDao;

public class ExampleDocument {
	  private String _id = "example";
	  private String _rev = null;
	  private boolean isExample;

	  public ExampleDocument(boolean isExample) {
	    this.isExample = isExample;
	  }

	  public String toString() {
	    return "{ id: " + _id + ",\nrev: " + _rev + ",\nisExample: " + isExample + "\n}";
	  }
	}


