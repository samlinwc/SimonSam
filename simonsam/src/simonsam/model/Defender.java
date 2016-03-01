package simonsam.model;

public class Defender extends Player {
	
	private String type = " Defender ";
	static String position;

	public Defender(String Name, int ID) {
		super(position, ID);
		
		if ( Name == ""){
			position = " Defender ";
			return;
		}
		else if ( Name != ""){
			position = Name;			
			return;
		}
	}

}
