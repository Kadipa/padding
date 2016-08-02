import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output4 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output4() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_ear_bug1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_ear_bug2.jpg")
		.getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label3);
		
		photoPanel.setBackground(Color.decode("#006400"));
		
		topPanel.add(photoPanel,BorderLayout.CENTER);
		
		JPanel buttomPanel=new JPanel();
		buttomPanel.setLayout(new BorderLayout());
		
		JPanel buttonPanel=new JPanel();
		JButton btnExit=new JButton("ေရွ႕သို႕သြားရန္");
		btnExit.addActionListener(this);
		buttonPanel.add(btnExit);
		btnExit.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		
		
		String str="စပါးနွ့ံစုပ္ ဂ်ပိုး(rice ear bug)\n\n"+
	"က်ေရာက္သည့္အခ်ိန္-\tစပါးနွံ နို႔ရည္ တည္စအခ်ိန္\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ -\tနံနက္ေစာေစာနွင့္ ညေနပုိင္းတြင္ စပါးအေစ့အတြင္း အစာမ်ားကို စုပ္စားသည္\n\n"+
	"ပံုသဏၰာန္ -\t\t ေသးသြယ္ေသာ ေျခေထာက္မ်ားနွင့္ ဦးမွင္မွာ ရွည္လ်ားသည္\n\n"+
		"\t\t-စိမ္းညိဳေရာင္ရွိသည္\n\n"+

	"ကာကြယ္နွိမ္နင္းနည္း - \tေပါင္းျမက္မ်ားကို မီးရွိဳ့ပါ\n\n"+
			"\t\t-ထိေသပိုးသတ္ေဆးျဖင့္ ပိုးက်ေသာအခင္းကို ကြက္ျပီး ဖ်န္းပါ\n\n"+
			"\t\t-ပိုးသတ္ေဆးမ်ား ေပါင္းစပ္ေရာေနွာျပီး မသံုးရ";
		
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
		add(buttonPanel1,BorderLayout.SOUTH);		//add(b);
		//setSize(1200, 950);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public static void main(String args[]) {

		new padding4Output4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}