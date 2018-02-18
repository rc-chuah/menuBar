import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu fontMenu;
	private JMenu colorMenu;
	private JMenu aboutMenu;
	private JMenuItem fontMenuItem1;
	private JMenuItem fontMenuItem2;
	private JMenuItem fontMenuItem3;
	private JMenuItem colorMenuItem1;
	private JMenuItem colorMenuItem2;
	private JMenuItem colorMenuItem3;
	private JMenuItem colorMenuItem4;
	private JMenuItem colorMenuItem5;
	private JMenuItem colorMenuItem6;
	private JMenuItem help;
	
	public Menu() {
		super("JMenuBar Demo");
		
		textArea = new JTextArea();
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		add(menuBar, BorderLayout.NORTH);
		
		fontMenu = new JMenu("Font");
		menuBar.add(fontMenu);
		
		fontMenuItem1 = new JMenuItem("Bold");
		fontMenuItem1.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setFont(new Font("Serif", Font.BOLD, 22));
					}
				}
				);
		fontMenuItem2 = new JMenuItem("Italic");
		fontMenuItem2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setFont(new Font("Serif", Font.ITALIC, 22));
					}
				}
				);
		fontMenuItem3 = new JMenuItem("Roman Baseline");
		fontMenuItem3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setFont(new Font("Serif", Font.ROMAN_BASELINE, 22));
					}
				}
				);
		fontMenu.add(fontMenuItem1);
		fontMenu.add(fontMenuItem2);
		fontMenu.add(fontMenuItem3);
		
		colorMenu = new JMenu("Color");
		menuBar.add(colorMenu);
		
		colorMenuItem1 = new JMenuItem("Red");
		colorMenuItem1.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.RED);
					}
				}
				);

		colorMenuItem2 = new JMenuItem("Blue");
		colorMenuItem2.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.BLUE);
					}
				}
				);

		colorMenuItem3 = new JMenuItem("Green");
		colorMenuItem3.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.GREEN);
					}
				}
				);

		colorMenuItem4 = new JMenuItem("Orange");
		colorMenuItem4.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.ORANGE);
					}
				}
				);

		colorMenuItem5 = new JMenuItem("Cyan");
		colorMenuItem5.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.CYAN);
					}
				}
				);

		colorMenuItem6 = new JMenuItem("Pink");
		colorMenuItem6.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setForeground(Color.PINK);
					}
				}
				);

		colorMenu.add(colorMenuItem1);
		colorMenu.add(colorMenuItem2);
		colorMenu.add(colorMenuItem3);
		colorMenu.add(colorMenuItem4);
		colorMenu.add(colorMenuItem5);
		colorMenu.add(colorMenuItem6);
		
		aboutMenu = new JMenu("About");
		menuBar.add(aboutMenu);
		
		help = new JMenuItem("Help");
		help.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						textArea.setText("Type text in Text Area, Click Font"
								+ " to select and change font, click Color to select "
								+ " and change color of text.");
					}
				}
				);
		aboutMenu.add(help);	
	}
}
