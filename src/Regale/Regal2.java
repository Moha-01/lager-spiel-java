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

import GUI.GUI;

public class Regal2 {
	
	private JPanel regal2Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
	
	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 2
	private JButton [] RegalVorne = new JButton[5];
	private JButton [] RegalHinten = new JButton[5];
	
	private JLabel Label2Regal = new JLabel();
	private JLabel Label2Vorne = new JLabel();
	private JLabel Label2Hinten = new JLabel();
	
	
	private void Components() {
		regal2Panel.setBounds(450 , 30, 370, 465);
		regal2Panel.setLayout(null);
		
		
		//Regal 2 Vorne
		int abstandy = 24;
		
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
		
		
		RegalVorne[0].setBounds(0, abstandy, 180, 80);
		RegalVorne[0].addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
		        System.out.println("Klick");
		  }
	    });

  	  	abstandy=(abstandy + 82);
  	  	RegalVorne[1].setBounds(0, abstandy, 180, 80);
  	  	RegalVorne[1].addActionListener(new ActionListener() {
	  	  public void actionPerformed(ActionEvent evt) {
	  	      System.out.println("Klick");
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

  	    // Regal 2 Hinten
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
	    
	    Label2Regal.setBounds(1, 0, 363, 20);
	    Label2Regal.setText("2. Regal");
	    Label2Regal.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Regal.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Regal.setBackground(Color.BLACK);
	    Label2Regal.setForeground(Color.WHITE);
	    Label2Regal.setOpaque(true);
	    
	    Label2Vorne.setBounds(1, 435, 177, 20);
	    Label2Vorne.setText("Vorne");
	    Label2Vorne.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Vorne.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Vorne.setBackground(Color.GREEN);
	    Label2Vorne.setOpaque(true);

	    Label2Hinten.setBounds(187, 435, 177, 20);
	    Label2Hinten.setText("Hinten");
	    Label2Hinten.setHorizontalAlignment(SwingConstants.CENTER);
	    Label2Hinten.setHorizontalTextPosition(SwingConstants.CENTER);
	    Label2Hinten.setBackground(Color.YELLOW);
	    Label2Hinten.setOpaque(true);
		
		
	    //Regal 2 Vorne
		regal2Panel.add(RegalVorne[0]);
		regal2Panel.add(RegalVorne[1]);
		regal2Panel.add(RegalVorne[2]);
		regal2Panel.add(RegalVorne[3]);
		regal2Panel.add(RegalVorne[4]);
	
		//Regal 2 Hinten
		regal2Panel.add(RegalHinten[0]);
		regal2Panel.add(RegalHinten[1]);
		regal2Panel.add(RegalHinten[2]);
		regal2Panel.add(RegalHinten[3]);
		regal2Panel.add(RegalHinten[4]);
		
		regal2Panel.add(Label2Regal);
		regal2Panel.add(Label2Vorne);
		regal2Panel.add(Label2Hinten);
		
		
		regal2Panel.setBackground(Color.GRAY);
		regal2Panel.setVisible(true);
	}
	
	public JPanel getJPanel() {
		Components();
		return regal2Panel;
	}
	
	
}
