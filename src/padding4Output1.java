import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output1 extends JFrame implements ActionListener {
	JButton b,e;
	JLabel label1, label2;

	padding4Output1() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_hispa1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_hispa2.jpg")
		.getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label3);
		
	photoPanel.setBackground(Color.decode("#006400"));
		
		topPanel.add(photoPanel,BorderLayout.CENTER);
		
		JPanel buttomPanel=new JPanel();
		buttomPanel.setLayout(new BorderLayout());
		
		String str="ေက်ာက္ဆူးပိုး(Rice Hispa)\n\n"+"က်ေရာက္သည့္အခ်ိန္-\tစပါးပ်ိုဳးခင္းနွင့္ စိုက္ခင္းအပင္ပြားခ်ိန္ထိ \n\n"+
	
	"ဖ်က္ဆီးပံု လကၡဏာ -\tစပါးပိုးေလာင္မီး အနက္ေရာင္ေက်ာက္စူးပိုးမ်ားသည္ စပါးရြက္၏    အစိမ္းေရာင္ကို ျခစ္စားသည္ \n"+
			"\t\t-စပါးရြက္သည္ အျဖဴေရာင္ အေမွးပါးသာ က်န္ရစ္သည္ \n\n"+ 

	"ပံုသဏၰာန္ -\t\tနက္ျပာေရာင္ရွိုျပီး အေတာင္မာေပၚတြင္ ဆူးမ်ားပါသည္ \n\n"+
		
	"ကာကြယ္နွိမ္နင္းနည္း -\tေပါင္းျမက္မ်ားကို ရွင္းလင္းပါ \n\n"+
			"\t\t-ပိုးသတ္ေဆးကို နည္းနည္းျဖင့္ ထိေရာက္ေအာင္သံုးပါ \n\n"+
			"\t\t-ပုိးေကာင္အေရအတြက္မ်ားပါက ထိေသ၊စားေသ ေဆး တစ္မ်ိဳးမ်ိဳး သံုးနိုင္သည္ \n\n"+
			"\t\t-ေဆးဖ်န္းပါက တစ္ကြင္းလံုးကို မဖ်န္းဘဲ ပိုးမ်ားသည့္ ေနရာမ်ားကို ကြက္ျပီး ေဆးဖ်န္းပါ \n\n"+
			"\t\t-အပင္က်ဲက်ဲ စို္က္ပါ \n\n"+
			"\t\t-ပိုးသတ္ေဆး တစ္မ်ိဳးနွင့္တစ္မ်ိဳး ေရာေနွာျပီး မသံုးရပါ";
		
		JTextArea prevention=new JTextArea(str);
		prevention.setBackground(Color.decode("#006400"));
		prevention.setForeground(Color.WHITE);
		prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		prevention.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(prevention);
		
		buttomPanel.add(scrollPane,BorderLayout.CENTER);
		
		JPanel buttonPanel=new JPanel();
		JButton btnExit=new JButton("ေရွ႕သို႕သြားရန္");
		btnExit.addActionListener(this);
		buttonPanel.add(btnExit);
		buttonPanel.setBackground(Color.decode("#008000"));
		btnExit.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		
		add(topPanel,BorderLayout.NORTH);
		add(buttomPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		
		/*b = new JButton("ေရြးခ်ယ္သည္");
		b.setBounds(100, 680, 200, 50);
		b.addActionListener(this);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#008000"));
		b.setFont(new Font("Zawgyi-one", Font.BOLD, 18));

		e = new JButton("ထြက္ရန္");
		e.setBounds(700, 680, 200, 50);
		e.addActionListener(this);
		e.setForeground(Color.white);
		e.setBackground(Color.decode("#008000"));
		e.setFont(new Font("Zawgyi-one", Font.BOLD, 18));*/

		//add(b);
		//add(e);
		//setSize(1200, 950);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public static void main(String args[]) {

		new padding4Output1();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}