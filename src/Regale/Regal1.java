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

public class Regal1 {
	
	private JPanel regal1Panel = new JPanel();
	private Icon icnPlaceHolder = new ImageIcon(GUI.class.getResource("placeholder.png"));
	
	// r1v1 = Regal 1 Vorne 1 | r2h2 = regal 2 hinten 2
	//Regal 1
	private JButton r1v1 = new JButton();
	private JButton r1v2 = new JButton();
	private JButton r1v3 = new JButton();
	private JButton r1v4 = new JButton();
	private JButton r1v5 = new JButton();
	private JButton r1h1 = new JButton();
	private JButton r1h2 = new JButton();
	private JButton r1h3 = new JButton();
	private JButton r1h4 = new JButton();
	private JButton r1h5 = new JButton();
	
	private JLabel Label1Regal = new JLabel();
	private JLabel Label1Vorne = new JLabel();
	private JLabel Label1Hinten = new JLabel();
	
	private void Components() {
		
		regal1Panel.setBounds(50 , 30, 370, 465);
		regal1Panel.setLayout(null);
		
		
		//Regal 1 Vorne
		int abstandy = 24;
		
		r1v1.setIcon(icnPlaceHolder);
		r1v1.setBorder(new LineBorder(Color.BLACK));
		r1v1.setBounds(0, abstandy, 180, 80);
	    r1v1.setBackground(Color.WHITE);
	    r1v1.setForeground(Color.BLACK);
	    r1v1.setFocusPainted(false);
	    r1v1.setMargin(new Insets(2, 2, 2, 2));
	    r1v1.addActionListener(new ActionListener() {
	      int klick = 0;
	      public void actionPerformed(ActionEvent evt) {
	    	  if(klick == 0) {
	    		  klick = 1;
	    		  r1v1.setBackground(Color.red);
	    	  } else if(klick == 1) {
	    		  klick = 0;
	    		  r1v1.setBackground(Color.white);
	    	  }
	      }
	    });

	    abstandy=(abstandy + 82);
	    
	    r1v2.setIcon(icnPlaceHolder);
		r1v2.setBorder(new LineBorder(Color.BLACK));
	    r1v2.setBounds(0, abstandy, 180, 80);
	    r1v2.setBackground(Color.WHITE);
	    r1v2.setForeground(Color.BLACK);
	    r1v2.setFocusPainted(false);
	    r1v2.setMargin(new Insets(2, 2, 2, 2));
	    r1v2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1v3.setIcon(icnPlaceHolder);
		r1v3.setBorder(new LineBorder(Color.BLACK));
	    r1v3.setBounds(0, abstandy, 180, 80);
	    r1v3.setBackground(Color.WHITE);
	    r1v3.setForeground(Color.BLACK);
	    r1v3.setFocusPainted(false);
	    r1v3.setMargin(new Insets(2, 2, 2, 2));
	    r1v3.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1v4.setIcon(icnPlaceHolder);
		r1v4.setBorder(new LineBorder(Color.BLACK));
	    r1v4.setBounds(0, abstandy, 180, 80);
	    r1v4.setBackground(Color.WHITE);
	    r1v4.setForeground(Color.BLACK);
	    r1v4.setFocusPainted(false);
	    r1v4.setMargin(new Insets(2, 2, 2, 2));
	    r1v4.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1v5.setIcon(icnPlaceHolder);
	    r1v5.setBorder(new LineBorder(Color.BLACK));
	    r1v5.setBounds(0, abstandy, 180, 80);
	    r1v5.setBackground(Color.WHITE);
	    r1v5.setForeground(Color.BLACK);
	    r1v5.setFocusPainted(false);
	    r1v5.setMargin(new Insets(2, 2, 2, 2));
	    r1v5.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	        System.out.println("Klick");
	      }
	    });

	    // Regal 1 Hinten
	    abstandy = 24;
	    r1h1.setIcon(icnPlaceHolder);
	    r1h1.setBorder(new LineBorder(Color.BLACK));
	    r1h1.setBounds(185, abstandy, 180, 80);
	    r1h1.setBackground(Color.WHITE);
	    r1h1.setForeground(Color.BLACK);
	    r1h1.setFocusPainted(false);
	    r1h1.setMargin(new Insets(2, 2, 2, 2));
	    r1h1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1h2.setIcon(icnPlaceHolder);
	    r1h2.setBorder(new LineBorder(Color.BLACK));
	    r1h2.setBounds(185, abstandy, 180, 80);
	    r1h2.setBackground(Color.WHITE);
	    r1h2.setForeground(Color.BLACK);
	    r1h2.setFocusPainted(false);
	    r1h2.setMargin(new Insets(2, 2, 2, 2));
	    r1h2.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1h3.setIcon(icnPlaceHolder);
		r1v1.setBorder(new LineBorder(Color.BLACK));
	    r1h3.setBounds(185, abstandy, 180, 80);
	    r1h3.setBackground(Color.WHITE);
	    r1h3.setForeground(Color.BLACK);
	    r1h3.setFocusPainted(false);
	    r1h3.setMargin(new Insets(2, 2, 2, 2));
	    r1h3.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1h4.setIcon(icnPlaceHolder);
	    r1h4.setBorder(new LineBorder(Color.BLACK));
	    r1h4.setBounds(185, abstandy, 180, 80);
	    r1h4.setBackground(Color.WHITE);
	    r1h4.setForeground(Color.BLACK);
	    r1h4.setFocusPainted(false);
	    r1h4.setMargin(new Insets(2, 2, 2, 2));
	    r1h4.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
	    	  System.out.println("Klick");
	      }
	    });

	    abstandy=(abstandy + 82);
	    r1h5.setIcon(icnPlaceHolder);
	    r1h5.setBorder(new LineBorder(Color.BLACK));
	    r1h5.setBounds(185, abstandy, 180, 80);
	    r1h5.setBackground(Color.WHITE);
	    r1h5.setForeground(Color.BLACK);
	    r1h5.setFocusPainted(false);
	    r1h5.setMargin(new Insets(2, 2, 2, 2));
	    r1h5.addActionListener(new ActionListener() {
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
		regal1Panel.add(r1v1);
		regal1Panel.add(r1v2);
		regal1Panel.add(r1v3);
		regal1Panel.add(r1v4);
		regal1Panel.add(r1v5);

		//Regal 1 Hinten
		regal1Panel.add(r1h1);
		regal1Panel.add(r1h2);
		regal1Panel.add(r1h3);
		regal1Panel.add(r1h4);
		regal1Panel.add(r1h5);
		
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
