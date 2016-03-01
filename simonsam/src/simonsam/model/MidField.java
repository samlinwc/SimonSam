package simonsam.model;

public class MidField extends Player {

	private String type = " MidField ";
	
	public MidField(String Name, int ID) {
		super(Name, ID);
		if (Name == ""){
			 return;
		}
	}

}
