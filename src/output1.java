import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class output1 extends JFrame implements ActionListener {
	JButton b,btnPrevention;
	JLabel label1, label2 , label3;
	output1() {
		//JFrame test = new JFrame("Paddy Expert System");
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		ImageIcon pic1 = new ImageIcon(new ImageIcon("diseases/rice_blast.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic2 = new ImageIcon(new ImageIcon("diseases/white_tip_nematode.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		
		
		b = new JButton("ေရွ႕သို႕သြားရန္");
		b.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		b.setBounds(500, 500, 200, 40);
		b.addActionListener(this);
		
		JPanel imagePanel=new JPanel();
		imagePanel.setBackground(Color.decode("#006400"));
		imagePanel.setLayout(new GridLayout(2,2));
		label1 = new JLabel(pic1);
		label2 = new JLabel(pic2);
		
		imagePanel.add(label1);
		JLabel data1=new JLabel("စပါးဂုတ္္က်ိဳးေရာဂါ");
		data1.setForeground(Color.white);
		data1.setFont(new java.awt.Font("Zawgyi-One",0,14));
		imagePanel.add(data1);
		
		imagePanel.add(label2);
		JLabel data2=new JLabel("စပါးရြက္ဖ်ားျဖဴနီမတုတ္ေရာဂါ");
		data2.setForeground(Color.white);
		data2.setFont(new java.awt.Font("Zawgyi-One",0,14));
		imagePanel.add(data2);
		
		container.add(imagePanel,BorderLayout.CENTER);

		JPanel btnPanel=new JPanel();
		
		btnPrevention=new JButton("ကာကြယ္္နည္းမ်ား");
		btnPrevention.addActionListener(this);
		btnPrevention.setFont(new java.awt.Font("Zawgyi-One",0,16));
		
		btnPanel.setBackground(Color.decode("#006400"));
		btnPanel.add(b);
		btnPanel.add(btnPrevention);
		
		/*JLabel data=new JLabel("Toe Lay is real");
		container.add(data);*/
		
		container.add(btnPanel,BorderLayout.SOUTH);
		
		setContentPane(container);
		setSize(1200, 950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);

	}

	public static void main(String args[]) {

		new output1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		
		if (e.getSource()==b){
			new padding2();
		}
		else if (e.getSource()==btnPrevention){
			//do something
			new Paddy2Final();
		}
		

	}
}