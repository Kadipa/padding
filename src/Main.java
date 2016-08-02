import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4648172894076113183L;

	public Main(){
		setContentPane(new JLabel(new ImageIcon(new ImageIcon("title_main.jpg").getImage()
				.getScaledInstance(1300, 760, Image.SCALE_SMOOTH))));

		setLayout(new BorderLayout());
		
		JButton button=new JButton(new ImageIcon("button.jpg"));
		button.setSize(1300, 250);
		button.setBorderPainted(false);
		button.setBackground(Color.decode("#006400"));
		add(button,BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new secondMainFrame();
			}
		});
		
		setVisible(true);
		//setSize(getPreferredSize());
		//setSize(getMaximumSize());
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		// setSize(1280,960);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
