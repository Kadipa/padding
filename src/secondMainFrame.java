import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class secondMainFrame extends JFrame implements ActionListener {
	JRadioButton rb1, rb2, rb3, rb4;
	JButton b, e;

	secondMainFrame() {
		setContentPane(new JLabel(new ImageIcon(new ImageIcon("symptoms/category.jpg").getImage()
				.getScaledInstance(1300, 760, Image.SCALE_SMOOTH))));

		rb1 = new JRadioButton("ေရာဂါလကၡဏာျဖင္ ့ေရြးခ်ယ္ပါ");
		rb1.setIcon(new ImageIcon(((new ImageIcon("symptoms/c1.gif")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb1.setBounds(300, 200, 450, 50);
		rb1.setForeground(Color.white);
		rb1.setBackground(Color.decode("#008000"));
		rb1.setFont(new java.awt.Font("ZawGyi-One", Font.BOLD, 18));

		rb2 = new JRadioButton("အခ်ိန္ႏွင့္ လျဖင့္ ေရြးခ်ယ္ပါ");
		rb2.setIcon(new ImageIcon(((new ImageIcon("symptoms/c2.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb2.setBounds(300, 275, 450, 50);
		rb2.setForeground(Color.white);
		rb2.setBackground(Color.decode("#008000"));
		rb2.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		rb3 = new JRadioButton("ေျမအမ်ိဳးအစားျဖင့္ ေရြးခ်ယ္ပါ");
		rb3.setIcon(new ImageIcon(((new ImageIcon("symptoms/c3.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb3.setBounds(300, 350, 450, 50);
		rb3.setForeground(Color.white);
		rb3.setBackground(Color.decode("#008000"));
		rb3.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		rb4 = new JRadioButton("အပင္လကၡဏာျဖင့္ ေရြးခ်ယ္ပါ");
		rb4.setIcon(new ImageIcon(((new ImageIcon("symptoms/c4.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb4.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 50, java.awt.Image.SCALE_SMOOTH)));
		rb4.setBounds(300, 425, 450, 50);
		rb4.setForeground(Color.white);
		rb4.setBackground(Color.decode("#008000"));
		rb4.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		

		b = new JButton("ေရြးခ်ယ္သည္");
		b.setBounds(300, 600, 300, 50);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		e = new JButton("ေရွ႕သို႕သြားရန္");
		e.setBounds(700, 600, 300, 50);
		e.addActionListener(this);
		e.setForeground(Color.white);
		e.setBackground(Color.decode("#008000"));
		e.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(b);
		add(e);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		// setSize(1280,960);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b)) {
			if (rb1.isSelected()) {
				setVisible(false);
				new CopyOfTypesofDiseases();
			}
			if (rb2.isSelected()) {
				setVisible(false);
				new padding2();
			}
			if (rb3.isSelected()) {
				setVisible(false);
				new padding3();
			}
			if (rb4.isSelected()) {
				setVisible(false);
				new padding4();
			}

			
		} else {
		 setVisible(false);
		 new Main();
		}
	}

	public static void main(String args[]) {
		new secondMainFrame();
	}
}
