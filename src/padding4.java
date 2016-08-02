import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class padding4 extends JFrame implements ActionListener {
	JCheckBox rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10, rb11, rb12, r;
	JButton b,e;

	padding4() {
		setContentPane(new JLabel(new ImageIcon(new ImageIcon("symptoms/plantSympton.jpg").getImage()
				.getScaledInstance(1300, 760, Image.SCALE_SMOOTH))));

		rb1 = new JCheckBox("အရြက္မ်ားအျဖဴေရာင္အေမွးပါးမ်ားသာက်န္သလား");
		rb1.setIcon(
				new ImageIcon(((new ImageIcon("symptoms/leaf_white_thin_layer.JPG")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb1.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb1.setBounds(100, 200, 500, 75);
		rb1.setForeground(Color.white);
		rb1.setBackground(Color.decode("#008000"));
		rb1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		rb2 = new JCheckBox("အရြက္မ်ားမီးေလာင္သကဲ့သို႔ေျခာက္သလား");
		rb2.setIcon(
				new ImageIcon(((new ImageIcon("symptoms/dry_leaf_like_burning.jpg")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb2.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb2.setBounds(100, 275, 500, 75);
		rb2.setForeground(Color.white);
		rb2.setBackground(Color.decode("#008000"));
		rb2.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb3 = new JCheckBox("အရြက္မ်ားထိပ္ျပတ္ေနသလား");
		rb3.setIcon(
				new ImageIcon(((new ImageIcon("symptoms/no_top_level_of_leaf.jpg")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb3.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb3.setBounds(100, 350, 500, 75);
		rb3.setForeground(Color.white);
		rb3.setBackground(Color.decode("#008000"));
		rb3.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb4 = new JCheckBox("အရြက္မ်ားအျဖဴေရာင္အကြက္လိုက္ျဖစ္ေနသလား");
		rb4.setIcon(new ImageIcon(
				((new ImageIcon("symptoms/many_circle_of_white_thin_layer.jpg")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb4.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb4.setBounds(100, 425, 500, 75);
		rb4.setForeground(Color.white);
		rb4.setBackground(Color.decode("#008000"));
		rb4.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb5 = new JCheckBox("စပါးပင္စည္ပုပ္ သလား");
		rb5.setIcon(new ImageIcon(((new ImageIcon("symptoms/stem_spoil.JPG")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));		rb5.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb5.setBounds(100, 500, 500, 75);
		rb5.setForeground(Color.white);
		rb5.setBackground(Color.decode("#008000"));
		rb5.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb6 = new JCheckBox("စပါးအနွံ ျဖဴေနပါသလား");
		rb6.setIcon(new ImageIcon(((new ImageIcon("symptoms/white_grain.jpg")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb6.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb6.setBounds(100, 575, 500, 75);
		rb6.setForeground(Color.white);
		rb6.setBackground(Color.decode("#008000"));
		rb6.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb7 = new JCheckBox("စပါးေစ့မ်ား ပိုမိုေသးငယ္ပါသလား");
		rb7.setIcon(new ImageIcon(((new ImageIcon("symptoms/small_grain.jpg")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb7.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb7.setBounds(700, 200, 500, 75);
		rb7.setForeground(Color.white);
		rb7.setBackground(Color.decode("#008000"));
		rb7.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb8 = new JCheckBox("စပါးနွံမ်ား လံုးဝမရွိေတာ့ပါသလား");
		rb8.setIcon(new ImageIcon(((new ImageIcon("symptoms/no_grain.JPG")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb8.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb8.setBounds(700, 275, 500, 75);
		rb8.setForeground(Color.white);
		rb8.setBackground(Color.decode("#008000"));
		rb8.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb9 = new JCheckBox("စပါးပင္ပြားအေျခသည္ေရာင္ရမ္းျပီးဖုလံုးျဖစ္ေနသလား");
		rb9.setIcon(new ImageIcon(((new ImageIcon("symptoms/puffy_scoin.JPG")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb9.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb9.setBounds(700, 350, 500, 75);
		rb9.setForeground(Color.white);
		rb9.setBackground(Color.decode("#008000"));
		rb9.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb10 = new JCheckBox("စပါးရြက္မ်ားတြင္အျဖဴေရာင္အစင္းမ်ားေတြ႔ရသလား");
		rb10.setIcon(new ImageIcon(
				((new ImageIcon("symptoms/transparent_white_stripe.jpg")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb10.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb10.setBounds(700, 425, 500, 75);
		rb10.setForeground(Color.white);
		rb10.setBackground(Color.decode("#008000"));
		rb10.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb11 = new JCheckBox("အရြက္ဖ်ားတြင္ပိုးခ်ည္ျဖင့္အတြင္းသို့ေခါက္သြားသလား");
		rb11.setIcon(new ImageIcon(
				((new ImageIcon("symptoms/folder_inside_leaf_with_silk.jpg")).getImage())
						.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb11.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb11.setBounds(700, 500, 500, 75);
		rb11.setForeground(Color.white);
		rb11.setBackground(Color.decode("#008000"));
		rb11.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		rb12 = new JCheckBox("အရြက္မ်ားေျခာက္သလား");
		rb12.setIcon(new ImageIcon(((new ImageIcon("symptoms/dry_leaf.png")).getImage())
				.getScaledInstance(65, 75, java.awt.Image.SCALE_SMOOTH)));
		rb12.setSelectedIcon(new ImageIcon(((new ImageIcon("symptoms/check.jpg")).getImage())
				.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH)));
		rb12.setBounds(700, 575, 500, 75);
		rb12.setForeground(Color.white);
		rb12.setBackground(Color.decode("#008000"));
		rb12.setFont(new Font("Zawgyi-one", Font.BOLD, 18));


		b = new JButton("ေရြးခ်ယ္သည္");
		b.setBounds(100, 680, 200, 50);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		e = new JButton("ေရွ႕သို႕သြားရန္");
		e.setBounds(700, 680, 200, 50);
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

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		// setSize(1280,960);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(b)){
		if (rb1.isSelected() || rb2.isSelected()) {
			setVisible(false);
			new padding4Output1();
		} else if (rb3.isSelected() || rb4.isSelected()) {
			setVisible(false);
			new padding4Output2();
		} else if (rb5.isSelected() || rb6.isSelected()) {
			setVisible(false);
			new padding4Output3();
		} else if (rb6.isSelected()) {
			setVisible(false);
			new padding4Output4();
		} else if (rb8.isSelected()) {
			setVisible(false);
			new padding4Output5();
		} else if (rb9.isSelected()) {
			setVisible(false);
			new padding4Output6();
		} else if (rb10.isSelected() && rb11.isSelected() && rb12.isSelected()) {
			setVisible(false);
			new padding4Output7();
		} else if (rb4.isSelected() && rb8.isSelected() && rb11.isSelected()) {
			setVisible(false);
			new padding4Output8();
		} else if (rb11.isSelected()) {
			setVisible(false);
			new padding4Output9();
		}}
		else{
			setVisible(false);
			new secondMainFrame();
		}

	}

	public static void main(String args[]) {
		new padding4();

	}
}