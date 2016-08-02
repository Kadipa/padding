import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Result extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8226446501036711651L;

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public Result(String cause,String[] solutions){
		
		JPanel mainPanel=new JPanel();
		setLayout(new GridLayout(2,1));
		
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.decode("#006400"));
		topPanel.setLayout(new BorderLayout());
		
		String str="";
		if (cause.equals("No Answer")){
			str="မရွိပါ";
		}
		else{
			str="<html>ျဖစ္ရျခင္းအေၾကာင္း : <font size='18'><i>"+Utils.getMMStr(cause)+"</i></font></html>";
		}
		
		JLabel caseLabel=new JLabel(str);
		caseLabel.setForeground(Color.white);
		caseLabel.setHorizontalAlignment(JLabel.CENTER);
		caseLabel.setFont(new java.awt.Font("Zawgyi-One", 0, 14));
		topPanel.add(caseLabel,BorderLayout.NORTH);
		
		if (!str.equals("မရွိပါ")){
			JPanel photoPanel=new JPanel();
			photoPanel.setBackground(Color.decode("#006400"));
			photoPanel.setLayout(new GridLayout(1,2));
			
			ImageIcon image1=new ImageIcon(((new ImageIcon("diseases/rice_dwarf_virus.jpg")).getImage())
					.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH));
			
			JLabel label1=new JLabel(image1);
			photoPanel.add(label1);
			
			/*JLabel label2=new JLabel(new ImageIcon("diseases/rice_stripe_virus.jpg"));
			photoPanel.add(label2);*/
			
			ImageIcon image2=new ImageIcon(((new ImageIcon("diseases/rice_blast.jpg")).getImage())
					.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH));
			
			JLabel label3=new JLabel(image2);
			photoPanel.add(label3);
			
			topPanel.add(photoPanel,BorderLayout.CENTER);
		}
		
		
		//add(topPanel);
		
		/*JPanel panel=new JPanel();
		
		JComboBox comboBox=new JComboBox();
		comboBox.setFont(new java.awt.Font("Zawgyi-One", 0,14));
		comboBox.addItem("သဘာဝကာကြယ္နည္း");
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent event) {
				// TODO Auto-generated method stub
				System.out.println(event.getSource());
				
			}
		});
		panel.add(comboBox);
		topPanel.add(panel,BorderLayout.SOUTH);*/
		add(topPanel);
		
		JPanel buttomPanel=new JPanel();
		buttomPanel.setBackground(Color.decode("#006400"));
		buttomPanel.setLayout(new BorderLayout());
		
		JLabel solutionLabel=new JLabel("*ေျဖရွင္းနည္းမ်ား*");
		solutionLabel.setForeground(Color.white);
		solutionLabel.setFont(new java.awt.Font("Zawgyi-One", 0, 18));
		buttomPanel.add(solutionLabel,BorderLayout.NORTH);
		
		String preventionStr="";
		
		if (!str.equals("မရွိပါ")){
			
			
			for (String solution:Utils.solutionsMM){
				preventionStr+="- "+solution+"\n";
			}
			
			JTextArea prevention=new JTextArea(preventionStr);
			prevention.setFont(new java.awt.Font("Zawgyi-One", 0, 16));
			prevention.setEditable(false);
			
			JScrollPane scrollPane=new JScrollPane(prevention);
			buttomPanel.add(scrollPane,BorderLayout.CENTER);
		}
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setBackground(Color.decode("#006400"));
		
		JButton button=new JButton("ထြက္ရန္");
		button.setFont(new java.awt.Font("Zawgyi-One", 0, 18));
		buttonPanel.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JButton btnBack=new JButton("ေရွ႕သို႕သြားရန္");
		btnBack.setFont(new java.awt.Font("Zawgyi-One", 0, 18));
		buttonPanel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new secondMainFrame();
			}
		});
		
		buttomPanel.add(buttonPanel,BorderLayout.SOUTH);
		add(buttomPanel);
		
		setVisible(true);
		setSize(getMaximumSize());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
