package simonsam.model;

public class GoalKeeper extends Player {

//	private String type = " GoalKeeper ";
	static String position = " GoalKeeper ";
	
	public GoalKeeper(String Name, int ID, String Path) {
		super(position, ID, Path);
		
		if ( Name == ""){
			position = " GoalKeeper ";
			return;
		}
		else if ( Name != ""){
			position = Name;
			return;
		}
	}

}
