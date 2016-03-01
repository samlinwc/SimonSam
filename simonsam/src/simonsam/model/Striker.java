package simonsam.model;

public class Striker extends Player{
	
	private String type = " Striker ";

	public Striker(String Name, int ID) {
		super(Name, ID);
		if (Name == ""){
			return;
		}
	}
}
