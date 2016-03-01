package simonsam.model;

public class Striker extends Player{
	
	private String type = " Striker ";
	static String position;

	public Striker(String Name, int ID) {
		super(position, ID);
		
		if ( Name == "" ){
			position = " Striker ";
			return;
		}
		else if ( Name != "" ){
			position = Name;
			return;
		}
	}
}
