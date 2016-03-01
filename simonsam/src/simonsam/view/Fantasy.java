package simonsam.view;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fantasy extends JFrame {
	
	public Fantasy() {
		
		super(" Fantasy Football ");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createWidgets();
		
		this.setVisible(true);
		
	}
	
	private void createWidgets(){
		
		String [] formation = {"Select formation", "4-4-2" , "4-3-3", "3-5-2", "5-3-2", "3-4-3", "4-5-1"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox SelectFormation = new JComboBox(formation);
		this.setSize(600, 800);
		this.setLayout(new BorderLayout());
		SelectFormation.setSize(getWidth()-20, 50);
		
		this.add(SelectFormation,BorderLayout.NORTH);
	}

}
