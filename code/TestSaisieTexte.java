package stage1;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Enumeration;

//import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TestSaisieTexte extends JFrame implements Observer {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected AbstractControler controler;
	protected String p1;
	protected String p2;
	protected String p3;
	protected String p4;
	protected String p5;
	protected String p6;
	protected String p7;
	protected String p8;
	protected String p9;
	
	protected JRadioButton r1=new JRadioButton("phrase1");    
    protected JRadioButton r2=new JRadioButton("phrase2");    
    protected JRadioButton r3=new JRadioButton("phrase3");
    protected JRadioButton r4=new JRadioButton("phrase4");
    protected JRadioButton r5=new JRadioButton("phrase5");
    protected JRadioButton r6=new JRadioButton("phrase6");
    protected JRadioButton r7=new JRadioButton("phrase7");
    protected JRadioButton r8=new JRadioButton("phrase8");
    protected JRadioButton r9=new JRadioButton("phrase9");
     
	public TestSaisieTexte(AbstractControler controler) {
			this.controler = controler;
			SaisieTexte s = new SaisieTexte();
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	                    ex.printStackTrace();
	                }

	                JFrame frame = new JFrame("Testing");
	               
	                JButton valider = new JButton("valider");
	            	JButton modifier = new JButton("modifier");
	                
	                r1.setBounds(10,205,100,15);
	                r2.setBounds(10,235,100,15); 
	                r3.setBounds(10,265,100,15);    
	                r4.setBounds(10,295,100,15);    
	                r5.setBounds(10,325,100,15);    
	                r6.setBounds(10,355,100,15);    
	                r7.setBounds(10,385,100,15);    
	                r8.setBounds(10,415,100,15);    
	                r9.setBounds(10,445,100,15);    
	                valider.setBounds(60,500,100,20);
	                modifier.setBounds(220,500,100,20);
	                
	                valider.addActionListener(new ActionListener(){
	        	        public void actionPerformed(
	                            ActionEvent e){
	        	        	Object source = e.getSource();
	        	        	if (source == valider) {
	        	        	    controler.setp(s.phrase1.getText(), s.phrase2.getText(), s.phrase3.getText(), s.phrase4.getText(), s.phrase5.getText(), s.phrase6.getText(), s.phrase7.getText(), s.phrase8.getText(), s.phrase9.getText());
	        	        	}    
	        	        }
	        		});
	                ButtonGroup bg=new ButtonGroup();
	                
	                modifier.addActionListener(new ActionListener() {
	                	public void actionPerformed(
	                			ActionEvent e) {
	                		Object source = e.getSource();
	                		if (source == modifier) {
	                			 
	                			/* ArrayList<AbstractButton> buttonsSelected = new ArrayList<AbstractButton>();
	                			 String t[] = {controler.p1,controler.p2,controler.p3,controler.p4,controler.p5,controler.p6,controler.p7,controler.p8,controler.p9}; 
	                			 String phr[] = {s.phrase1.getText(), s.phrase2.getText(), s.phrase3.getText(), s.phrase4.getText(), s.phrase5.getText(), s.phrase6.getText(), s.phrase7.getText(), s.phrase8.getText(), s.phrase9.getText()} ;  
	                			 
	                			 for ( Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();)
	                			 {
	                				 AbstractButton button = buttons.nextElement();
	                				 if (button.isSelected()) 
	                					 button.getText();
	                					 buttonsSelected.add(button);
	                			 }
	                			 
	                			 for (AbstractButton b: buttonsSelected)
	                			 {
	                				 int i = buttonsSelected.indexOf(b);
	                				 t[i] = phr[i];
	                				 //controler.setpi(phr[i], i);*/
	                			  controler.setp(s.phrase1.getText(), s.phrase2.getText(), s.phrase3.getText(), s.phrase4.getText(), s.phrase5.getText(), s.phrase6.getText(), s.phrase7.getText(), s.phrase8.getText(), s.phrase9.getText());
	                			  System.out.println("modification faite");
	                		    }
	                	}
	                });
	                         
	                   
	                bg.add(r1);
	                bg.add(r2);    
	                bg.add(r3);
	                bg.add(r4);
	                bg.add(r5);
	                bg.add(r6);
	                bg.add(r7);
	                bg.add(r8);
	                bg.add(r9);
	                
	                frame.add(r1);
	                frame.add(r2);      
	                frame.add(r3);
	                frame.add(r4);
	                frame.add(r5);
	                frame.add(r6);
	                frame.add(r7);
	                frame.add(r8);
	                frame.add(r9);
	                frame.add(valider);
	                frame.add(modifier);
	                
	                frame.add(s);
	                frame.pack();
	                frame.setSize(700,700);
	                frame.setLocationRelativeTo(null);
	                setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	                frame.setVisible(true);
	                //frame.dispose();
	            }
	        });

}
	 public static void main(String[] args) {
		    AbstractModel m = new ConcreteModel(); 
			AbstractControler controler = new ConcreteControler(m);
		    TestSaisieTexte t = new TestSaisieTexte(controler);
		    m.addObserver(t);
	    }
	 
	 public void update()
	 { 
	 	p1 = (String) null;
	 }


}
