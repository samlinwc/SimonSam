package simonsam.model;

public class Player {
	
	private String Name;
	private int ID;
	String Path;
	
	// two goalkeeper five midfield five defender three striker

	public Player(String Name, int ID, String Path) {
		this.Name = Name;
		this.ID = ID;
	}
	
	public String toString() {
		return Name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getPath() {
		return Path;
	}
	
	public void setPath(String Path) {
		this.Path = Path;
	}
}
