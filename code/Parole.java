package stage1;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Parole extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String str;
	
	public Parole(String str)
	{
		this.setTitle("Recording  Result");
		this.setSize(300,120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		this.setContentPane(pan);
		
		JLabel label = new JLabel(str);
		pan.add(label,BorderLayout.NORTH);
		this.setVisible(true);
		
	}
	
	
}
