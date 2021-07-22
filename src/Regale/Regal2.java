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
	private JButton r2v1 = new JButton();
	private JButton r2v2 = new JButton();
	private JButton r2v3 = new JButton();
	private JButton r2v4 = new JButton();
	private JButton r2v5 = new JButton();
	private JButton r2h1 = new JButton();
	private JButton r2h2 = new JButton();
	private JButton r2h3 = new JButton();
	private JButton r2h4 = new JButton();
	private JButton r2h5 = new JButton();
	
	private JLabel Label2Regal = new JLabel();
	private JLabel Label2Vorne = new JLabel();
	private JLabel Label2Hinten = new JLabel();
	
	
	private void Components() {
		regal2Panel.setBounds(450 , 30, 370, 465);
		regal2Panel.setLayout(null);
		
		
		//Regal 2 Vorne
		int abstandy = 24;
		
    	r2v1.setIcon(icnPlaceHolder);
    	r2v1.setBorder(new LineBorder(Color.BLACK));
    	r2v1.setBounds(0, abstandy, 180, 80);
	    r2v1.setBackground(Color.WHITE);
	    r2v1.setForeground(Color.BLACK);
	    r2v1.setFocusPainted(false);
  	  	r2v1.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v1.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent evt) {
		        System.out.println("Klick");
		  }
	    });

  	  	abstandy=(abstandy + 82);
    	r2v2.setIcon(icnPlaceHolder);
    	r2v2.setBorder(new LineBorder(Color.BLACK));
    	r2v2.setBounds(0, abstandy, 180, 80);
	    r2v2.setBackground(Color.WHITE);
	    r2v2.setForeground(Color.BLACK);
	    r2v2.setFocusPainted(false);
  	  	r2v2.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v2.addActionListener(new ActionListener() {
	  	  public void actionPerformed(ActionEvent evt) {
	  	      System.out.println("Klick");
	  	    }
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	r2v3.setIcon(icnPlaceHolder);
  	  	r2v3.setBorder(new LineBorder(Color.BLACK));
  	  	r2v3.setBounds(0, abstandy, 180, 80);
	    r2v3.setBackground(Color.WHITE);
	    r2v3.setForeground(Color.BLACK);
	    r2v3.setFocusPainted(false);
  	  	r2v3.setMargin(new Insets(2, 2, 2, 2));
  	  	r2v3.addActionListener(new ActionListener() {
  	  		public void actionPerformed(ActionEvent evt) {
  	  			System.out.println("Klick");
  	  		}
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	r2v4.setIcon(icnPlaceHolder);
  	  	r2v4.setBorder(new LineBorder(Color.BLACK));
  	  	r2v4.setBounds(0, abstandy, 180, 80);
	    r2v4.setBackground(Color.WHITE);
	    r2v4.setForeground(Color.BLACK);
	    r2v4.setFocusPainted(false);
	    r2v4.setMargin(new Insets(2, 2, 2, 2));
	    r2v4.addActionListener(new ActionListener() {
	  	    public void actionPerformed(ActionEvent evt) {
	  	      System.out.println("Klick");
	  	    }
	    });

	    abstandy=(abstandy + 82);  	  
  	  	r2v5.setIcon(icnPlaceHolder);
  	  	r2v5.setBorder(new LineBorder(Color.BLACK));
  	  	r2v5.setBounds(0, abstandy, 180, 80);
	    r2v5.setBackground(Color.WHITE);
	    r2v5.setForeground(Color.BLACK);
	    r2v5.setFocusPainted(false);
	    r2v5.setMargin(new Insets(2, 2, 2, 2));
	    r2v5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		System.out.println("Klick");
	    	}
	    });

  	    // Regal 2 Hinten
	    abstandy = 24;
	    r2h1.setIcon(icnPlaceHolder);
	    r2h1.setBorder(new LineBorder(Color.BLACK));
	    r2h1.setBounds(185, abstandy, 180, 80);
	    r2h1.setBackground(Color.WHITE);
	    r2h1.setForeground(Color.BLACK);
	    r2h1.setFocusPainted(false);
	    r2h1.setMargin(new Insets(2, 2, 2, 2));
	    r2h1.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandy=(abstandy + 82);
	    r2h2.setIcon(icnPlaceHolder);
	    r2h2.setBorder(new LineBorder(Color.BLACK));
	    r2h2.setBounds(185, abstandy, 180, 80);
  	    r2h2.setBackground(Color.WHITE);
	    r2h2.setForeground(Color.BLACK);
	    r2h2.setFocusPainted(false);
	    r2h2.setMargin(new Insets(2, 2, 2, 2));
  	  	r2h2.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
  	  	});

  	  	abstandy=(abstandy + 82);
  	  	r2h3.setIcon(icnPlaceHolder);
  	  	r2h3.setBorder(new LineBorder(Color.BLACK));
  	  	r2h3.setBounds(185, abstandy, 180, 80);  
	    r2h3.setBackground(Color.WHITE);
	    r2h3.setForeground(Color.BLACK);
	    r2h3.setFocusPainted(false);
	    r2h3.setMargin(new Insets(2, 2, 2, 2));
	    r2h3.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandy=(abstandy + 82);
	    r2h4.setIcon(icnPlaceHolder);
	    r2h4.setBorder(new LineBorder(Color.BLACK));
	    r2h4.setBounds(185, abstandy, 180, 80);
	    r2h4.setBackground(Color.WHITE);
	    r2h4.setForeground(Color.BLACK);
	    r2h4.setFocusPainted(false);
	    r2h4.setMargin(new Insets(2, 2, 2, 2));
	    r2h4.addActionListener(new ActionListener() {
  	      public void actionPerformed(ActionEvent evt) {
  	    	  System.out.println("Klick");
  	      }
	    });

	    abstandy=(abstandy + 82);
	    r2h5.setIcon(icnPlaceHolder);
	    r2h5.setBorder(new LineBorder(Color.BLACK));
	    r2h5.setBounds(185, abstandy, 180, 80);
	    r2h5.setBackground(Color.WHITE);
	    r2h5.setForeground(Color.BLACK);
	    r2h5.setFocusPainted(false);
	    r2h5.setMargin(new Insets(2, 2, 2, 2));
	    r2h5.addActionListener(new ActionListener() {
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
		regal2Panel.add(r2v1);
		regal2Panel.add(r2v2);
		regal2Panel.add(r2v3);
		regal2Panel.add(r2v4);
		regal2Panel.add(r2v5);

		//Regal 2 Hinten
		regal2Panel.add(r2h1);
		regal2Panel.add(r2h2);
		regal2Panel.add(r2h3);
		regal2Panel.add(r2h4);
		regal2Panel.add(r2h5);
		
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
