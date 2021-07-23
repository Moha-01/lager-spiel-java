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
import Product.*;

public class Regal1 {
	
	private JPanel regal1Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 1

	public JButton [] RegalVorne = new JButton[5];
	public JButton [] RegalHinten = new JButton[5];
	
	private JLabel Label1Regal = new JLabel();
	private JLabel Label1Vorne = new JLabel();
	private JLabel Label1Hinten = new JLabel();
	private Auftrag auftrag[] = new Auftrag[4];
	private int auftragIndex;
	private boolean auftragSelected[] = new boolean[4];

	
	//Platzhalter
	private boolean [] regalVornePH = new boolean[5];
	private boolean [] regalHintenPH = new boolean[5];

	private Product [] ProduktVorne = new Product[5];
	private Product [] ProduktHinten = new Product[5];
	
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
			
			
			regalVornePH[i] = false;
			regalHintenPH[i] = false;
			
			ProduktVorne[i] = new Product();
			ProduktHinten[i] = new Product();
		}
		
		int abstandy = 24;
		RegalVorne[0].setBounds(0, abstandy, 180, 80);
		RegalVorne[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	 
	    	  getIconInfo(0, regalVornePH, ProduktVorne, RegalVorne);
	    	  
	    	  
	      }
	    });

	    abstandy=(abstandy + 82);
	    
	    RegalVorne[1].setBounds(0, abstandy, 180, 80);
	    RegalVorne[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(1, regalVornePH, ProduktVorne, RegalVorne);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[2].setBounds(0, abstandy, 180, 80);
	    RegalVorne[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(2, regalVornePH, ProduktVorne, RegalVorne);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[3].setBounds(0, abstandy, 180, 80);
	    RegalVorne[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(3, regalVornePH, ProduktVorne, RegalVorne);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalVorne[4].setBounds(0, abstandy, 180, 80);
	    RegalVorne[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(4, regalVornePH, ProduktVorne, RegalVorne);
	      }
	    });

	    // Regal 1 Hinten
	    abstandy = 24;
	    RegalHinten[0].setBounds(185, abstandy, 180, 80);
	    RegalHinten[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(0, regalHintenPH, ProduktHinten, RegalHinten);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[1].setBounds(185, abstandy, 180, 80);
	    RegalHinten[1].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(1, regalHintenPH, ProduktHinten, RegalHinten);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[2].setBounds(185, abstandy, 180, 80);
	    RegalHinten[2].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(2, regalHintenPH, ProduktHinten, RegalHinten);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[3].setBounds(185, abstandy, 180, 80);
	    RegalHinten[3].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(3, regalHintenPH, ProduktHinten, RegalHinten);
	      }
	    });

	    abstandy=(abstandy + 82);
	    RegalHinten[4].setBounds(185, abstandy, 180, 80);
	    RegalHinten[4].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  getIconInfo(4, regalHintenPH, ProduktHinten, RegalHinten);
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
	
	private void getIconInfo(int index, boolean [] ph, Product [] product, JButton [] btnRegal) {
		auftrag = GUI.getAuftragDaten();
	  	auftragSelected = GUI.getAuftragSelected();
	  	
	  	for(int i = 0; i < 4; i++) {
	  		if(auftragSelected[i] == true) {
					auftragIndex = i;
			}
		}
	  	try {
	  		product[index].setProductType(auftrag[auftragIndex].getProdukt());
	  	}catch (Exception e) {
	  		  System.out.println(e);
	  	}
		if(ph[index] == false && auftragSelected[auftragIndex]) {
			ph[index] = true;
  			if(product[index].getProduktType().equals("Papier")) {
  				product[index] = new Papier();
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
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Mittel")) {
  					((Stein) product[index]).setGewicht("Mittel");
  				}
  				if(auftrag[auftragIndex].getAttribut_2().equals("Schwer")) {
  					((Stein) product[index]).setGewicht("Schwer");
  				}
  				
  				btnRegal[index].setIcon(((Stein) product[index]).getIcon());
  			}
  			
  		 }else {
  			ph[index] = false;
  		 }
		
	}
	
	public JPanel getJPanel() {
		Components();
		return regal1Panel;
	}
}
