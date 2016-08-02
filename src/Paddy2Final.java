import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;


public class Paddy2Final extends JFrame implements ItemListener,ActionListener{
	
	private String[] itemStr={"-အပင္သက္တမ္း တစ္လအတြင္း ႏွိမ္နင္းရမည္။ \n\n\n-တစ္လခြဲထက္မရပါ။\n\n\n-ေပါင္းစီးပါက ၂၀%မွ ၁၀၀%ထိ ဆံုးရွဳံးနိုင္သည္။",
			"-အတန္းလိုက္စိုက္ျခင္း(သို႕မဟုတ္)တိုက္ရိုက္ မ်ိဳးေစ့ခ်ကိရိယာျဖင့္ မ်ိဳးေစ့ခ်ျခင္းမ်ားကို ျပဳလုပ္ရမည္။\n\n\n"
			+ "-ေပါင္းလိုက္ကိရိယာမသံုးမီ လယ္ထဲမွေရကို အေနေတာ္ျဖစ္ေအာင္ ထုတ္ေပးရမည္။",
			"-ေရကို ၂ လက္မမွ ၄လက္မခန္႔အထိ ထားေပးပါ။\n\n\n-ျမက္နွင့္ မုန္ညင္းအခ်ိဳ႕ကို မၾကီးထြားနိုင္ေအာင္ လယ္ကြင္းတြင္ ေရကို ၂ လက္မမွ ၄လက္မခန္႔အထိ ထားေပးပါ။",
			"-ေျမညီညာလ်ွင္ ေရအနိမ့္အျမင့္ ထိန္းထားျခင္းျဖင့္ ေပါင္းနွိမ္နင္းနိုင္သည္။\n\n\n-ေျမညီညာစြာ ျပဳျပင္ထားလ်ွင္ ေရသြင္းေရထုတ္ျဖင့္ အထြက္နွုန္းတိုးေစသည္။",
			"-ေဆးညႊန္းတိုင္းအတိုင္း တိက်စြာ သံုးပါ။\n\n\n-ေပါင္းသတ္ေဆးကို ေရစစ္ျဖင့္စစ္ျပီး ပံုးထဲသို႔ထည့္ပါ။\n\n\n"
			+ "-ပိုးသတ္ေဆးျဖန္းကို ေဆးျဖန္းေခါင္းျဖင့္ မျဖန္းပက္ရပါ။\n\n\n-ပိုးသတ္ေဆးကဲ့သို႕ လက္ကို ေဝွ႕ရမ္းျဖန္းပက္ျခင္း မျပဳရပါ။"};
	
	private String[] items={"လက္ျဖင့္ေပါင္းႏွိမ္နင္းျခင္း","ေပါင္းလိုက္ကိရိယာျဖင့္ ေပါင္းနွိမ္နင္းျခင္း",
			"ေရကို စနစ္တက်ထိန္းသိမ္းျခင္းျဖင့္ ေပါင္းနွိမ္နင္းျခင္း","ေျမညီညာေအာင္ ျပဳျပင္ျခင္းျဖင့္ ေပါင္းနွိမ္နင္းျခင္း",
			"ေပါင္းသတ္ေဆးျဖင့္ ေပါင္းနွိမ္နင္းျခင္း"};
	
	private JComboBox selectBox;
	private JTextArea solutions;
	private JButton e1;

	public Paddy2Final(){
		
		JPanel mainPanel=new JPanel();
		mainPanel.setLayout(new BorderLayout(2,1));
		
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.decode("#006400"));
		topPanel.setLayout(new BorderLayout());
		JLabel label=new JLabel("ေပါင္းႏွိမ္ႏွင္းနည္းကို ေရြးခ်ယ္ပါ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.white);
		label.setFont(new java.awt.Font("Zawgyi-One",0,50));
		
		JPanel selectPanel=new JPanel();
		selectPanel.setBackground(Color.decode("#006400"));
		selectBox=new JComboBox<>();
		selectBox.setFont(new java.awt.Font("Zawgyi-One",0,30));
		selectBox.addItem("လက္ျဖင့္ေပါင္းႏွိမ္နင္းျခင္း");
		selectBox.addItem("ေပါင္းလိုက္ကိရိယာျဖင့္ ေပါင္းနွိမ္နင္းျခင္း");
		selectBox.addItem("ေရကို စနစ္တက်ထိန္းသိမ္းျခင္းျဖင့္ ေပါင္းနွိမ္နင္းျခင္း");
		selectBox.addItem("ေျမညီညာေအာင္ ျပဳျပင္ျခင္းျဖင့္ ေပါင္းနွိမ္နင္းျခင္း");
		selectBox.addItem("ေပါင္းသတ္ေဆးျဖင့္ ေပါင္းနွိမ္နင္းျခင္း");
		
		selectBox.addItemListener(this);
		selectPanel.add(selectBox);
		
		topPanel.add(label,BorderLayout.NORTH);
		topPanel.add(selectPanel,BorderLayout.CENTER);
		
		solutions=new JTextArea(itemStr[0]);
		solutions.setForeground(Color.decode("#006400"));
		solutions.setFont(new java.awt.Font("Zawgyi-One", 0, 20));
		solutions.setEditable(false);
		JScrollPane scrollPane=new JScrollPane(solutions);
		solutions.setForeground(Color.white);
		solutions.setBackground(Color.decode("#008000"));
		
		mainPanel.add(topPanel,BorderLayout.NORTH);
		mainPanel.add(scrollPane,BorderLayout.CENTER);
		
		setContentPane(mainPanel);
		setVisible(true);
		setSize(getMaximumSize());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
JPanel p=new JPanel();

		e1 = new JButton("ေရွ႕သို႕သြားရန္");
		e1.setBounds(700, 700, 300, 50);
		e1.addActionListener(this);
		e1.setForeground(Color.white);
		e1.setBackground(Color.decode("#008000"));
		e1.setFont(new Font("Zawgyi-one", Font.BOLD, 18));
		p.add(e1);
		p.setBackground(Color.decode("#008000"));
		
		mainPanel.add(p,BorderLayout.SOUTH);
		
	}
	
	public static void main(String[] args){
		new Paddy2Final();
	}

	@Override
	public void itemStateChanged(ItemEvent itemEvent) {
		for (int i=0;i<items.length;i++){
			if (itemEvent.getItem().equals(items[i])){
				solutions.setText(itemStr[i]);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==e1){
			setVisible(false);
			new secondMainFrame();
		}
		
		
	}
}
