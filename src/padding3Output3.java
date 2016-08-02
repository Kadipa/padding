import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding3Output3 extends JFrame implements ActionListener {
	JButton b,btnPrevention;
	JLabel label1;
	padding3Output3() {
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		ImageIcon pic1 = new ImageIcon(new ImageIcon("diseases/chinese_sprangle_top.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		
		b = new JButton("ေရွ႕သို႕သြားရန္");
		b.setBounds(400, 600, 300, 50);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		
		btnPrevention=new JButton("ကာကြယ္နည္း");
		btnPrevention.setBounds(200, 300, 300, 50);
		btnPrevention.addActionListener(this);
		btnPrevention.setForeground(Color.white);
		btnPrevention.setBackground(Color.decode("#008000"));
		btnPrevention.setFont(new java.awt.Font("Zawgyi-One",0,16));
		
				
		
		JPanel imagePanel=new JPanel();
		imagePanel.setBackground(Color.decode("#006400"));
		imagePanel.setLayout(new GridLayout(1,1));
		label1 = new JLabel(pic1);
		
		imagePanel.add(label1);
		JLabel data1=new JLabel("ေဒါင္းျမီးပ်ံ");
		data1.setForeground(Color.white);
		data1.setFont(new java.awt.Font("Zawgyi-One",0,20));
		imagePanel.add(data1);
		
		container.add(imagePanel,BorderLayout.CENTER);

		JPanel btnPanel=new JPanel();
		
		/*btnPrevention=new JButton("á€€á€¬á€€á€¼á€šá€¹á€¹á€”á€Šá€¹á€¸á€™á€ºá€¬á€¸");
		btnPrevention.addActionListener(this);
		btnPrevention.setFont(new java.awt.Font("Zawgyi-One",0,16));*/
		
		btnPanel.setBackground(Color.decode("#006400"));
		btnPanel.add(b);
		btnPanel.add(btnPrevention);
		
		container.add(btnPanel,BorderLayout.SOUTH);
		
		setContentPane(container);
		setSize(1200, 950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {

		new padding3Output3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		if (e.getSource()==b){
			new padding3();
		}
		else if (e.getSource()==btnPrevention){
			//do something
			new Paddy2Final();
		}
	}
		
}
