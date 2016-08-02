import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output9 extends JFrame implements ActionListener {
	JButton b,btnBack;
	JLabel label1, label2;

	padding4Output9() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		//setLayout(new GridLayout(1,2));
		setLayout(new BorderLayout());
		
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new GridLayout(1,2));
		
		JPanel leftPanel=new JPanel();
		leftPanel.setLayout(new BorderLayout());
		
		JPanel leftTopPanel=new JPanel();
		leftTopPanel.setLayout(new BorderLayout());
		
		JPanel leftPhotoPanel=new JPanel();
		leftPhotoPanel.setLayout(new GridLayout(1,2));
		
		
		JLabel leftLabel1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_leaffolder1.jpg").getImage().getScaledInstance(250, 150, java.awt.Image.SCALE_SMOOTH)));
		leftPhotoPanel.add(leftLabel1);
		
		JLabel leftLabel3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_leaffolder2.gif")
		.getImage().getScaledInstance(250, 150, java.awt.Image.SCALE_SMOOTH)));
		leftPhotoPanel.add(leftLabel3);
		
		leftPhotoPanel.setBackground(Color.decode("#006400"));
		
		leftTopPanel.add(leftPhotoPanel,BorderLayout.CENTER);
		
		JPanel leftButtomPanel=new JPanel();
		leftButtomPanel.setLayout(new BorderLayout());
		
		JPanel buttonPanel1=new JPanel();
		JButton btnExit1=new JButton("ေရွ႕သို႕သြားရန္");
		btnExit1.addActionListener(this);
		buttonPanel1.add(btnExit1);
		buttonPanel1.setBackground(Color.decode("#008000"));
		btnExit1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		
		String leftStr="ရြက္ေခါက္ပိုး(Rice Leaffolder)\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ  -အရြက္မ်ားတြင္ အဖ်ားမွ အရင္းထိ အရြက္ေဘးနွစ္ဖက္ကို  \n\t\t  အတြင္းဘက္သို႔ ေခါက္ထားသည္\n\n"+
	"ကာကြယ္နွိမ္နင္းနည္း\t- ပုလဲေျမၾသဇာ တစ္မ်ိဳးတည္းမသံုးဘဲ တီစူပါနွင့္  \n\t\t  ပိုတက္ေျမၾသဇာမ်ားကိုလည္း မ်ွတစြာသံုးပါ\n\n"+
			"\t\t- အခင္းမ်ားအားလံုး ေနရာင္ျခည္ရရွိရန္ႏွင့္ ေရသြင္းေရထုတ္ေကာင္းရန္ ေဆာာင္ရြက္ပါ\n\n"+
			"\t\t-  (၄၅)ရက္အတြင္း က်ေရာက္ပါက ပိုးသတ္ေဆးမဖ်န္းရပါ\n\n"+
			"\t\t-ေဆးရြက္ၾကီးေဆးရည္၊ တမာပိုးသတ္ေဆး စသည့္ သဘာဝပိုးသတ္ေဆးမ်ားလည္း သံုးႏိုင္သည္\n\n\n\n\n\n\n";
		
		JTextArea leftPrevention=new JTextArea(leftStr);
		leftPrevention.setBackground(Color.decode("#006400"));
		leftPrevention.setForeground(Color.WHITE);
		leftPrevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		leftPrevention.setEditable(false);
		JScrollPane leftScrollPane=new JScrollPane(leftPrevention);
		
		leftButtomPanel.add(leftScrollPane,BorderLayout.CENTER);
		
		leftPanel.add(leftTopPanel,BorderLayout.NORTH);
		leftPanel.add(leftButtomPanel,BorderLayout.CENTER);
		
		
		//right panel
		JPanel rightPanel=new JPanel();
		rightPanel.setLayout(new BorderLayout());
		
		JPanel rightTopPanel=new JPanel();
		rightTopPanel.setLayout(new BorderLayout());
		
		JPanel rightPhotoPanel=new JPanel();
		rightPhotoPanel.setLayout(new GridLayout(1,2));
		
		
		JLabel rightLabel1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_black_bug1.jpg").getImage().getScaledInstance(250, 150, java.awt.Image.SCALE_SMOOTH)));
		rightPhotoPanel.add(rightLabel1);
		
		JLabel rightLabel3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_black_bug2.jpg")
		.getImage().getScaledInstance(250, 150, java.awt.Image.SCALE_SMOOTH)));
		rightPhotoPanel.add(rightLabel3);
		
		rightPhotoPanel.setBackground(Color.decode("#006400"));
		
		rightTopPanel.add(rightPhotoPanel,BorderLayout.CENTER);
		
		JPanel rightButtomPanel=new JPanel();
		rightButtomPanel.setLayout(new BorderLayout());
		
		String rightStr="စပါးအနက္ေရာင္ဂ်ပိုး(Rice Black Bug)\n\n"+
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
		
		JTextArea rightPrevention=new JTextArea(rightStr);
		rightPrevention.setBackground(Color.decode("#006400"));
		rightPrevention.setForeground(Color.WHITE);
		rightPrevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		rightPrevention.setEditable(false);
		JScrollPane rightScrollPane=new JScrollPane(rightPrevention);
		
		rightButtomPanel.add(rightScrollPane,BorderLayout.CENTER);
		
		rightPanel.add(rightTopPanel,BorderLayout.NORTH);
		rightPanel.add(rightButtomPanel,BorderLayout.CENTER);
		
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.decode("#006400"));
		btnBack=new JButton("ေရွ႕သို႕သြားရန္");
		btnBack.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		add(mainPanel,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		/*b = new JButton("á€±á€›á€½á‚•á€žá€­á€¯á‚”á€»á€•á€”á€¹á€žá€¼á€¬á€¸á€›á€”á€¹");
		b.setBounds(500, 500, 200, 40);
		b.addActionListener(this);
		//add(b);
		setSize(1200, 950);
		setVisible(true);*/
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

	public static void main(String args[]) {

		new padding4Output9();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}