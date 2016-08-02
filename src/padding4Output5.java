import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output5 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output5() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_ear_cutting_caterpillar1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_ear_cutting_caterpillar2.jpg")
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
		
		
		String str="နွံျဖတ္ပိုး(rice ear cutting caterpillar)\n\n"+
	
	"က်ေရာက္သည့္အခ်ိန္\t-အပင္ပြားစည္းခ်ိန္ေနာက္ပိုင္းမွ အနွံထြက္ခ်ိန္ထိ`\n\n"+	"ဖ်က္ဆီးပံု လကၡဏာ \t-ညအခ်ိန္ ပင္စည္ေပၚတက္ျပီး အနွံမ်ားကို ကိုက္ျဖတ္ေလ့ရွိသည္\n\n"+
			"\t\t-ေန့ခင္းတြင္ စပါးပင္ေျခနွင့္ ေျမၾကီးပက္ၾကားအက္မ်ားအတြင္း ခိုေအာင္းေနတတ္သည္\n\n"+
	"ပံုသဏၰာန္\t\t -နီညိဳေရာင္ေဖ်ာ့သည္\n\n"+
		"\t\t-ေရွ႕အေတာင္မ်ားတြင္ အေရာင္ေဖ်ာ့ျပီး ဝိုင္းစက္သည့္ အေျပာက္နွစ္ခုပါသည္\n\n"+
		"\t\t-ေအာက္ပိုင္းမွာ အျဖဴေရာင္ျဖစ္သည္\n\n"+
	"ကာကြယ္နွိမ္နင္းနည္း\t - ရိတ္သိမ္းခါနီးမွ ကပ္ျပီး ေရထုပ္ပါ\n\n"+
			"\t\t-ရိုးျပတ္မ်ားကို မိီးရွို႔ပါ\n\n"+
			"\t\t-ထိေသပိုးသတ္ေဆးျဖင့္ ပိုးက်ေသာအခင္းကို ကြက္ျပီး ဖ်န္းပါ\n\n"+
			"\t\t-ပိုးသတ္ေဆးမ်ား ေပါင္းစပ္ေရာေနွာျပီး မသံုးရ\n\n";
		
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

		new padding4Output5();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}