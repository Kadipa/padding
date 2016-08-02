import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output3 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output3() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_stemborer1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_stemborer2.jpg")
		.getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label3);
		
		photoPanel.setBackground(Color.decode("#006400"));
		
		topPanel.add(photoPanel,BorderLayout.CENTER);
		
		JPanel buttomPanel=new JPanel();
		buttomPanel.setLayout(new BorderLayout());
		
		/*JPanel buttonPanel=new JPanel();
		JButton btnExit=new JButton("ေရွ႕သို႕သြားရန္");
		btnExit.addActionListener(this);
		buttonPanel.add(btnExit);
		btnExit.setFont(new Font("Zawgyi-one", Font.BOLD, 18));*/
		
		
		String str="စပါးဆစ္ပိုးမ်ား (rice stemborer)\n\n"+
	"က်ေရာက္သည့္အခ်ိန္- \t- စပါးပ်ိဳးခင္းမွ အနံထြက္ခ်ိန္ထိ က်ေရာက္သည္\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ - \tပိုးေကာင္မွာ စပါးပင္စည္အတြင္းေနျပီး စားေသာက္ဖ်က္ဆီးသည္\n\n"+
	
	"ပံုသဏၰာန္ - \t\tအေတာင္မွာ ေကာက္ရိုးေဖ်ာ့ေရာင္ ရွိျပီး ထင္ရွားေသာ အနက္စက္ ပါရွိသည္\n\n"+
	"ကာကြယ္နွိမ္နင္းနည္း -\t ေပါင္းျမက္မ်ားကို မီးရွိဳ့ပါ\n\n"+
			"\t\t-ပ်ိုဳးနုတ္ျပီးေသာအခါ ေကာက္မစိုက္မီ ပ်ိဳးပင္၏ အေပၚပိုင္းကို ျဖတ္ျပီးမွ ေကာက္စိုက္ပါ";
		
		JTextArea prevention=new JTextArea(str);
		prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		prevention.setBackground(Color.decode("#006400"));
		prevention.setForeground(Color.WHITE);
		prevention.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(prevention);
		
		buttomPanel.add(scrollPane,BorderLayout.CENTER);
		

		
		JPanel buttonPanel1=new JPanel();
		JButton btnExit1=new JButton("ေရွ႕သို႕သြားရန္");
		btnExit1.addActionListener(this);
		buttonPanel1.add(btnExit1);
		buttonPanel1.setBackground(Color.decode("#008000"));
		btnExit1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		
		add(topPanel,BorderLayout.NORTH);
		add(buttomPanel,BorderLayout.CENTER);
		add(buttonPanel1,BorderLayout.SOUTH);
		//add(b);
		//setSize(1200, 950);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public static void main(String args[]) {

		new padding4Output3();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}