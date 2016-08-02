import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding3Output2 extends JFrame implements ActionListener {
	JButton b,btnPrevention;
	JLabel label1, label2 , label3, label4,label5,label6,label7;
	padding3Output2() {
		//JFrame test = new JFrame("Paddy Expert System");
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		ImageIcon pic1 = new ImageIcon(new ImageIcon("weeds/common_branyard_grass.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic2 = new ImageIcon(new ImageIcon("weeds/saramolla_grass.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic3 = new ImageIcon(new ImageIcon("weeds/rice_flatsedge.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic4 = new ImageIcon(new ImageIcon("weeds/lesser_fimbristylis.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic5 = new ImageIcon(new ImageIcon("weeds/pickerel_weed.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic6 = new ImageIcon(new ImageIcon("weeds/primroise_willow.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		ImageIcon pic7 = new ImageIcon(new ImageIcon("weeds/goose_weed.jpg").getImage().getScaledInstance(200, 150, java.awt.Image.SCALE_SMOOTH));
		
		
				
		JPanel imagePanel=new JPanel();
		imagePanel.setBackground(Color.decode("#006400"));
		imagePanel.setLayout(new GridLayout(1,3));
		
		JPanel leftPanel=new JPanel();
		leftPanel.setBackground(Color.decode("#006400"));
		leftPanel.setLayout(new BorderLayout());
		label1 = new JLabel(pic1);
		label2 = new JLabel(pic2);
		label3 = new JLabel(pic3);
		label4 = new JLabel(pic4);
		label5 = new JLabel(pic5);
		label6 = new JLabel(pic6);
		label7 = new JLabel(pic7);
		
		JPanel leftFirstPanel=new JPanel();
		leftFirstPanel.setBackground(Color.decode("#006400"));
		leftFirstPanel.setLayout(new BorderLayout());
		leftFirstPanel.add(label1,BorderLayout.NORTH);
		
		JLabel data1=new JLabel("ျမက္သီး");
		data1.setHorizontalAlignment(JLabel.CENTER);
		data1.setForeground(Color.white);
		data1.setFont(new java.awt.Font("Zawgyi-One",0,20));	
		leftFirstPanel.add(data1,BorderLayout.CENTER);
		
		JPanel leftSecondPanel=new JPanel();
		leftSecondPanel.setBackground(Color.decode("#006400"));
		leftSecondPanel.setLayout(new BorderLayout());
		leftSecondPanel.add(label2,BorderLayout.CENTER);
		
		JLabel data2=new JLabel("ကေခ်သည္ျမက္");
		data2.setHorizontalAlignment(JLabel.CENTER);
		data2.setForeground(Color.white);
		data2.setFont(new java.awt.Font("Zawgyi-One",0,20));
		leftSecondPanel.add(data2,BorderLayout.SOUTH);
		
		leftPanel.add(leftFirstPanel,BorderLayout.NORTH);
		leftPanel.add(leftSecondPanel,BorderLayout.SOUTH);
		
		JPanel middlePanel=new JPanel();
		middlePanel.setBackground(Color.decode("#006400"));
		middlePanel.setLayout(new BorderLayout());
		
		JPanel middleFirstPanel=new JPanel();
		middleFirstPanel.setBackground(Color.decode("#006400"));
		middleFirstPanel.setLayout(new BorderLayout());
		
		middleFirstPanel.add(label3,BorderLayout.CENTER);
		JLabel data3=new JLabel("ျမက္မံုညင္းအဝါ");
		data3.setHorizontalAlignment(JLabel.CENTER);
		data3.setForeground(Color.white);
		data3.setFont(new java.awt.Font("Zawgyi-One",0,20));
		middleFirstPanel.add(data3,BorderLayout.SOUTH);
		
		
		JPanel middleSecondPanel=new JPanel();
		middleSecondPanel.setBackground(Color.decode("#006400"));
		middleSecondPanel.setLayout(new BorderLayout());
		
		middleSecondPanel.add(label4,BorderLayout.CENTER);
		
		JLabel data4=new JLabel("ျမက္ကြမ္းသီးေလး");
		data4.setHorizontalAlignment(JLabel.CENTER);
		data4.setForeground(Color.white);
		data4.setFont(new java.awt.Font("Zawgyi-One",0,20));
		
		middleSecondPanel.add(data4,BorderLayout.SOUTH);
		
		JPanel middleThirdPanel=new JPanel();
		middleThirdPanel.setBackground(Color.decode("#006400"));
		middleThirdPanel.setLayout(new BorderLayout());
		
		middleThirdPanel.add(label5,BorderLayout.CENTER);
		
		JLabel data5=new JLabel("ကေတာက္ဆက္ ");
		data5.setHorizontalAlignment(JLabel.CENTER);
		data5.setForeground(Color.white);
		data5.setFont(new java.awt.Font("Zawgyi-One",0,20));
		
		middleThirdPanel.add(data5,BorderLayout.SOUTH);
		
		middlePanel.add(middleFirstPanel,BorderLayout.NORTH);
		middlePanel.add(middleSecondPanel,BorderLayout.CENTER);
		middlePanel.add(middleThirdPanel,BorderLayout.SOUTH);
		
		JPanel rightPanel=new JPanel();
		rightPanel.setBackground(Color.decode("#006400"));
		rightPanel.setLayout(new BorderLayout());
		
		JPanel rightFirstPanel=new JPanel();
		rightFirstPanel.setBackground(Color.decode("#006400"));
		rightFirstPanel.setLayout(new BorderLayout());
		
		rightFirstPanel.add(label6,BorderLayout.CENTER);
		
		JLabel data6=new JLabel("လယ္ေလညင္း");
		data6.setHorizontalAlignment(JLabel.CENTER);
		data6.setForeground(Color.white);
		data6.setFont(new java.awt.Font("Zawgyi-One",0,20));
		
		rightFirstPanel.add(data6,BorderLayout.SOUTH);
		
		JPanel rightSecondPanel=new JPanel();
		rightSecondPanel.setBackground(Color.decode("#006400"));
		rightSecondPanel.setLayout(new BorderLayout());
		
		rightSecondPanel.add(label7,BorderLayout.CENTER);
		
		JLabel data7=new JLabel("လယ္ပဒူ");
		data7.setHorizontalAlignment(JLabel.CENTER);
		data7.setForeground(Color.white);
		data7.setFont(new java.awt.Font("Zawgyi-One",0,20));
		
		rightSecondPanel.add(data7,BorderLayout.SOUTH);
		
		rightPanel.add(rightFirstPanel,BorderLayout.NORTH);
		rightPanel.add(rightSecondPanel,BorderLayout.SOUTH);
		
		/*container.add(leftPanel,BorderLayout.WEST);
		container.add(middlePanel,BorderLayout.CENTER);
		container.add(rightPanel,BorderLayout.EAST);*/
		
		imagePanel.add(leftPanel);
		imagePanel.add(middlePanel);
		imagePanel.add(rightPanel);

		JPanel btnPanel=new JPanel();
		
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
		
		btnPanel.setBackground(Color.decode("#006400"));
		btnPanel.add(btnPrevention);
		btnPanel.add(b);
		
		
		/*JLabel data=new JLabel("Toe Lay is real");
		container.add(data);*/
		
		container.add(imagePanel,BorderLayout.CENTER);
		
		container.add(btnPanel,BorderLayout.SOUTH);
		
		setContentPane(container);
		setSize(1200, 950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String args[]) {

		new padding3Output2();

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