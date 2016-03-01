package simonsam.model;

import java.util.ArrayList;

import simonsam.model.Player;

public class Squad {
	
	private ArrayList<Player> PlayerList;
	
	public Squad(){
		CreatePlayerList();
		System.out.println(PlayerList);
	}

	private void CreatePlayerList() {
		
		PlayerList = new ArrayList<Player>();

		GoalKeeper Shen = new GoalKeeper( "" , 0);
		PlayerList.add(Shen);
		GoalKeeper Mundo = new GoalKeeper( "" , 1111);
		PlayerList.add(Mundo);
		Striker Nidalee = new Striker( "" , 1);
		PlayerList.add(Nidalee);
		Striker Caitlin = new Striker( "" , 11);
		PlayerList.add(Caitlin);
		Striker Lucian = new Striker( "" , 100);
		PlayerList.add(Lucian);
		MidField KogMaw = new MidField( "" , 10);
		PlayerList.add(KogMaw);
		MidField Ezreal = new MidField( "" , 101);
		PlayerList.add(Ezreal);
		MidField Ahri = new MidField( "" , 111);
		PlayerList.add(Ahri);
		MidField Varus = new MidField( "" , 1000);
		PlayerList.add(Varus);
		MidField Kalista = new MidField( "" , 1001);
		PlayerList.add(Kalista);
		Defender Veigar = new Defender( "" , 1010);
		PlayerList.add(Veigar);
		Defender Brand = new Defender( "" , 1011);
		PlayerList.add(Brand);
		Defender Sona = new Defender( "" , 1100);
		PlayerList.add(Sona);
		Defender Jhin = new Defender( "" , 1101);
		PlayerList.add(Jhin);
		Defender Syndra = new Defender( "" , 1110);
		PlayerList.add(Syndra);
	}
	
	public ArrayList<Player> getPlayerList(){
		return PlayerList;
	}

}
