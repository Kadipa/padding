import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output7 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output7() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_leaffolder1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_leaffolder2.gif")
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
		
		
		String str="ရြက္ေခါက္ပိုး(Rice Leaffolder)\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ  \t-အရြက္မ်ားတြင္ အဖ်ားမွ အရင္းထိ အရြက္ေဘးနွစ္ဖက္ကို အတြင္းဘက္သို႔ ေခါက္ထားသည္\n\n"+
	"ကာကြယ္နွိမ္နင္းနည္း\t- ပုလဲေျမၾသဇာ တစ္မ်ိဳးတည္းမသံုးဘဲ တီစူပါနွင့္ ပိုတက္ေျမၾသဇာမ်ားကိုလည္း မ်ွတစြာသံုးပါ\n\n"+
			"\t\t- အခင္းမ်ားအားလံုး ေနရာင္ျခည္ရရွိရန္ႏွင့္ ေရသြင္းေရထုတ္ေကာင္းရန္ ေဆာာင္ရြက္ပါ\n\n"+
			"\t\t-  (၄၅)ရက္အတြင္း က်ေရာက္ပါက ပိုးသတ္ေဆးမဖ်န္းရပါ\n\n"+
			"\t\t-ေဆးရြက္ၾကီးေဆးရည္၊ တမာပိုးသတ္ေဆး စသည့္ သဘာဝပိုးသတ္ေဆးမ်ားလည္း သံုးႏိုင္သည္";
		
		JTextArea prevention=new JTextArea(str);
		prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		prevention.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(prevention);
		prevention.setBackground(Color.decode("#006400"));
		prevention.setForeground(Color.WHITE);
		
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

		new padding4Output7();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}