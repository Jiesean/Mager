package com.jiesean.mager;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.naming.spi.DirObjectFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JTextPane;

public class MainUI extends JFrame{
	private Dimension screenSize;
	
	MainUI() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Mager");
		this.setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
		getContentPane().setLayout(null);
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.PINK);
		textPane.setLocation(0, 0);
		textPane.setEditable(true);
		textPane.setSize(this.getWidth()/2, this.getHeight());
		
		JPanel panel = new JPanel();
//		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, this.getWidth()/2, this.getHeight());
		panel.setLayout(null);
		
		JScrollPane js=new JScrollPane(textPane);
		panel.add(js);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
		getContentPane().add(panel_1);
		this.setVisible(true);
	}
}
