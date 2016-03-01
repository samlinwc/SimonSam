package simonsam.model;

public class Player {
	
	private String Name;
	private int ID;
	private String type;
	
	// two goalkeeper five midfield five defender three striker

	public Player(String Name, int ID ) {
		this.Name = Name;
		this.ID = ID;
	}
	
	public String toString(){
		return Name;
	}
	
	public String getType(){
		return type;
	}
}
