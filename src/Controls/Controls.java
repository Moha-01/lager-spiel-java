package Controls;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import GUI.GUI;

public class Controls {
	
	//Panel 
	private JPanel controlPanel = new JPanel();
	
	//Buttons
	private JButton infoButton = new JButton();
	private JButton moveControl = new JButton();
	private JButton destroyControl = new JButton();
	
	//Labels
	private JLabel controlsLabel = new JLabel();
	private JLabel colLeft = new JLabel();
	private JLabel colRight = new JLabel();
	private JLabel colBottom = new JLabel();
	private JLabel LabelInfo = new JLabel();
	private JLabel LabelMove = new JLabel();
	private JLabel LabelDestroy = new JLabel();
	
	//Icons
	private Icon icnDestroy = new ImageIcon(GUI.class.getResource("destroy.png"));
	private Icon icnMove = new ImageIcon(GUI.class.getResource("move.png"));
	private Icon icnOut = new ImageIcon(GUI.class.getResource("info.png"));
	private ImageIcon img = new ImageIcon(GUI.class.getResource("gaming.png"));
	
	
	
	//INFO PNG
	 ImageIcon B3 = new ImageIcon(GUI.class.getResource("Blau_A3.png"));
	 ImageIcon B4 = new ImageIcon(GUI.class.getResource("Blau_A4.png"));
	 ImageIcon B5 = new ImageIcon(GUI.class.getResource("Blau_A5.png"));
	 ImageIcon G3 = new ImageIcon(GUI.class.getResource("Grün_A3.png"));
	 ImageIcon G4 = new ImageIcon(GUI.class.getResource("Grün_A4.png"));
	 ImageIcon G5 = new ImageIcon(GUI.class.getResource("Grün_A5.png"));
	 ImageIcon W3 = new ImageIcon(GUI.class.getResource("Weiß_A3.png"));
	 ImageIcon W4 = new ImageIcon(GUI.class.getResource("Weiß_A3.png"));
	 ImageIcon W5 = new ImageIcon(GUI.class.getResource("Weiß_A3.png"));
	 
	 ImageIcon EBA = new ImageIcon(GUI.class.getResource("Eiche_Balken.png"));
	 ImageIcon EBR = new ImageIcon(GUI.class.getResource("Eiche_Bretter.png"));
	 ImageIcon ESC = new ImageIcon(GUI.class.getResource("Eiche_Scheit.png"));
	 ImageIcon BBA = new ImageIcon(GUI.class.getResource("Buche_Balken.png"));
	 ImageIcon BBR = new ImageIcon(GUI.class.getResource("Buche_Bretter.png"));
	 ImageIcon BSC = new ImageIcon(GUI.class.getResource("Buche_Scheit.png"));
	 ImageIcon KBA = new ImageIcon(GUI.class.getResource("Kiefer_Balken.png"));
	 ImageIcon KBR = new ImageIcon(GUI.class.getResource("Kiefer_Bretter.png"));
	 ImageIcon KSC = new ImageIcon(GUI.class.getResource("Kiefer_Scheit.png"));
	 
	 ImageIcon GL = new ImageIcon(GUI.class.getResource("Granit_Leicht.png"));
	 ImageIcon GM = new ImageIcon(GUI.class.getResource("Granit_Mittel.png"));
	 ImageIcon GS = new ImageIcon(GUI.class.getResource("Granit_Schwer.png"));
	 ImageIcon ML = new ImageIcon(GUI.class.getResource("Marmor_Leicht.png"));
	 ImageIcon MM = new ImageIcon(GUI.class.getResource("Marmor_Mittel.png"));
	 ImageIcon MS = new ImageIcon(GUI.class.getResource("Marmor_Schwer.png"));
	 ImageIcon SL = new ImageIcon(GUI.class.getResource("Sandstein_Leicht.png"));
	 ImageIcon SM = new ImageIcon(GUI.class.getResource("Sandstein_Mittel.png"));
	 ImageIcon SS = new ImageIcon(GUI.class.getResource("Sandstein_Schwer.png"));
	 
	 
	 JLabel blau_a3 = new JLabel(B3);
	 JLabel Blau_a3 = new JLabel("Blau A3");
	 
