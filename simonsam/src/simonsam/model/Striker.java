package simonsam.model;

public class Striker extends Player{
	
	private String type = " Striker ";
	static String position = " Striker ";

	public Striker(String Name, int ID,String Path) {
		super(position, ID, Path);
		
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
