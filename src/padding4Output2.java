import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output2 extends JFrame implements ActionListener {
	JButton b,buttonPanel,btnExit;
	JLabel label1, label2;

	padding4Output2() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/case_worm.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/case_worm2.jpg")
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
		
		
		String str="ရြက္လိပ္အိမ္ပိုး (caseworm)\n\n"+
	"က်ေရာက္သည့္အခ်ိန္ -\tစပါးပ်ိုဳးခင္းနွင့္ စိုက္ခင္းအပင္ပြားခ်ိန္ထိ\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ -\tစပါးရြက္မ်ားကို ကိုက္ျဖတ္လ်က္ အရြက္လိပ္မ်ား ျပဳလုပ္ျပီး အတြင္းတြင္ ေနကာ စပါးရြက္မ်ား၏ အစိမ္းေရာင္ ကို ျခစ္စားသည္`\n\n"+

	
	"ပံုသဏၰာန္ -\t\tအေတာင္ပံအျဖဴေရာင္ေပၚတြင္ အညိဳေဖ်ာ့နွင့္ အနက္ေရာင္ အေျပာက္မ်ား ပါသည္\n\n"+
	
	
	"ကာကြယ္နွိမ္နင္းနည္း -\tေပါင္းျမက္မ်ားကို ရွင္းလင္းပါ\n\n"+
			"\t\t-ုေရထုတ္ေပါက္တြင္ ဆန္ခါခံျပီး ေရကို ေျပာင္စင္ေအာင္ ထုတ္ပါ";
		
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
	//	setSize(1200, 950);
		//setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}

	public static void main(String args[]) {

		new padding4Output2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}