	 JLabel blau_a4 = new JLabel(B4);
	 JLabel Blau_a4 = new JLabel("Blau A4");
	 
	 JLabel blau_a5 = new JLabel(B5);
	 JLabel Blau_a5 = new JLabel("Blau A5");
	 
	 JLabel green_a3 = new JLabel(G3);
	 JLabel Green_a3 = new JLabel("Grün A3");
	 
	 JLabel green_a4 = new JLabel(G4);
	 JLabel Green_a4 = new JLabel("Grün A4");
	 
	 JLabel green_a5 = new JLabel(G5);
	 JLabel Green_a5 = new JLabel("Grün A5");
	 
	 JLabel white_a3 = new JLabel(W3);
	 JLabel White_a3 = new JLabel("Weiß A3");
	 
	 JLabel white_a4 = new JLabel(W4);
	 JLabel White_a4 = new JLabel("Weiß A4");
	 
	 JLabel white_a5 = new JLabel(W5);
	 JLabel White_a5 = new JLabel("Weiß A5");
	 
	 JLabel buche_balken = new JLabel(BBA);
	 JLabel Buche_Balken = new JLabel("Buche Balken");
	 
	 JLabel buche_bretter = new JLabel(BBR);
	 JLabel Buche_Bretter = new JLabel("Buche Bretter");
	 
	 JLabel buche_scheit = new JLabel(BSC);
	 JLabel Buche_Scheit = new JLabel("Buche Scheit");
	 
	 JLabel eiche_balken = new JLabel(EBA);
	 JLabel Eiche_Balken = new JLabel("Eiche Balken");
	 
	 JLabel eiche_bretter = new JLabel(EBR);
	 JLabel Eiche_Bretter = new JLabel("Eiche Bretter");
	 
	 JLabel eiche_scheit = new JLabel(ESC);
	 JLabel Eiche_Scheit = new JLabel("Eiche Scheit");
	 
	 JLabel kiefer_balken = new JLabel(KBA);
	 JLabel Kiefer_Balken = new JLabel("Kiefer Balken");
	 
	 JLabel kiefer_bretter = new JLabel(KBR);
	 JLabel Kiefer_Bretter = new JLabel("Kiefer Bretter");
	 
	 JLabel kiefer_scheit = new JLabel(KSC);
	 JLabel Kiefer_Scheit = new JLabel("Kiefer Scheit");
	 
	 JLabel marmor_leicht = new JLabel(ML);
	 JLabel Marmor_Leicht = new JLabel("Marmor Leicht");
	 
	 JLabel marmor_mittel = new JLabel(MM);
	 JLabel Marmor_Mittel = new JLabel("Marmor Mittel");
	 
	 JLabel marmor_schwer = new JLabel(MS);
	 JLabel Marmor_Schwer = new JLabel("Marmor Schwer");
	 
	 JLabel granit_leicht = new JLabel(GL);
	 JLabel Granit_Leicht = new JLabel("Granit Leicht");
	 
	 JLabel granit_mittel = new JLabel(GM);
	 JLabel Granit_Mittel = new JLabel("Granit Mittel");
	 
	 JLabel granit_schwer = new JLabel(GS);
	 JLabel Granit_Schwer = new JLabel("Granit Schwer");
	 
	 JLabel sandstein_leicht = new JLabel(SL);
	 JLabel Sandstein_Leicht = new JLabel("Sandstein Leicht");
	 
	 JLabel sandstein_mittel = new JLabel(SM);
	 JLabel Sandstein_Mittel = new JLabel("Sandstein Mittel");
	 
	 JLabel sandstein_schwer = new JLabel(SS);
	 JLabel Sandstein_Schwer = new JLabel("Sandstein Schwer");
	
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
	      
