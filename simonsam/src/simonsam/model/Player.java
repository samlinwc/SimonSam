package simonsam.model;

import java.nio.file.Path;

public class Player {
	String playername = new String();
	String playerID = new String();
	String imagepath = "None";
	
	public Player(String name, String ID, String path) {
		playername = name;
		playerID = ID;
		imagepath = path;
	}
	
	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}
	
	public String getPlayerID() {
		return playerID;
	}
	
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	
	public String getImagepath() {
		return imagepath;
	}
	
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
}


	
	