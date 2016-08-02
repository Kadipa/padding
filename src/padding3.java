import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class padding3 extends JFrame implements ActionListener {
	JRadioButton rb1, rb2, rb3;
	JButton b,e;

	padding3() {
		setContentPane(new JLabel(new ImageIcon(new ImageIcon("symptoms/soil.jpg").getImage()
				.getScaledInstance(1300, 760, Image.SCALE_SMOOTH))));

		rb1 = new JRadioButton("စိုစြတ္ေသာေျမ");
		rb1.setFont(new java.awt.Font("Zawgyi-One", 0, 14));
		rb1.setIcon(new ImageIcon(((new ImageIcon("symptoms/c3.jpg")).getImage())
			.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
			.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setBounds(200, 200, 400, 55);
		rb1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));	
		rb1.setForeground(Color.white);
		rb1.setBackground(Color.decode("#008000"));
	


		rb2 = new JRadioButton("ေရလႊမ္းေသာေျမ");
	
		rb2.setIcon(new ImageIcon(((new ImageIcon("symptoms/c3.jpg")).getImage())
			.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
			.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setBounds(200, 350, 400, 55);
		rb2.setFont(new Font("Zawgyi-one", Font.BOLD, 18));	
		rb2.setForeground(Color.white);
		rb2.setBackground(Color.decode("#008000"));

		rb3 = new JRadioButton("ရႊံ႕ေျမ");
		rb3.setIcon(new ImageIcon(((new ImageIcon("symptoms/c3.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
			.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setBounds(200, 500, 400, 55);
		rb3.setFont(new Font("Zawgyi-one", Font.BOLD, 18));	
		rb3.setForeground(Color.white);
		rb3.setBackground(Color.decode("#008000"));

		
		b = new JButton("ေရြးခ်ယ္သည္");
		b.setBounds(200, 650, 300, 55);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		e = new JButton("ေရွ႕သို႕သြားရန္");
		e.setBounds(700, 650, 300, 55);
		e.addActionListener(this);
		e.setForeground(Color.white);
		e.setBackground(Color.decode("#008000"));
		e.setFont(new Font("Zawgyi-one", Font.BOLD, 18));		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);

		add(rb1);
		add(rb2);
		add(rb3);
		add(b);
		add(e);

		//setSize(1200, 950);
		setLayout(null);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			setVisible(false);
			new padding3Output1();
		}
		else if (rb2.isSelected()) {
			setVisible(false);
			new padding3Output2();
		
		}
		
		else if(rb3.isSelected()){
			setVisible(false);
			new padding3Output3();
		
		}
		else{
			setVisible(false);
			new secondMainFrame();
		}
	}

	public static void main(String args[]) {
		new padding3();

	}
}