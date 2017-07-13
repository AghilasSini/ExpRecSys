package stage1;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Phrasep extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Random random = new Random();
    protected String name;
  
    
    public Phrasep(String name) {
        this.name = name;
        this.setPreferredSize(new Dimension(320, 240));
        this.setBackground(new Color(random.nextInt()));
        this.add(new JLabel(name));
    }

}
