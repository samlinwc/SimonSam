package simonsam.model;

public class Defender extends Player {
	
	private String type = " Defender ";
	static String position = " Defender ";
	
	public Defender(String Name, int ID, String Path) {
		super(position, ID, Path);
		
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
