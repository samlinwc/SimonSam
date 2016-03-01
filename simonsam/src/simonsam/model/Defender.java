package simonsam.model;

public class Defender extends Player {
	
	public String type = " Defender ";

	public Defender(String Name, int ID) {
		super(Name, ID);
		
		if (Name == ""){
			Name = "Striker";
			return;
		}
		else if (Name != ""){
			return;
		}
	}

}
