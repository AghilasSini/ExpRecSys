package stage1;

import java.awt.BorderLayout;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final JButton audio = new JButton("audio");
	final JButton text = new JButton("text");
	public Fenetre()
	{
		this.setTitle("Espace de l'experimentateur");
		this.setSize(700,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		JLabel label = new JLabel("Voulez vous choisir d'enregistrer une donnée texte ou une donnée audio?");
		
		pan.add(label, BorderLayout.NORTH);
		audio.setBounds(20, 200, 100, 30);
		text.setBounds(200, 200, 100, 30);
		
		audio.addActionListener(new ActionListener(){
	        public void actionPerformed(
                    ActionEvent e){
	        	Object source = e.getSource();
	        	if (source == audio) {
	        		AbstractModel m = new ConcreteModel(); 
	        		AbstractControler controler = new ConcreteControler(m);
	        		AudioRecorder audioRecorder = new AudioRecorder(controler);
	        		m.addObserver(audioRecorder);
	        	}    
	        }
		});
		text.addActionListener(new ActionListener() {
			public void actionPerformed(
					ActionEvent e) {
				Object source = e.getSource();
				if (source == text) {
					AbstractModel m = new ConcreteModel(); 
					AbstractControler controler = new ConcreteControler(m);
				    TestSaisieTexte t = new TestSaisieTexte(controler);
				    m.addObserver(t);
				}
			}
		});
		
		pan.add(audio);
		pan.add(text);
		
		getContentPane().add(pan);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fenetre();
	}
	
	
}

