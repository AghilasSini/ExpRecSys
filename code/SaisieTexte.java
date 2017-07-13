package stage1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaisieTexte extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected JTextField phrase1 = new JTextField(20);
	protected JTextField phrase2 = new JTextField(20);
	protected JTextField phrase3 = new JTextField(20);
	protected JTextField phrase4 = new JTextField(20);
	protected JTextField phrase5 = new JTextField(20);
	protected JTextField phrase6 = new JTextField(20);
	protected JTextField phrase7 = new JTextField(20);
	protected JTextField phrase8 = new JTextField(20);
	protected JTextField phrase9 = new JTextField(20);
	
    public SaisieTexte()
    {
    	setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("1:"), gbc);
        gbc.gridx++;
        add(phrase1, gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("2:"), gbc);
        gbc.gridx++;
        add(phrase2,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("3:"), gbc);
        gbc.gridx++;
        add(phrase3,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("4:"), gbc);
        gbc.gridx++;
        add(phrase4,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("5:"), gbc);
        gbc.gridx++;
        add(phrase5,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("6:"), gbc);
        gbc.gridx++;
        add(phrase6,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("7:"), gbc);
        gbc.gridx++;
        add(phrase7,gbc);
        
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("8:"), gbc);
        gbc.gridx++;
        add(phrase8,gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        add(new JLabel("9:"), gbc);
        gbc.gridx++;
        add(phrase9,gbc);
    	}
    
    
}
