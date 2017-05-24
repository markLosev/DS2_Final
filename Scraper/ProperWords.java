package miniscraper;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mark
 */
public class ProperWords extends JPanel {
    JLabel properWord;
    JTextArea properWordsText;
    
    public ProperWords() {
        properWord = new JLabel("Proper words");
        properWordsText = new JTextArea(15,15);
        setLayout(new BorderLayout());
        add(properWord, BorderLayout.NORTH);
        add(properWordsText, BorderLayout.SOUTH);
    }
    
}

