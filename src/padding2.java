import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class padding2 extends JFrame implements ActionListener {
	JCheckBox rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12;
	JButton b,e;

	padding2() {
		setContentPane(new JLabel(new ImageIcon(new ImageIcon("symptoms/month.jpg").getImage()
				.getScaledInstance(1300, 760, Image.SCALE_SMOOTH))));

		//setContentPane(new JLabel(new ImageIcon("symptoms/month.jpg")));

		rb1 = new JCheckBox("ဇန္နဝါရီလ");
		rb1.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb1.setBounds(200, 200, 300, 50);
		rb1.setForeground(Color.white);
		rb1.setBackground(Color.decode("#008000"));

		rb2 = new JCheckBox("ေဖေဖာ္ဝါရီလ");
		rb2.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setBounds(200, 275, 300, 50);
		rb2.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb2.setForeground(Color.white);
		rb2.setBackground(Color.decode("#008000"));

		rb3 = new JCheckBox("မတ္လ");
		rb3.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setBounds(200, 350, 300, 50);
		rb3.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb3.setForeground(Color.white);
		rb3.setBackground(Color.decode("#008000"));

		rb4 = new JCheckBox("ဧျပီလ");
		rb4.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb4.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb4.setBounds(200, 425, 300, 50);
		rb4.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb4.setForeground(Color.white);
		rb4.setBackground(Color.decode("#008000"));

		rb5 = new JCheckBox("ေမလ");
		rb5.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb5.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb5.setBounds(200, 500, 300, 50);
		rb5.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb5.setForeground(Color.white);
		rb5.setBackground(Color.decode("#008000"));

		rb6 = new JCheckBox("ဇြန္လ");
		rb6.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb6.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb6.setBounds(200, 575, 300, 50);
		rb6.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb6.setForeground(Color.white);
		rb6.setBackground(Color.decode("#008000"));

		rb7 = new JCheckBox("ဇူလိုင္လ");
		rb7.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb7.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb7.setBounds(700, 200, 300, 50);
		rb7.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb7.setForeground(Color.white);
		rb7.setBackground(Color.decode("#008000"));

		rb8 = new JCheckBox("ၾသဂုတ္လ");
		rb8.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb8.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb8.setBounds(700, 275, 300, 50);
		rb8.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb8.setForeground(Color.white);
		rb8.setBackground(Color.decode("#008000"));
		
		rb9 = new JCheckBox("စက္တင္ဘာလ");
		rb9.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb9.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb9.setBounds(700, 350, 300, 50);
		rb9.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb9.setForeground(Color.white);
		rb9.setBackground(Color.decode("#008000"));

		rb10 = new JCheckBox("ေအာက္တိုဘာလ");
		rb10.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb10.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb10.setBounds(700, 425, 300, 50);
		rb10.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb10.setForeground(Color.white);
		rb10.setBackground(Color.decode("#008000"));
		
		rb11 = new JCheckBox("ႏိုဝင္ဘာလ");
		rb11.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb11.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb11.setBounds(700, 500, 300, 50);
		rb11.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb11.setForeground(Color.white);
		rb11.setBackground(Color.decode("#008000"));

		rb12 = new JCheckBox("ဒီဇင္ဘာလ");
		rb12.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb12.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb12.setBounds(700, 575, 300, 50);
		rb12.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		rb12.setForeground(Color.white);
		rb12.setBackground(Color.decode("#008000"));
		
		b = new JButton("ေရြးခ်ယ္သည္");
		b.setBounds(200, 700, 300, 50);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		e = new JButton("ေရွ႕သို႕သြားရန္");
		e.setBounds(700, 700, 300, 50);
		e.addActionListener(this);
		e.setForeground(Color.white);
		e.setBackground(Color.decode("#008000"));
		e.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(rb5);
		add(rb6);
		add(rb7);
		add(rb8);
		add(rb9);
		add(rb10);
		add(rb11);
		add(rb12);
		add(b);
		add(e);

		setSize(1200, 950);
		setLayout(null);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected() || rb2.isSelected() || rb12.isSelected() && rb8.isSelected() || rb9.isSelected()) {
			setVisible(false);
			new output1();
		}

		else if (rb6.isSelected() || rb7.isSelected() || rb8.isSelected() || rb9.isSelected()
				|| rb12.isSelected() && rb11.isSelected()) {
			setVisible(false);
			new output2();
		}

		else if (rb11.isSelected()) {
			setVisible(false);
			new output2();
		} else if (rb6.isSelected() || rb7.isSelected() || rb8.isSelected() || rb9.isSelected() || rb12.isSelected()) {
			setVisible(false);
			new output3();

		}
		else if(rb1.isSelected() || rb2.isSelected() || rb12.isSelected() || rb6.isSelected() || rb7.isSelected() || rb8.isSelected() || rb9.isSelected() && rb3.isSelected() || rb4.isSelected() || rb10.isSelected()){
			setVisible(false);
			new output4();

		}
		else if(rb3.isSelected() || rb4.isSelected() || rb10.isSelected()){
			setVisible(false);
			new output4();

		}
		else if(rb1.isSelected() || rb2.isSelected() || rb12.isSelected()){
			setVisible(false);
			new output5();
		}
		else{
			setVisible(false);
			new secondMainFrame();
		}

	}

	public static void main(String args[]) {
		new padding2();

	}
}