package Controls;

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

public class Controls {
	
	//Panel 
	private JPanel controlPanel = new JPanel();
	
	//Buttons
	private JButton outControl = new JButton();
	private JButton moveControl = new JButton();
	private JButton destroyControl = new JButton();
	
	//Labels
	private JLabel controlsLabel = new JLabel();
	private JLabel colLeft = new JLabel();
	private JLabel colRight = new JLabel();
	private JLabel colBottom = new JLabel();
	private JLabel LabelAuslagern = new JLabel();
	private JLabel LabelMove = new JLabel();
	private JLabel LabelDestroy = new JLabel();
	
	//Icons
	private Icon icnDestroy = new ImageIcon(GUI.class.getResource("destroy.png"));
	private Icon icnMove = new ImageIcon(GUI.class.getResource("move.png"));
	private Icon icnOut = new ImageIcon(GUI.class.getResource("auslagern.png"));
	
	private void Components() {
		
		controlPanel.setBounds(50 , 519, 770, 220);
		controlPanel.setLayout(null);
		
		controlsLabel.setBounds(0, 0, 768, 34);
	    controlsLabel.setText("Controls");
	    controlsLabel.setHorizontalTextPosition(SwingConstants.CENTER);
	    controlsLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    controlsLabel.setBackground(Color.BLACK);
	    controlsLabel.setOpaque(true);
	    controlsLabel.setForeground(Color.WHITE);
	      
	    colLeft.setBounds(0, 34, 14, 153);
	    colLeft.setText("");
	    colLeft.setBackground(Color.BLACK);
	    colLeft.setOpaque(true);
	      
	    colRight.setBounds(754, 34, 14, 153);
	    colRight.setBackground(Color.BLACK);
	    colRight.setText("");
	    colRight.setOpaque(true);
	      
	    colBottom.setBounds(0, 170, 768, 17);
	    colBottom.setBackground(Color.BLACK);
	    colBottom.setText("");
	    colBottom.setOpaque(true);
	      
	    outControl.setBounds(55, 50, 180, 80);
	    outControl.setIcon(icnOut);
	    outControl.setMargin(new Insets(2, 2, 2, 2));
	    outControl.setBackground(Color.WHITE);
	    outControl.setFocusPainted(false);
	    outControl.setBorder(new LineBorder(Color.BLACK));
	    outControl.addActionListener(new ActionListener() { 
	      public void actionPerformed(ActionEvent evt) { 
	    	  System.out.println("Klick");
	        }
	    });
	      
	    LabelAuslagern.setBounds(56, 136, 179, 20);
	    LabelAuslagern.setText("Auslagern");
	    LabelAuslagern.setHorizontalTextPosition(SwingConstants.CENTER);
	    LabelAuslagern.setHorizontalAlignment(SwingConstants.CENTER);
	    LabelAuslagern.setBackground(new Color(0xFFC800));
	    LabelAuslagern.setOpaque(true);
	      
	    moveControl.setBounds(294, 50, 180, 80);
	    moveControl.setIcon(icnMove);
	    moveControl.setMargin(new Insets(2, 2, 2, 2));
	    moveControl.setBackground(Color.WHITE);
	    moveControl.setFocusPainted(false);
	    moveControl.setBorder(new LineBorder(Color.BLACK));
	    moveControl.addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent evt) { 
	        	System.out.println("Klick");
	        }
	    });
	      
	    LabelMove.setBounds(295, 136, 179, 20);
	    LabelMove.setText("Move");
	    LabelMove.setHorizontalTextPosition(SwingConstants.CENTER);
	    LabelMove.setHorizontalAlignment(SwingConstants.CENTER);
	    LabelMove.setBackground(Color.YELLOW);
	    LabelMove.setOpaque(true);
	      
	    destroyControl.setBounds(530, 50, 180, 80);
	    destroyControl.setIcon(icnDestroy);
	    destroyControl.setMargin(new Insets(2, 2, 2, 2));
	    destroyControl.setBackground(Color.WHITE);
	    destroyControl.setFocusPainted(false);
	    destroyControl.setBorder(new LineBorder(Color.BLACK));
	    destroyControl.addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent evt) { 
	        	System.out.println("Klick");
	        }
	    });
	      
	    LabelDestroy.setBounds(531, 136, 179, 20);
	    LabelDestroy.setText("Verschrotten");
	    LabelDestroy.setHorizontalTextPosition(SwingConstants.CENTER);
	    LabelDestroy.setHorizontalAlignment(SwingConstants.CENTER);
	    LabelDestroy.setBackground(Color.RED);
	    LabelDestroy.setOpaque(true);
	      
		
		controlPanel.add(outControl);
		controlPanel.add(moveControl);
		controlPanel.add(destroyControl);
		controlPanel.add(controlsLabel);
		controlPanel.add(colLeft);
		controlPanel.add(colRight);
		controlPanel.add(colBottom);
		controlPanel.add(LabelAuslagern);
		controlPanel.add(LabelMove);
		controlPanel.add(LabelDestroy);
		
		controlPanel.setBackground(Color.GRAY);
		controlPanel.setVisible(true);
	}
	
	public JPanel getJPanel() {
		Components();
		return controlPanel;
	}
	
}