	    infoButton.setBounds(55, 50, 180, 80);
	    infoButton.setIcon(icnOut);
	    infoButton.setMargin(new Insets(2, 2, 2, 2));
	    infoButton.setBackground(Color.WHITE);
	    infoButton.setFocusPainted(false);
	    infoButton.setBorder(new LineBorder(Color.BLACK));
	    infoButton.addActionListener(new ActionListener() { 
	      public void actionPerformed(ActionEvent evt) { 
	    	  JFrame frame = new JFrame();
	    	  
	    	  frame.setLayout(new GridLayout(9, 6));
	    	  
	    	  frame.add(blau_a3);
	    	  frame.add(Blau_a3);
	    	  frame.add(blau_a4);
	    	  frame.add(Blau_a4);
	    	  frame.add(blau_a5);
	    	  frame.add(Blau_a5);
	    	  
	    	  frame.add(green_a3);
	    	  frame.add(Green_a3);
	    	  frame.add(green_a4);
	    	  frame.add(Green_a4);
	    	  frame.add(green_a5);
	    	  frame.add(Green_a5);
	    	  
	    	  frame.add(white_a3);
	    	  frame.add(White_a3);
	    	  frame.add(white_a4);
	    	  frame.add(White_a4);
	    	  frame.add(white_a5);
	    	  frame.add(White_a5);
	    	  
	    	  frame.add(buche_balken);
	    	  frame.add(Buche_Balken);
	    	  frame.add(buche_bretter);
	    	  frame.add(Buche_Bretter);
	    	  frame.add(buche_scheit);
	    	  frame.add(Buche_Scheit);
	    	  
	    	  frame.add(eiche_balken);
	    	  frame.add(Eiche_Balken);
	    	  frame.add(eiche_bretter);
	    	  frame.add(Eiche_Bretter);
	    	  frame.add(eiche_scheit);
	    	  frame.add(Eiche_Scheit);
	    	  
	    	  frame.add(kiefer_balken);
	    	  frame.add(Kiefer_Balken);
	    	  frame.add(kiefer_bretter);
	    	  frame.add(Kiefer_Bretter);
	    	  frame.add(kiefer_scheit);
	    	  frame.add(Kiefer_Scheit);
	    	  
	    	  frame.add(granit_leicht);
	    	  frame.add(Granit_Leicht);
	    	  frame.add(granit_mittel);
	    	  frame.add(Granit_Mittel);
	    	  frame.add(granit_schwer);
	    	  frame.add(Granit_Schwer);
	    	  
	    	  frame.add(marmor_leicht);
	    	  frame.add(Marmor_Leicht);
	    	  frame.add(marmor_mittel);
	    	  frame.add(Marmor_Mittel);
	    	  frame.add(marmor_schwer);
	    	  frame.add(Marmor_Schwer);
	    	  
	    	  frame.add(sandstein_leicht);
	    	  frame.add(Sandstein_Leicht);
	    	  frame.add(sandstein_mittel);
	    	  frame.add(Sandstein_Mittel);
	    	  frame.add(sandstein_schwer);
	    	  frame.add(Sandstein_Schwer);
	    	  
	    	  
	    	  
	    	  
	    	  frame.setTitle("Information");
	    	  frame.setSize(750, 670);
	    	  frame.setIconImage(img.getImage());
	    	  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    	  frame.setVisible(true);
	        }
	    });
	      
	    LabelInfo.setBounds(56, 136, 179, 20);
	    LabelInfo.setText("Info");
	    LabelInfo.setHorizontalTextPosition(SwingConstants.CENTER);
	    LabelInfo.setHorizontalAlignment(SwingConstants.CENTER);
	    LabelInfo.setBackground(new Color(0xFFC800));
	    LabelInfo.setOpaque(true);
	      
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
	      
		
		controlPanel.add(infoButton);
		controlPanel.add(moveControl);
		controlPanel.add(destroyControl);
		controlPanel.add(controlsLabel);
		controlPanel.add(colLeft);
		controlPanel.add(colRight);
		controlPanel.add(colBottom);
		controlPanel.add(LabelInfo);
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
