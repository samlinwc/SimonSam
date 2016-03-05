package simonsam.model;

import java.awt.List;

public class Squad {
	
	Player[] players = new Player[15];
	
	
	public Squad(){
		generate();
	}

	private void generate() {
		
		int count = 0;
		
		for( int i = 0 ; i < 2  ; i++){
			GoalKeeper goalkeeper = new GoalKeeper( "" , count, "None");
			players[i]= goalkeeper;
			count++;
			System.out.println(count);
			System.out.println(goalkeeper);
		}
		for( int i = 0 ;  i < 5 ; i++){
			MidField midfield = new MidField( "" , count, "None" );
			players[i]= midfield;
			count++;
			System.out.println(count);
			System.out.println(midfield);
		}
		for( int i = 0 ; i < 5  ; i++){
			Defender defender = new Defender( "" , count, "None");
			players[i]= defender;
			count++;
			System.out.println(count);
			System.out.println(defender);
		}
		for( int i = 0 ; i < 3  ; i++){
			Striker striker = new Striker( "" , count, "None" );
			players[i]= striker;
			count++;
			System.out.println(count);
                                               
			
			System.out.println(striker);
		}
		
		/*
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
		*/
	}	

}
