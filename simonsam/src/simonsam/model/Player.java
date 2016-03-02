package simonsam.model;

public class Player {
	
	private String Name;
	private int ID;

	// two goalkeeper five midfield five defender three striker

	public Player(String Name, int ID ) {
		this.Name = Name;
		this.ID = ID;
	}
	
	public String toString(){
		return Name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}
}
