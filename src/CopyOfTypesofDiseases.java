import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jpl.Atom;
import jpl.Query;
import jpl.Term;
import jpl.Variable;

public class CopyOfTypesofDiseases extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel diseaseImage;
	private JLabel question;
	private JButton btnYes;
	private JButton btnNo;
	private Query query;
	private String[] diseases={"common_barnyard_grass","chinese_sprangle_top",
			"southern_cutgrass","greater_club_rush","less_fimbristylis"};
	private int diseaseIndex = 0;
	private int resIndex = 0;
	private int flag = 0;
	private int noFlag = 0;
	private String[] dis_all;
	
	private JPanel panel;
	private JPanel panel2;
	private JPanel imagePanel;
	
	private String[][] symptoms={{"rice_dwarf_virus","rice_stripe_virus","rice_blast"},
			{"rice_yellow_dwarf","bacterial_leaf_blight"},
			{"brown_spot","rice_yellow_dwarf"},
			{"dark_headed_rice_borer"},{"rice_root_knot_nematode","rice_tungro_associated_virus"}};
	
	private int index=0;

	public CopyOfTypesofDiseases() {
		setLayout(new BorderLayout());
		setBackground(Color.decode("#006400"));

		query = new Query("consult", new Term[] { new Atom("Crop_Expert.pl") });
		if (query.hasSolution()) {
			query.close();
			/*Variable Weed = new Variable("Weed");
			query = new Query("weed", new Term[] { Weed });
			if (query.hasSolution()) {
				diseases = Utils.Hashtable2String(query.allSolutions(), "Weed");
			}*/
		}
		
		imagePanel=new JPanel();
		imagePanel.setLayout(new BorderLayout());
		imagePanel.setBackground(Color.decode("#006400"));

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.decode("#006400"));
		/*Variable DIS = new Variable("DIS");
		query = new Query("has", new Term[] { new Atom(diseases[diseaseIndex]),
				DIS });
		if (query.hasSolution()) {
			query.close();
			dis_all = Utils.Hashtable2String(query.allSolutions(), "DIS");
		}*/
		
		/*ImageIcon icon=new ImageIcon(new ImageIcon("diseases/"
				+ Utils.getImage(dis_all[resIndex])).getImage()
				.getScaledInstance(500, 500, Image.SCALE_SMOOTH));*/
		
		ImageIcon icon=new ImageIcon(new ImageIcon("diseases/"
				+ symptoms[diseaseIndex][index]+".jpg").getImage()
				.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
		
		diseaseImage = new JLabel(icon);
		imagePanel.add(diseaseImage,BorderLayout.CENTER);

		question = new JLabel(Utils.getMMStr(symptoms[diseaseIndex][index] )+ " ျဖစ္သလား");
		question.setHorizontalAlignment(JLabel.CENTER);
		question.setBackground(Color.decode("#006400"));
		question.setFont(new Font("Zawgyi-one", Font.BOLD, 25));
		question.setForeground(Color.white);
		panel.add(question,BorderLayout.NORTH);

		//add(panel);

		panel2 = new JPanel();
		panel2.setBackground(Color.decode("#006400"));
		
		btnYes = new JButton("ျဖစ္");
		btnYes.setFont(new Font("Zawgyi-one", Font.BOLD, 25));
		panel2.add(btnYes);
		btnYes.addActionListener(this);
		
		btnNo = new JButton("မျဖစ္");
		btnNo.setFont(new Font("Zawgyi-one", Font.BOLD, 25));
		panel2.add(btnNo);
		
		
		btnNo.addActionListener(this);
		
		imagePanel.add(panel2,BorderLayout.SOUTH);
		
		add(panel,BorderLayout.NORTH);
		add(imagePanel,BorderLayout.CENTER);
		//add(panel2,BorderLayout.SOUTH);
		setVisible(true);
		setSize(getMaximumSize());
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent){
		
		if (actionEvent.getSource()==btnYes){
			index++;
			
			if (index<symptoms[diseaseIndex].length){
				remove(panel);
				remove(btnYes);
				remove(btnNo);
				ImageIcon icon=new ImageIcon(new ImageIcon("diseases/"
						+ symptoms[diseaseIndex][index]+".jpg").getImage()
						.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
				System.out.println("diseases/"
						+ symptoms[diseaseIndex][index]+".jpg");
				diseaseImage.setIcon(icon);
				question.setText(Utils.getMMStr(symptoms[diseaseIndex][index]) + " ျဖစ္သလား");
				question.setFont(new Font("Zawgyi-one", Font.BOLD, 25));
				imagePanel.add(diseaseImage,BorderLayout.CENTER);
				panel.add(question,BorderLayout.NORTH);
				
				imagePanel.add(panel2,BorderLayout.SOUTH);
				add(panel,BorderLayout.NORTH);
				add(imagePanel,BorderLayout.CENTER);
				
				revalidate();
				repaint();
			}
			else{
				setVisible(false);
				new Result(diseases[diseaseIndex], new String[]{});
			}
		}
		else if (actionEvent.getSource()==btnNo){
			diseaseIndex++;
			if (diseaseIndex<diseases.length){
				index=0;
				remove(panel);
				remove(btnYes);
				remove(btnNo);
				
				ImageIcon icon=new ImageIcon(new ImageIcon("diseases/"
						+ symptoms[diseaseIndex][index]+".jpg").getImage()
						.getScaledInstance(500, 500, Image.SCALE_SMOOTH));
				diseaseImage.setIcon(icon);
				question.setText(Utils.getMMStr(symptoms[diseaseIndex][index]) + " ျဖစ္သလား");
				question.setFont(new Font("Zawgyi-one", Font.BOLD, 25));
				//panel.add(diseaseImage,BorderLayout.CENTER);
				imagePanel.add(diseaseImage,BorderLayout.CENTER);
				panel.add(question,BorderLayout.NORTH);
				
				imagePanel.add(panel2,BorderLayout.SOUTH);
				add(panel,BorderLayout.NORTH);
				add(imagePanel,BorderLayout.CENTER);
				
				revalidate();
				repaint();
			}
			else{
				setVisible(false);
				new Result("No Answer", new String[]{});
			}
		}
	}	
	public static void main(String[] args){
		new CopyOfTypesofDiseases();
	}

}
