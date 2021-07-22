package Regale;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Auftrag.Auftrag;
import GUI.GUI;

public class Regal1 {
	
	private JPanel regal1Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 1

	private JButton [] RegalVorne = new JButton[5];
	private JButton [] RegalHinten = new JButton[5];
	
	private JLabel Label1Regal = new JLabel();
	private JLabel Label1Vorne = new JLabel();
	private JLabel Label1Hinten = new JLabel();
	private Auftrag auftrag[] = new Auftrag[4];
	
	private void Components() {
		
		regal1Panel.setBounds(50 , 30, 370, 465);
		regal1Panel.setLayout(null);
		
		
		for(int i = 0; i < 5; i++){
			RegalVorne[i] = new JButton();
			RegalHinten[i] = new JButton();

			RegalVorne[i].setIcon(icnPlaceHolder);
			RegalHinten[i].setIcon(icnPlaceHolder);
			
			RegalVorne[i].setBorder(new LineBorder(Color.BLACK));
			RegalHinten[i].setBorder(new LineBorder(Color.BLACK));
			
			RegalVorne[i].setBackground(Color.WHITE);
			RegalVorne[i].setForeground(Color.BLACK);
			
			RegalHinten[i].setBackground(Color.WHITE);
			RegalHinten[i].setForeground(Color.BLACK);
			

			RegalVorne[i].setFocusPainted(false);
			RegalVorne[i].setMargin(new Insets(2, 2, 2, 2));
			

			RegalHinten[i].setFocusPainted(false);
			RegalHinten[i].setMargin(new Insets(2, 2, 2, 2));
			
		}
		
		int abstandy = 24;
		
		
		
		auftrag = GUI.getAuftragDaten();
		
		
		
		RegalVorne[0].setBounds(0, abstandy, 180, 80);
		RegalVorne[0].addActionListener(new ActionListener() {
	      int klick = 0;
	      public void actionPerformed(ActionEvent evt) {
	    	  try {
	    		  System.out.println("Test: " + auftrag[0].getAuftragArt());
	    	  }catch (Exception e) {
	    		  System.out.println(e);
	    	  }
	    	  
	    	  
	      }
	    });

	    abstandy=(abstandy + 82);
	    
	    RegalVorne[1].setBounds(0, abstandy, 180, 80);
	    RegalVorne[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[2].setBounds(0, abstandy, 180, 80);
	    RegalVorne[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[3].setBounds(0, abstandy, 180, 80);
	    RegalVorne[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[4].setBounds(0, abstandy, 180, 80);
	    RegalVorne[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    // Regal 1 Hinten
	    abstandy = 24;
	    RegalHinten[0].setBounds(185, abstandy, 180, 80);
	    RegalHinten[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[1].setBounds(185, abstandy, 180, 80);
	    RegalHinten[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[2].setBounds(185, abstandy, 180, 80);
	    RegalHinten[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[3].setBounds(185, abstandy, 180, 80);
	    RegalHinten[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[4].setBounds(185, abstandy, 180, 80);
	    RegalHinten[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });
	    
	    Label1Regal.setBounds(1, 0, 363, 20);
	    Label1Regal.setText("1. Regal");
	    Label1Regal.setHorizontalAlignment(SwingConstants.CENTER);
	    Label1Regal.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label1Regal.setBackground(Color.BLACK);
	    Label1Regal.setForeground(Color.WHITE);
	    Label1Regal.setOpaque(true);
	    
	    Label1Vorne.setBounds(1, 435, 177, 20);
	    Label1Vorne.setText("Vorne");
	    Label1Vorne.setHorizontalAlignment(SwingConstants.CENTER);
	    Label1Vorne.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label1Vorne.setBackground(Color.GREEN);
	    Label1Vorne.setOpaque(true);

	    Label1Hinten.setBounds(187, 435, 177, 20);
	    Label1Hinten.setText("Hinten");
	    Label1Hinten.setHorizontalAlignment(SwingConstants.CENTER);
	    Label1Hinten.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label1Hinten.setBackground(Color.YELLOW);
	    Label1Hinten.setOpaque(true);

		
		
		//Regal 1 Vorne
		regal1Panel.add(RegalVorne[0]);
		regal1Panel.add(RegalVorne[1]);
		regal1Panel.add(RegalVorne[2]);
		regal1Panel.add(RegalVorne[3]);
		regal1Panel.add(RegalVorne[4]);

		//Regal 1 Hinten
		regal1Panel.add(RegalHinten[0]);
		regal1Panel.add(RegalHinten[1]);
		regal1Panel.add(RegalHinten[2]);
		regal1Panel.add(RegalHinten[3]);
		regal1Panel.add(RegalHinten[4]);
		
		regal1Panel.add(Label1Regal);
		regal1Panel.add(Label1Vorne);
		regal1Panel.add(Label1Hinten);
		
		
		regal1Panel.setBackground(Color.GRAY);
		regal1Panel.setVisible(true);
	}
	
	public JPanel getJPanel() {
		Components();
		return regal1Panel;
	}
}
