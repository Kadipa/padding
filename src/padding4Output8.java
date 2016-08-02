import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output8 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output8() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_black_bug1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_black_bug2.jpg")
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
		
		
		String str="စပါးအနက္ေရာင္ဂ်ပိုး(Rice Black Bug)\n\n"+
	"က်ေရာက္သည့္အခ်ိန္ \t- စပါးပင္သက္တမ္းတေလ်ာက္ က်ေရာင္နို္င္သည္\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ\t -  စပါးအလယ္အူတိုင္ပုပ္သည္\n\n"+
			"\t\t-အဆံမပါေသာ အနွံမ်ားျဖစ္တတ္သည္\n\n"+
		           "\t\t- က်ေရာက္မွဳျပင္းထန္လ်ွင္ မီးေလာင္ထားသကဲ့သို႔ေတြ႕ရတတ္သည္\n\n"+
	"ပံုသဏၰာန္ \t\t- အနက္ေရာင္ေတာက္ေျပာင္သည္\n\n"+
		"\t\t-ေန႕ဖက္တြင္ ပင္ေျခစုပ္စားျပီး ညဖက္တြင္ အပင္ေပၚသို႔ တက္ကာ စုပ္စားသည္\n\n"+
	
	"ကာကြယ္နွိမ္နင္းနည္း\t- အပင္က်ဲက်ဲစိုက္ပါ\n\n"+
			"\t\t- စိုက္ခ်ိန္တူညီပါ\n\n"+
			"\t\t-စပါးစိုက္ခ်ိန္တြင္ က်ေရာက္ပါက ဘဲလႊတ္ေက်ာင္းပါ\n\n"+
			"\t\t- ေပါင္းမ်ားကို ႏွိမ္းနင္းပါ\n\n"+
			"\t\t-ညဖက္တြင္ မီးထြန္းေထာင္ေျခာက္သံုးျပီး နွိမ္နင္းပါ\n\n"+
			"\t\t- ပိုးသတ္ေဆးမ်ားကို မလႊဲမသာမွ သံုးပါ";
		
		JTextArea prevention=new JTextArea(str);
		prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		prevention.setEditable(false);
		prevention.setBackground(Color.decode("#006400"));
		prevention.setForeground(Color.WHITE);
		JScrollPane scrollPane=new JScrollPane(prevention);
		
		buttomPanel.add(scrollPane,BorderLayout.CENTER);
		
//		၁။ေက်ာက္ဆူးပိုး(Rice Hispa)
//		က်ေရာက္သည့္အခ်ိန္-စပါးပ်ိုဳးခင္းနွင့္ စိုက္ခင္းအပင္ပြားခ်ိန္ထိ
//		
//		ဖ်က္ဆီးပံု လကၡဏာ -စပါးပိုးေလာင္မီး အနက္ေရာင္ေက်ာက္စူးပိုးမ်ားသည္ စပါးရြက္၏    အစိမ္းေရာင္ကို ျခစ္စားသည္
//				-စပါးရြက္သည္ အျဖဴေရာင္ အေမွးပါးသာ က်န္ရစ္သည္ 
//
//		ပံုသဏၰာန္ -နက္ျပာေရာင္ရွိုျပီး အေတာင္မာေပၚတြင္ ဆူးမ်ားပါသည္
//			
//
//		ကာကြယ္နွိမ္နင္းနည္း -ေပါင္းျမက္မ်ားကို ရွင္းလင္းပါ
//				-ပိုးသတ္ေဆးကို နည္းနည္းျဖင့္ ထိေရာက္ေအာင္သံုးပါ
//				-ပုိးေကာင္အေရအတြက္မ်ားပါက ထိေသ၊စားေသ ေဆး တစ္မ်ိဳးမ်ိဳး သံုးနိုင္သည္
//				-ေဆးဖ်န္းပါက တစ္ကြင္းလံုးကို မဖ်န္းဘဲ ပိုးမ်ားသည့္ ေနရာမ်ားကို ကြက္ျပီး ေဆးဖ်န္းပါ
//				-အပင္က်ဲက်ဲ စို္က္ပါ
//				-ပိုးသတ္ေဆး တစ္မ်ိဳးနွင့္တစ္မ်ိဳး ေရာေနွာျပီး မသံုးရပါ

		
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

		new padding4Output8();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}