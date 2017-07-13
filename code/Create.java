package stage1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Create implements Observer{
	
	protected JPanel cards = new JPanel(new CardLayout());
	protected AbstractControler controler;
    
	
	 public Create(AbstractControler controler) {
	    	this.controler = controler;
	        JFrame f = new JFrame();
	        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        String t[] = {controler.p1,controler.p2,controler.p3,controler.p4,controler.p5,controler.p6,controler.p7,controler.p8,controler.p9};
	        
	        for (int i = 0; i < 9; i++) {
	            Phrasep p = new Phrasep((i+1)+"."+t[i]);
	            cards.add(p);
	        }
	        JPanel control = new JPanel();
	        control.add(new JButton(new AbstractAction("\u22b2Prev") {

	            /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
	            public void actionPerformed(ActionEvent e) {
	                CardLayout cl = (CardLayout) cards.getLayout();
	                cl.previous(cards);
	            }
	        }));
	        control.add(new JButton(new AbstractAction("Next\u22b3") {

	            /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
	            public void actionPerformed(ActionEvent e) {
	                CardLayout cl = (CardLayout) cards.getLayout();
	                cl.next(cards);
	            }
	        }));
	        f.add(cards, BorderLayout.CENTER);
	        f.add(control, BorderLayout.SOUTH);
	        f.pack();
	        f.setLocationRelativeTo(null);
	        f.setVisible(true);
	    }
	 
	 public static void main(String[] args) {
	       
	            	AbstractModel m = new ConcreteModel(); 
	            	AbstractControler controler = new ConcreteControler(m);
	            	controler.p1 = "m";
	            	controler.p2 = "m";
	            	 EventQueue.invokeLater(new Runnable() {

	                     @Override
	                     public void run() {
	                    	 Create create = new Create(controler);
	                    	 m.addObserver(create);
	                     }
	                 });    
	               
	            }
	       
	 public void update()
	 { 
	 	cards =  null;
	 }


}
