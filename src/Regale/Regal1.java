package Regale;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


import Auftrag.Auftrag;
import Controls.Controls;
import GUI.GUI;
import Product.*;

public class Regal1 {
	
	private JPanel regal1Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 1

	public static JButton [] RegalVorne = new JButton[5];
	public static JButton [] RegalHinten = new JButton[5];
	
	private JLabel Label1Regal = new JLabel();
	private JLabel Label1Vorne = new JLabel();
	private JLabel Label1Hinten = new JLabel();
	private Auftrag auftrag[] = new Auftrag[4];
	private int auftragIndex;
	private boolean auftragSelected[] = new boolean[4];

	
	//Platzhalter
	private static boolean [] regalVornePH = new boolean[5];
	private static boolean [] regalHintenPH = new boolean[5];

	private Product [] ProduktVorne = new Product[5];
	private Product [] ProduktHinten = new Product[5];
	
	private JButton [] Regal2Vorne = new JButton[5];
	private JButton [] Regal2Hinten = new JButton[5];

	private boolean [] Regal2VornePH = new boolean[5];
	private boolean [] Regal2HintenPH = new boolean[5];
	
	
	private void Components() {
		
		regal1Panel.setBounds(50 , 30, 370, 465);
		regal1Panel.setLayout(null);
		
		
		Regal2Vorne = Regal2.getRegalVorne();
		Regal2Hinten = Regal2.getRegalHinten();		
		Regal2VornePH = Regal2.getRegalVornePH();
		Regal2HintenPH = Regal2.getRegalHintenPH();
		
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
			
			
			regalVornePH[i] = false;
			regalHintenPH[i] = false;
			
			ProduktVorne[i] = new Product();
			ProduktHinten[i] = new Product();
		}
		
		
		int abstandy = 24;
		RegalVorne[0].setBounds(0, abstandy, 180, 80);
		RegalVorne[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveVorne(0);
	    	  if(Controls.getMove() && RegalVorne[1].isSelected()) {
	    		  RegalVorne[1].setSelected(false);
	    		  RegalVorne[0].setIcon(RegalVorne[1].getIcon());
	    		  RegalVorne[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  GUI.doneMove(true);
	    		  Controls.setMove(false);
	    		  regalVornePH[1] = false;
	    		  regalVornePH[0] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[0].isSelected()) {
	    		  RegalHinten[0].setSelected(false);
	    		  RegalVorne[0].setIcon(RegalHinten[0].getIcon());
	    		  RegalHinten[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[0] = false;
	    		  regalVornePH[0] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Vorne[0].isSelected()) {
	    		  Regal2Vorne[0].setSelected(false);
	    		  RegalVorne[0].setIcon(Regal2Vorne[0].getIcon());
	    		  Regal2Vorne[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2VornePH[0] = false;
	    		  regalVornePH[0] = true;
	    	  }
	    	  
	    	  buttonClickVorne(0);
	      }
	    });

	    abstandy=(abstandy + 82);
	    
	    RegalVorne[1].setBounds(0, abstandy, 180, 80);
	    RegalVorne[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveVorne(1);
	    	  
	    	  if(Controls.getMove() && RegalVorne[0].isSelected()) {
	    		  RegalVorne[0].setSelected(false);
	    		  RegalVorne[1].setIcon(RegalVorne[0].getIcon());
	    		  RegalVorne[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[0] = false;
	    		  regalVornePH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[2].isSelected()) {
	    		  RegalVorne[2].setSelected(false);
	    		  RegalVorne[1].setIcon(RegalVorne[2].getIcon());
	    		  RegalVorne[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[2] = false;
	    		  regalVornePH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[1].isSelected()) {
	    		  RegalHinten[1].setSelected(false);
	    		  RegalVorne[1].setIcon(RegalHinten[1].getIcon());
	    		  RegalHinten[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[1] = false;
	    		  regalVornePH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Vorne[1].isSelected()) {
	    		  Regal2Vorne[1].setSelected(false);
	    		  RegalVorne[1].setIcon(Regal2Vorne[1].getIcon());
	    		  Regal2Vorne[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2VornePH[1] = false;
	    		  regalVornePH[1] = true;
	    	  }
	    	  
	    	  buttonClickVorne(1);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[2].setBounds(0, abstandy, 180, 80);
	    RegalVorne[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveVorne(2);
	    	  if(Controls.getMove() && RegalVorne[1].isSelected()) {
	    		  RegalVorne[1].setSelected(false);
	    		  RegalVorne[2].setIcon(RegalVorne[1].getIcon());
	    		  RegalVorne[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[1] = false;
	    		  regalVornePH[2] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[3].isSelected()) {
	    		  RegalVorne[3].setSelected(false);
	    		  RegalVorne[2].setIcon(RegalVorne[3].getIcon());
	    		  RegalVorne[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[3] = false;
	    		  regalVornePH[2] = true;
	    	  }
	    	  if(Controls.getMove() && RegalHinten[2].isSelected()) {
	    		  RegalHinten[2].setSelected(false);
	    		  RegalVorne[2].setIcon(RegalHinten[2].getIcon());
	    		  RegalHinten[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[2] = false;
	    		  regalVornePH[2] = true;
	    	  }
	    	  if(Controls.getMove() && Regal2Vorne[2].isSelected()) {
	    		  Regal2Vorne[2].setSelected(false);
	    		  RegalVorne[2].setIcon(Regal2Vorne[2].getIcon());
	    		  Regal2Vorne[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2VornePH[2] = false;
	    		  regalVornePH[2] = true;
	    	  }
	    	  
	    	  buttonClickVorne(2);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[3].setBounds(0, abstandy, 180, 80);
	    RegalVorne[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveVorne(3);
	    	  
	    	  if(Controls.getMove() && RegalVorne[2].isSelected()) {
	    		  RegalVorne[2].setSelected(false);
	    		  RegalVorne[3].setIcon(RegalVorne[2].getIcon());
	    		  RegalVorne[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[2] = false;
	    		  regalVornePH[3] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[4].isSelected()) {
	    		  RegalVorne[4].setSelected(false);
	    		  RegalVorne[3].setIcon(RegalVorne[4].getIcon());
	    		  RegalVorne[4].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[4] = false;
	    		  regalVornePH[3] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[3].isSelected()) {
	    		  RegalHinten[3].setSelected(false);
	    		  RegalVorne[3].setIcon(RegalHinten[3].getIcon());
	    		  RegalHinten[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[3] = false;
	    		  regalVornePH[3] = true;
	    	  }
	    	  if(Controls.getMove() && Regal2Vorne[3].isSelected()) {
	    		  Regal2Vorne[3].setSelected(false);
	    		  RegalVorne[3].setIcon(Regal2Vorne[3].getIcon());
	    		  Regal2Vorne[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2VornePH[3] = false;
	    		  regalVornePH[3] = true;
	    	  }
	    	  
	    	  buttonClickVorne(3);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[4].setBounds(0, abstandy, 180, 80);
	    RegalVorne[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveVorne(4);
	    	  
	    	  if(Controls.getMove() && RegalVorne[3].isSelected()) {
	    		  RegalVorne[3].setSelected(false);
	    		  RegalVorne[4].setIcon(RegalVorne[3].getIcon());
	    		  RegalVorne[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[3] = false;
	    		  regalVornePH[4] = true;
	    	  }
	    	  
	    	  
	    	  if(Controls.getMove() && RegalHinten[4].isSelected()) {
	    		  RegalHinten[4].setSelected(false);
	    		  RegalVorne[4].setIcon(RegalHinten[4].getIcon());
	    		  RegalHinten[4].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[4] = false;
	    		  regalVornePH[4] = true;
	    	  }
	    	  if(Controls.getMove() && Regal2Vorne[3].isSelected()) {
	    		  Regal2Vorne[3].setSelected(false);
	    		  RegalVorne[3].setIcon(Regal2Vorne[3].getIcon());
	    		  Regal2Vorne[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2VornePH[3] = false;
	    		  regalVornePH[4] = true;
	    	  }
	    	  
	    	  buttonClickVorne(4);
	      }
	    });

	    // Regal 1 Hinten
	    abstandy = 24;
	    RegalHinten[0].setBounds(185, abstandy, 180, 80);
	    RegalHinten[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveHinten(0);
	    	  
	    	  if(Controls.getMove() && RegalHinten[1].isSelected()) {
	    		  RegalHinten[1].setSelected(false);
	    		  RegalHinten[0].setIcon(RegalHinten[1].getIcon());
	    		  RegalHinten[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[1] = false;
	    		  regalHintenPH[0] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[0].isSelected()) {
	    		  RegalVorne[0].setSelected(false);
	    		  RegalHinten[0].setIcon(RegalVorne[0].getIcon());
	    		  RegalVorne[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[0] = false;
	    		  regalHintenPH[0] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Hinten[0].isSelected()) {
	    		  Regal2Hinten[0].setSelected(false);
	    		  RegalHinten[0].setIcon(Regal2Hinten[0].getIcon());
	    		  Regal2Hinten[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2HintenPH[0] = false;
	    		  regalHintenPH[0] = true;
	    	  }
	    	  
	    	  buttonClickHinten(0);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[1].setBounds(185, abstandy, 180, 80);
	    RegalHinten[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveHinten(1);
	    	  
	    	  if(Controls.getMove() && RegalHinten[0].isSelected()) {
	    		  RegalHinten[0].setSelected(false);
	    		  RegalHinten[1].setIcon(RegalHinten[0].getIcon());
	    		  RegalHinten[0].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[0] = false;
	    		  regalHintenPH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[2].isSelected()) {
	    		  RegalHinten[2].setSelected(false);
	    		  RegalHinten[1].setIcon(RegalHinten[2].getIcon());
	    		  RegalHinten[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[2] = false;
	    		  regalHintenPH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[1].isSelected()) {
	    		  RegalVorne[1].setSelected(false);
	    		  RegalHinten[1].setIcon(RegalVorne[1].getIcon());
	    		  RegalVorne[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[1] = false;
	    		  regalHintenPH[1] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Hinten[1].isSelected()) {
	    		  Regal2Hinten[1].setSelected(false);
	    		  RegalHinten[1].setIcon(Regal2Hinten[1].getIcon());
	    		  Regal2Hinten[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2HintenPH[1] = false;
	    		  regalHintenPH[1] = true;
	    	  }
	    	  
	    	  
	    	  buttonClickHinten(1);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[2].setBounds(185, abstandy, 180, 80);
	    RegalHinten[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveHinten(2);
	    	  
	    	  if(Controls.getMove() && RegalHinten[1].isSelected()) {
	    		  RegalHinten[1].setSelected(false);
	    		  RegalHinten[2].setIcon(RegalHinten[1].getIcon());
	    		  RegalHinten[1].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[1] = false;
	    		  regalHintenPH[2] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[3].isSelected()) {
	    		  RegalHinten[3].setSelected(false);
	    		  RegalHinten[2].setIcon(RegalHinten[3].getIcon());
	    		  RegalHinten[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[3] = false;
	    		  regalHintenPH[2] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[2].isSelected()) {
	    		  RegalVorne[2].setSelected(false);
	    		  RegalHinten[2].setIcon(RegalVorne[2].getIcon());
	    		  RegalVorne[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[2] = false;
	    		  regalHintenPH[2] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Hinten[2].isSelected()) {
	    		  Regal2Hinten[2].setSelected(false);
	    		  RegalHinten[2].setIcon(Regal2Hinten[2].getIcon());
	    		  Regal2Hinten[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2HintenPH[2] = false;
	    		  regalHintenPH[2] = true;
	    	  }
	    	  
	    	  
	    	  buttonClickHinten(2);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[3].setBounds(185, abstandy, 180, 80);
	    RegalHinten[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveHinten(3);
	    	  
	    	  if(Controls.getMove() && RegalHinten[2].isSelected()) {
	    		  RegalHinten[2].setSelected(false);
	    		  RegalHinten[3].setIcon(RegalHinten[2].getIcon());
	    		  RegalHinten[2].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[2] = false;
	    		  regalHintenPH[3] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalHinten[4].isSelected()) {
	    		  RegalHinten[4].setSelected(false);
	    		  RegalHinten[3].setIcon(RegalHinten[4].getIcon());
	    		  RegalHinten[4].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[4] = false;
	    		  regalHintenPH[3] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[3].isSelected()) {
	    		  RegalVorne[3].setSelected(false);
	    		  RegalHinten[3].setIcon(RegalVorne[3].getIcon());
	    		  RegalVorne[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[3] = false;
	    		  regalHintenPH[3] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Hinten[3].isSelected()) {
	    		  Regal2Hinten[3].setSelected(false);
	    		  RegalHinten[3].setIcon(Regal2Hinten[3].getIcon());
	    		  Regal2Hinten[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2HintenPH[3] = false;
	    		  regalHintenPH[3] = true;
	    	  }
	    	  
	    	  buttonClickHinten(3); 
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[4].setBounds(185, abstandy, 180, 80);
	    RegalHinten[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  funcMoveHinten(4);
	    	  
	    	  if(Controls.getMove() && RegalHinten[3].isSelected()) {
	    		  RegalHinten[3].setSelected(false);
	    		  RegalHinten[4].setIcon(RegalHinten[3].getIcon());
	    		  RegalHinten[3].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalHintenPH[3] = false;
	    		  regalHintenPH[4] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && RegalVorne[4].isSelected()) {
	    		  RegalVorne[4].setSelected(false);
	    		  RegalHinten[4].setIcon(RegalVorne[4].getIcon());
	    		  RegalVorne[4].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  regalVornePH[4] = false;
	    		  regalHintenPH[4] = true;
	    	  }
	    	  
	    	  if(Controls.getMove() && Regal2Hinten[4].isSelected()) {
	    		  Regal2Hinten[4].setSelected(false);
	    		  RegalHinten[4].setIcon(Regal2Hinten[4].getIcon());
	    		  Regal2Hinten[4].setIcon(icnPlaceHolder);
	    		  allWhite();
	    		  Controls.setMove(false);
	    		  GUI.doneMove(true);
	    		  Regal2HintenPH[4] = false;
	    		  regalHintenPH[4] = true;
	    	  }
	    	  
	    	  buttonClickHinten(4);
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
	
	private boolean setIconInfo(int index, boolean [] ph, Product [] product, JButton [] btnRegal) {

		try {
	  		product[index].setProductType(auftrag[auftragIndex].getProdukt());
	  	}catch (Exception e) {
	  		  System.out.println(e);
	  	}
	  	boolean leicht = false;
	  	boolean mittel = false;
	  	boolean schwer = false;
	  	String iconPath = "";

		if(ph[index] == false && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung")) {
			ph[index] = true;
  			if(product[index].getProduktType().equals("Papier")) {
  				product[index] = new Papier();
  				//.equals() & eine einfache String "" unterscheiden sich an irgendein Punkt
  				//Papier(auftrag[auftragIndex].getAuftragAttribut_1(), ...) wärre hier Fehlerhaft
  				if(auftrag[auftragIndex].getAttribut_1().equals("Weiß")) {
  					((Papier) product[index]).setFarbe("Weiß");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Blau")) {
  					((Papier) product[index]).setFarbe("Blau");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Grün")) {
  					((Papier) product[index]).setFarbe("Grün");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A4")) {
  					((Papier) product[index]).setGroesse("A4");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A3")) {
  					((Papier) product[index]).setGroesse("A3");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("A5")) {
  					((Papier) product[index]).setGroesse("A5");
  				}
  				btnRegal[index].setIcon(((Papier) product[index]).getIcon());
  				iconPath = btnRegal[index].getIcon().toString();
  				System.out.println("[icon]: " + iconPath);

  				if (iconPath.contains("placeholder.png")) {
  					auftrag[auftragIndex].setAuftragDone(false);
				}else {
					auftrag[auftragIndex].setAuftragDone(true);
				}

  			}
  			if(product[index].getProduktType().equals("Holz")) {
  				product[index] = new Holz();
  				if(auftrag[auftragIndex].getAttribut_1().equals("Kiefer")) {
  					((Holz) product[index]).setArt("Kiefer");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Buche")) {
  					((Holz) product[index]).setArt("Buche");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Eiche")) {
  					((Holz) product[index]).setArt("Eiche");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Bretter")) {
  					((Holz) product[index]).setForm("Bretter");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Balken")) {
  					((Holz) product[index]).setForm("Balken");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Scheit")) {
  					((Holz) product[index]).setForm("Scheit");
  				}


  				btnRegal[index].setIcon(((Holz) product[index]).getIcon());
  				iconPath = btnRegal[index].getIcon().toString();
  				System.out.println("[icon]: " + iconPath);

  				if (iconPath.contains("placeholder.png")) {
  					auftrag[auftragIndex].setAuftragDone(false);
				}else {
					auftrag[auftragIndex].setAuftragDone(true);
				}

  			}
  			if(product[index].getProduktType().equals("Stein")) {
  				product[index] = new Stein();
  				if(auftrag[auftragIndex].getAttribut_1().equals("Marmor")) {
  					((Stein) product[index]).setArt("Marmor");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Granit")) {
  					((Stein) product[index]).setArt("Granit");
  				}
  				if(auftrag[auftragIndex].getAttribut_1().equals("Sandstein")) {
  					((Stein) product[index]).setArt("Sandstein");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Leicht")) {
  					((Stein) product[index]).setGewicht("Leicht");
  					leicht = true;
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Mittel")) {
  					((Stein) product[index]).setGewicht("Mittel");
  					mittel = true;
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Schwer")) {
  					((Stein) product[index]).setGewicht("Schwer");
  					schwer = true;
  				}

  				if(schwer && (index == 3 || index == 4)) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}

  				}else if(schwer && (index == 0 || index == 1 || index == 2)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
					ph[index] = false;
  				}

  				if(mittel && (index == 1 || index == 2 || index == 3 || index == 4)) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}

  				}else if(mittel && (index == 0)){
  					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Stein zu Schwer!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
					ph[index] = false;

  				}

  				if(leicht) {
  					btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  					iconPath = btnRegal[index].getIcon().toString();
  	  				System.out.println("[icon]: " + iconPath);

  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(false);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(true);
  					}
  				}
  			}

  		 }
		if(ph[index] == false && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Auslagerung")){

  			if (btnRegal[index].getIcon().toString().contains("placeholder.png") == true) {
  				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame ,
			    "Lagerplatz leer!",
			    "Fehler",
			    JOptionPane.ERROR_MESSAGE);
			}
  		 }

		funcAuslagerung(index, ph, product, btnRegal);

		return true;
	}

	private void buttonClickVorne(int index) {
		try {
  		  auftrag = GUI.getAuftragDaten();
  	  	  auftragSelected = GUI.getAuftragSelected();
	  	  for(int i = 0; i < 4; i++) {
		  	if(auftragSelected[i] == true) {
					auftragIndex = i;
			}
	  	  }
	  		if(auftrag[auftragIndex].getProdukt().equals("Holz") && auftrag[auftragIndex].getAttribut_2().equals("Balken") && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung") && RegalVorne[index].getIcon().toString().contains("placeholder.png") == true) {
		  		if(RegalHinten[index].getIcon().toString().contains("placeholder.png") == true) {
		    		setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		    		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		    	 }else if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == false && RegalHinten[index].getIcon().toString().contains("placeholder.png") == false) {
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
					"Platz Belegt!",
					"Fehler",
					JOptionPane.ERROR_MESSAGE);
					regalVornePH[auftragIndex] = false;
		    	  }else {
		    		  JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame ,
						"Balken benötigen zwei Lagerplätze!\n befreien Sie zuerst ein Lagerplatz",
						"Fehler",
						JOptionPane.ERROR_MESSAGE);
						regalVornePH[auftragIndex] = false;
		    	  }
		  	  }else {
		  		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		  	  }
	  	  
    	  if(auftrag[auftragIndex].getAuftragDone() == true) {
    		  GUI.doneAuftrag(auftragIndex);
    	  }else {
    		  System.out.println("Do nothing!!");
    	  }
    	  if(index == 4) {
    		  boolean verschrotten = Controls.getVerschrotten();
      	  	
  	  		if(verschrotten == true && RegalHinten[index].getIcon().toString().contains("Balken.png")) {
  	  			regalVornePH[index] = false;
  	  			RegalVorne[index].setIcon(icnPlaceHolder);
  	  			ProduktVorne[index] = new Product();
  	  			regalHintenPH[index] = false;
  	  			RegalHinten[index].setIcon(icnPlaceHolder);
  	  			ProduktHinten[index] = new Product();
  	  			GUI.doneVerschrotten(false);
  	  		}else if(verschrotten == true && !(RegalVorne[index].getIcon().toString().contains("placeholder.png") == true)) {
  	  			regalVornePH[index] = false;
  	  			RegalVorne[index].setIcon(icnPlaceHolder);
  	  			ProduktVorne[index] = new Product();
  	  			GUI.doneVerschrotten(false);
  	  		}
    	  }else {
    		  System.out.println("Verschrotten klick!");
    	  }
    	  
    	  	
    	  
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void buttonClickHinten(int index) {
		try {
  		  auftrag = GUI.getAuftragDaten();
	  	  	  auftragSelected = GUI.getAuftragSelected();
		  	  for(int i = 0; i < 4; i++) {
			  	if(auftragSelected[i] == true) {
						auftragIndex = i;
				}
		  	  }

		  	if(auftrag[auftragIndex].getProdukt().equals("Holz") && auftrag[auftragIndex].getAttribut_2().equals("Balken") && auftrag[auftragIndex].getAuftragArt().equals("Einlagerung") && RegalHinten[index].getIcon().toString().contains("placeholder.png") == true) {
		  		if(ProduktVorne[index].getIcon().toString().contains("placeholder.png") == true) {
		    		setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		    		setIconInfo(index, regalVornePH, ProduktVorne, RegalVorne);
		    	  }else if(RegalVorne[index].getIcon().toString().contains("placeholder.png") == false && RegalHinten[index].getIcon().toString().contains("placeholder.png") == false) {
						JFrame frame = new JFrame();
						JOptionPane.showMessageDialog(frame ,
						"Platz Belegt!",
						"Fehler",
						JOptionPane.ERROR_MESSAGE);
						regalVornePH[auftragIndex] = false;
			    	  }else {
			    		  JFrame frame = new JFrame();
							JOptionPane.showMessageDialog(frame ,
							"Balken benötigen zwei Lagerplätze!\n befreien Sie zuerst ein Lagerplatz",
							"Fehler",
							JOptionPane.ERROR_MESSAGE);
							regalVornePH[auftragIndex] = false;
			    	 }
		  	  }else {
		  		  if(RegalVorne[index].getIcon().toString().contains("placeholder.png") == false && RegalHinten[index].getIcon().toString().contains("placeholder.png") == true){

		  			JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
					"Eingang blockiert!\n befreien Sie zuerst den Eingang oder nehmen Sie ein weiterer Lagerplatz",
					"Fehler",
					JOptionPane.ERROR_MESSAGE);
					regalHintenPH[auftragIndex] = false;
		  		  }else {
		  			setIconInfo(index, regalHintenPH, ProduktHinten, RegalHinten);
		  		  }
		  	  }

	    	  if(auftrag[auftragIndex].getAuftragDone() == true) {
	    		  GUI.doneAuftrag(auftragIndex);
	    	  }else {
	    		  System.out.println("Do nothing!!");
	    	  }
	    	  if(index == 4) {
	    		  boolean verschrotten = Controls.getVerschrotten();
		    	  if(verschrotten == true && RegalVorne[index].getIcon().toString().contains("Balken.png")) {
		  			regalVornePH[index] = false;
		  			RegalVorne[index].setIcon(icnPlaceHolder);
		  			ProduktVorne[index] = new Product();
		  			regalHintenPH[index] = false;
		  			RegalHinten[index].setIcon(icnPlaceHolder);
		  			ProduktHinten[index] = new Product();
		  			GUI.doneVerschrotten(false);
			  	  }else if(verschrotten == true && !(RegalHinten[index].getIcon().toString().contains("placeholder.png") == true)) {
		  			regalHintenPH[index] = false;
		  			RegalHinten[index].setIcon(icnPlaceHolder);
		  			ProduktHinten[index] = new Product();
		  			GUI.doneVerschrotten(false);
			  	  }
	    	  }else {
	    		  System.out.println("Verschrotten Klick!");
	    	  }
	    	  
  	  }catch (Exception e) {
			System.out.println(e);
  	  }
	}
	
	
	
	private void funcAuslagerung(int index, boolean [] ph, Product [] product, JButton [] btnRegal) {
		String iconPath = "";
		if(ph[index] == true && auftragSelected[auftragIndex] && auftrag[auftragIndex].getAuftragArt().equals("Auslagerung")){
			if(auftrag[auftragIndex].getProdukt().equals(auftrag[auftragIndex].getProdukt()) && auftrag[auftragIndex].getAttribut_1().equals(auftrag[auftragIndex].getAttribut_1()) && auftrag[auftragIndex].getAttribut_2().equals(auftrag[auftragIndex].getAttribut_2())) {
				
				if (btnRegal[index].getIcon().toString().contains(auftrag[auftragIndex].getAttribut_1() + "_" + auftrag[auftragIndex].getAttribut_2()) && !(auftrag[auftragIndex].getAttribut_2().equals("Balken"))) {
					//TODO Auslagern bei vorne frei
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
				}else if(btnRegal[index].getIcon().toString().contains("Wei%c3%9f_" + auftrag[auftragIndex].getAttribut_2()) && !(auftrag[auftragIndex].getAttribut_2().equals("Balken"))) {
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
				}else if(!(btnRegal[index].getIcon().toString().contains(auftrag[auftragIndex].getAttribut_1() + "_" + auftrag[auftragIndex].getAttribut_2()))){
					System.out.println("Auslagern:  " + btnRegal[index].getIcon().toString());
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame ,
				    "Falscher Produkt zum auslagern!",
				    "Fehler",
				    JOptionPane.ERROR_MESSAGE);
				}
				
				if (auftrag[auftragIndex].getAttribut_2().equals("Balken") && RegalHinten[index].getIcon().toString().contains("Balken") == true) {
					RegalHinten[index].setIcon(icnPlaceHolder);
					regalHintenPH[index] = false;
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
				}
				if(auftrag[auftragIndex].getAttribut_2().equals("Balken") && RegalVorne[index].getIcon().toString().contains("Balken") == true) {
					
					RegalVorne[index].setIcon(icnPlaceHolder);
					regalVornePH[index] = false;
					ph[index] = false;
					btnRegal[index].setIcon(icnPlaceHolder);
					product[index] = new Product();
					iconPath = btnRegal[index].getIcon().toString();
  	  				if (iconPath.contains("placeholder.png")) {
  	  					auftrag[auftragIndex].setAuftragDone(true);
  					}else {
  						auftrag[auftragIndex].setAuftragDone(false);
  					}
					
				}
				
			}
		}
	}
	
	
	public static JButton [] getRegalVorne() {
		return RegalVorne;
	}
	
	public static JButton [] getRegalHinten() {
		return RegalHinten;
	}
	
	public static void setRegalVorne(JButton []  vorne) {
		RegalVorne = vorne;
	}
	
	public static void setRegalHinten(JButton []  hinten) {
		RegalHinten = hinten;
	}
	

	public void funcMoveVorne(int index) {
		if(Controls.getMove()) {
			if(index == 0 && RegalVorne[index].getIcon().toString().contains("placeholder.png") == false) {
				if(RegalVorne[index].isSelected()) {
					RegalVorne[index].setSelected(false);
					RegalVorne[index].setBackground(Color.WHITE);
				}else {
					RegalVorne[index].setSelected(true);
					RegalVorne[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index+1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index+1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index+1].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalHinten[index].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Vorne[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					Regal2Vorne[index].setBackground(Color.YELLOW);
				}else {
					Regal2Vorne[index].setBackground(Color.WHITE);
				}
				
				
			}
			if(index == 1 && RegalVorne[index].getIcon().toString().contains("placeholder.png") == false) {
				if(RegalVorne[index].isSelected()) {
					RegalVorne[index].setSelected(false);
					RegalVorne[index].setBackground(Color.WHITE);
				}else {
					RegalVorne[index].setSelected(true);
					RegalVorne[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index-1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index-1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index-1].setBackground(Color.WHITE);
				}
				
				
				if(RegalVorne[index+1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index+1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index+1].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalHinten[index].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Vorne[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					Regal2Vorne[index].setBackground(Color.YELLOW);
				}else {
					Regal2Vorne[index].setBackground(Color.WHITE);
				}
				
				
			}
			if(index == 2 && RegalVorne[index].getIcon().toString().contains("placeholder.png") == false) {
				if(RegalVorne[index].isSelected()) {
					RegalVorne[index].setSelected(false);
					RegalVorne[index].setBackground(Color.WHITE);
				}else {
					RegalVorne[index].setSelected(true);
					RegalVorne[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index-1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index-1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index-1].setBackground(Color.WHITE);
				}
				
				if(RegalVorne[index+1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index+1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index+1].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalHinten[index].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Vorne[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					Regal2Vorne[index].setBackground(Color.YELLOW);
				}else {
					Regal2Vorne[index].setBackground(Color.WHITE);
				}
			}
			if(index == 3 && RegalVorne[index].getIcon().toString().contains("placeholder.png") == false) {
				if(RegalVorne[index].isSelected()) {
					RegalVorne[index].setSelected(false);
					RegalVorne[index].setBackground(Color.WHITE);
				}else {
					RegalVorne[index].setSelected(true);
					RegalVorne[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index-1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index-1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index-1].setBackground(Color.WHITE);
				}
				
				
				if(RegalVorne[index+1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index+1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index+1].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalHinten[index].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Vorne[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					Regal2Vorne[index].setBackground(Color.YELLOW);
				}else {
					Regal2Vorne[index].setBackground(Color.WHITE);
				}
			}
			if(index == 4 && RegalVorne[index].getIcon().toString().contains("placeholder.png") == false) {
				if(RegalVorne[index].isSelected()) {
					RegalVorne[index].setSelected(false);
					RegalVorne[index].setBackground(Color.WHITE);
				}else {
					RegalVorne[index].setSelected(true);
					RegalVorne[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index-1].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalVorne[index-1].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index-1].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					RegalHinten[index].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Vorne[index].getIcon().toString().contains("placeholder.png") && RegalVorne[index].isSelected() == true) {
					Regal2Vorne[index].setBackground(Color.YELLOW);
				}else {
					Regal2Vorne[index].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	public void funcMoveHinten(int index) {
		if(Controls.getMove() == true) {
			if(index == 0) {
				if(RegalHinten[index].isSelected()) {
					RegalHinten[index].setSelected(false);
					RegalHinten[index].setBackground(Color.WHITE);
				}else {
					RegalHinten[index].setSelected(true);
					RegalHinten[index].setBackground(Color.GREEN);
				}
				
				if(RegalHinten[index+1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index+1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index+1].setBackground(Color.WHITE);
				}
				
				if(RegalVorne[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalVorne[index].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Hinten[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					Regal2Hinten[index].setBackground(Color.YELLOW);
				}else {
					Regal2Hinten[index].setBackground(Color.WHITE);
				}
				
				
			}
			if(index == 1) {
				if(RegalHinten[index].isSelected()) {
					RegalHinten[index].setSelected(false);
					RegalHinten[index].setBackground(Color.WHITE);
				}else {
					RegalHinten[index].setSelected(true);
					RegalHinten[index].setBackground(Color.GREEN);
				}
				
				if(RegalHinten[index+1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index+1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index+1].setBackground(Color.WHITE);
				}
				if(RegalHinten[index-1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index-1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index-1].setBackground(Color.WHITE);
				}
				
				if(RegalVorne[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalVorne[index].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Hinten[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					Regal2Hinten[index].setBackground(Color.YELLOW);
				}else {
					Regal2Hinten[index].setBackground(Color.WHITE);
				}
			}
			if(index == 2) {
				if(RegalHinten[index].isSelected()) {
					RegalHinten[index].setSelected(false);
					RegalHinten[index].setBackground(Color.WHITE);
				}else {
					RegalHinten[index].setSelected(true);
					RegalHinten[index].setBackground(Color.GREEN);
				}
				
				if(RegalHinten[index+1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index+1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index+1].setBackground(Color.WHITE);
				}
				if(RegalHinten[index-1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index-1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index-1].setBackground(Color.WHITE);
				}
				
				if(RegalVorne[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalVorne[index].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Hinten[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					Regal2Hinten[index].setBackground(Color.YELLOW);
				}else {
					Regal2Hinten[index].setBackground(Color.WHITE);
				}
				
				
			}
			if(index == 3) {
				if(RegalHinten[index].isSelected()) {
					RegalHinten[index].setSelected(false);
					RegalHinten[index].setBackground(Color.WHITE);
				}else {
					RegalHinten[index].setSelected(true);
					RegalHinten[index].setBackground(Color.GREEN);
				}
				
				if(RegalHinten[index+1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index+1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index+1].setBackground(Color.WHITE);
				}
				if(RegalHinten[index-1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index-1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index-1].setBackground(Color.WHITE);
				}
				
				if(RegalVorne[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalVorne[index].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Hinten[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					Regal2Hinten[index].setBackground(Color.YELLOW);
				}else {
					Regal2Hinten[index].setBackground(Color.WHITE);
				}
				
			}
			if(index == 4) {
				if(RegalHinten[index].isSelected()) {
					RegalHinten[index].setSelected(false);
					RegalHinten[index].setBackground(Color.WHITE);
				}else {
					RegalHinten[index].setSelected(true);
					RegalHinten[index].setBackground(Color.GREEN);
				}
				
				if(RegalVorne[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalVorne[index].setBackground(Color.YELLOW);
				}else {
					RegalVorne[index].setBackground(Color.WHITE);
				}
				
				if(Regal2Hinten[index].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					Regal2Hinten[index].setBackground(Color.YELLOW);
				}else {
					Regal2Hinten[index].setBackground(Color.WHITE);
				}
				
				if(RegalHinten[index-1].getIcon().toString().contains("placeholder.png") && RegalHinten[index].isSelected() == true) {
					RegalHinten[index-1].setBackground(Color.YELLOW);
				}else {
					RegalHinten[index-1].setBackground(Color.WHITE);
				}
			}
		}
	}
	
	public void allWhite() {
		for(int i = 0; i < 5; i++) {
			RegalVorne[i].setBackground(Color.WHITE);
			RegalHinten[i].setBackground(Color.WHITE);
			Regal2Vorne[i].setBackground(Color.WHITE);
			Regal2Hinten[i].setBackground(Color.WHITE);
			
			if(RegalHinten[i].getIcon().toString().contains("placeholder.png")) {
				regalHintenPH[i] = false;
				RegalHinten[i].setSelected(false);
				
			}
			
			if(RegalVorne[i].getIcon().toString().contains("placeholder.png")) {
				regalVornePH[i] = false;
				RegalVorne[i].setSelected(false);
			}
			
			if(Regal2Hinten[i].getIcon().toString().contains("placeholder.png")) {
				Regal2HintenPH[i] = false;
				Regal2Hinten[i].setSelected(false);
			}
			
			if(Regal2Vorne[i].getIcon().toString().contains("placeholder.png")) {
				Regal2VornePH[i] = false;
				Regal2Vorne[i].setSelected(false);
			}
			
		}
	}
	
	public JPanel getJPanel() {
		Components();
		return regal1Panel;
	}
	
	public static boolean[] getRegalVornePH() {
		return regalVornePH;
	}

	public static boolean[] getRegalHintenPH() {
		return regalHintenPH;
	}
}
