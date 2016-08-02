import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class padding4Output6 extends JFrame implements ActionListener {
	JButton b;
	JLabel label1, label2;

	padding4Output6() {
		//JFrame test = new JFrame("Paddy Expert System");
		//getContentPane().setBackground(Color.decode("#a9f577"));
		
		setLayout(new BorderLayout());
		
		JPanel topPanel=new JPanel();
		topPanel.setLayout(new BorderLayout());
		
		JPanel photoPanel=new JPanel();
		photoPanel.setLayout(new GridLayout(1,2));
		
		JLabel label1=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_gallmidge1.jpg").getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH)));
		photoPanel.add(label1);
		
		JLabel label3=new JLabel(new ImageIcon(new ImageIcon("diseases/rice_gallmidge2.jpg")
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
		
		
		String str="ၾကက္သြန္ျမိတ္ပိုး(Rice Gallmidge)\n\n"+
	"က်ေရာက္သည့္အခ်ိန္\t - စပါးပ်ိဳးခင္းမွ အပင္ပြားစခ်ိန္ထိ\n\n"+
	"ဖ်က္ဆီးပံု လကၡဏာ \t- စပါးပင္မွာ (၉) ရက္မွ (၂၆) ရက္ထိ ၾကာေညာင္းသည္\n\n"+
	"ပံုသဏၰာန္\t\t - ဝါညိဳေရာင္ ခႏၶာကိုယ္ရွိသည္`\n\n"+		"\t\t- အထီးမွာ နီရဲေသာ ဝမ္းဗိုက္ရွိျပီး အမထက္ေသးငယ္သည္";
		
		JTextArea prevention=new JTextArea(str);
		prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
		prevention.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(prevention);
		prevention.setBackground(Color.decode("#006400"));
		prevention.setForeground(Color.WHITE);
		
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

		new padding4Output6();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		new padding4();

	}
}