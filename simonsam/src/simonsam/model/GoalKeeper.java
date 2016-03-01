package simonsam.model;

public class GoalKeeper extends Player {

	private String type = " GoalKeeper ";
	static String position;
	
	public GoalKeeper(String Name, int ID) {
		super(position, ID);
		
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
