package miniscraper;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mark
 */
public class Numbers extends JPanel{
    JLabel number;
    JTextArea numberText;
    
    public Numbers() {
        number = new JLabel("Numbers");
        numberText = new JTextArea(15,15);
        setLayout(new BorderLayout());
        add(number, BorderLayout.NORTH);
        add(numberText, BorderLayout.SOUTH);
    }
}
