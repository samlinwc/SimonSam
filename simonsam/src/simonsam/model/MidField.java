package simonsam.model;

public class MidField extends Player {

	static String position = " MidField ";
	
	public MidField(String Name, int ID) {
		super(position, ID);
		
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
