package simonsam.model;

public class MidField extends Player {

	static String position = " MidField ";
	
	public MidField(String Name, int ID, String Path) {
		super(position, ID,Path);
		
		if ( Name == ""){
			position = " MidField ";
			return;
		}
		else if ( Name != ""){
			position = Name;
			return;
		}
	}

}
