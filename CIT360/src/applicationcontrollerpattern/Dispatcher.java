package applicationcontrollerpattern;

public class Dispatcher {

	private Suits_Rating Suits;
	private Lost_Rating Lost;
	private TWD_Rating TWD;
	private NCIS_Rating NCIS;
	
	public Dispatcher() {
		Suits = new Suits_Rating();
		Lost = new Lost_Rating();
		TWD = new TWD_Rating();
		NCIS = new NCIS_Rating();
	}
	
	public void dispatch(String request) {
		if (request.equalsIgnoreCase("Suits")) {
			Suits.show();
		} else if (request.equalsIgnoreCase("Lost")) {
			Lost.show();
		} else if (request.equalsIgnoreCase("TWD")) {
			TWD.show();
		} else  {
			NCIS.show();
		}
	}
}
