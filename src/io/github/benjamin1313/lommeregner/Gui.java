package io.github.benjamin1313.lommeregner;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui extends JFrame{
	
	private JTextField input1;
	private JTextField input2;
	private JTextField resultat;
	private JLabel text;
	private JButton knap1;
	private JButton knap2;
	private JButton knap3;
	private JButton knap4;
	
	public Gui() {
		super("LommeRegner");
		setLayout(new FlowLayout());
		
		text = new JLabel("indsæt det første nummer her.");
		add(text);
		
		input1 = new JTextField(25);
		add(input1);
		
		text = new JLabel("indsæt det andet nummer her.");
		add(text);
		
		input2 = new JTextField(25);
		add(input2);
		
		knap1 = new JButton("+");
		add(knap1);
		
		knap2 = new JButton("-");
		add(knap2);
		
		knap3 = new JButton("*");
		add(knap3);
		
		knap4 = new JButton("/");
		add(knap4);
		
		resultat = new JTextField(25);
		resultat.setEditable(false);
		add(resultat);
		
		HandlerClassPluds handler1 = new HandlerClassPluds();
		HandlerClassMinus handler2 = new HandlerClassMinus();
		HandlerClassGange handler3 = new HandlerClassGange();
		HandlerClassDevidere handler4 = new HandlerClassDevidere();
		knap1.addActionListener(handler1);
		knap2.addActionListener(handler2);
		knap3.addActionListener(handler3);
		knap4.addActionListener(handler4);
		
	}
	

	private class HandlerClassPluds implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			double inum1 = 0;
			double inum2 = 0;
			
			String snum1 = input1.getText();
			String snum2 = input2.getText();
			String svag;
			
			try {
			      inum1 = Double.parseDouble(snum1);
			      inum2 = Double.parseDouble(snum2);
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(rootPane, "brug kun numre i lommeregneren.");
				
			}
			
			double isvag = inum1 + inum2;
			
			svag = Double.toString(isvag);
			resultat.setText(svag);
		
		}
	}
	
	private class HandlerClassMinus implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			double inum1 = 0;
			double inum2 = 0;
			
			String snum1 = input1.getText();
			String snum2 = input2.getText();
			String svag;
			
			try {
			      inum1 = Double.parseDouble(snum1);
			      inum2 = Double.parseDouble(snum2);
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(rootPane, "brug kun numre i lommeregneren.");
				
			}
			
			double isvag = inum1 - inum2;
			
			svag = Double.toString(isvag);
			resultat.setText(svag);
		}
	}
	
	private class HandlerClassGange implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			double inum1 = 0;
			double inum2 = 0;
			
			String snum1 = input1.getText();
			String snum2 = input2.getText();
			String svag;
			
			try {
			      inum1 = Double.parseDouble(snum1);
			      inum2 = Double.parseDouble(snum2);
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(rootPane, "brug kun numre i lommeregneren.");
				
			}
			
			double isvag = inum1 * inum2;
			
			svag = Double.toString(isvag);
			resultat.setText(svag);
		}
	}
	
	private class HandlerClassDevidere implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			double inum1 = 0;
			double inum2 = 0;
			
			String snum1 = input1.getText();
			String snum2 = input2.getText();
			String svag;
			
			try {
			      inum1 = Double.parseDouble(snum1);
			      inum2 = Double.parseDouble(snum2);
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(rootPane, "brug kun numre i lommeregneren.");
				
			}
			
			double isvag = inum1 / inum2;
			
			svag = Double.toString(isvag);
			resultat.setText(svag);
		}
	}
	
}
