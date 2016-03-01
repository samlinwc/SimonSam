package simonsam.model;

public class GoalKeeper extends Player {

	private String type = " GoalKeeper ";
	
	public GoalKeeper(String Name, int ID) {
		super(Name, ID);
		if (Name == ""){
			 Name = type;
			 return;
			 
		}
	}
	
}
