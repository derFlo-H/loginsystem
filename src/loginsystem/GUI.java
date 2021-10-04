package loginsystem;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

/*
 * GUI for loginsystem
 * 
 * Date: 041021
 * Author: Florian
 */

public class GUI extends JFrame {
	
	// Setting up JFrame and its properties
	private JFrame f;
	private String name;
	private int length;
	private int height;
	
	// Create JComponents
	private JTextField fieldName;
	private JTextField fieldPassword;
	
	private JLabel labelTitle;
	private JLabel labelName;
	private JLabel labelPassword;
	
	public GUI(String _name, int _length, int _height) {
		
		// Getting JFrame parameters
		name = _name;
		length = _length;
		height = _height;
		f = new JFrame();
		
		// setting up JComponents
		fieldName = new JTextField("                    ");
		fieldPassword = new JTextField("                    ");
		
		labelTitle = new JLabel("Login");
		labelName = new JLabel("Name: ");
		labelPassword = new JLabel("Password: ");
		
		// initialise everything
		init();
		
	}
	
	private void init() {
		
		// initiate JFrame
		f.setSize(length, height);
		f.setName(name);
		f.setBackground(Color.black);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// setup Layoutmanager
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		
		// Setting frame to be visible
		
		f.setVisible(true);
		
		//initiate & Add JComponents
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weighty = 0.1;
		f.add(labelTitle);
		
		gbc.weighty = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		f.add(labelName);
		
		gbc.gridx = 1;
		fieldName.setSize(1, 20);
		f.add(fieldName);
		
		gbc.gridx = 2;
		f.add(labelPassword);
		
		gbc.gridx = 3;
		fieldPassword.setSize(1, 20);
		f.add(fieldPassword);
	}

}
