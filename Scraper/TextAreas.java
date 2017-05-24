package miniscraper;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Mark
 */
public class TextAreas extends JPanel {
    ProperWords a2;
    Numbers a1;
    
    public TextAreas() {
        a1 = new Numbers();
        a2 = new ProperWords();
        setLayout(new BorderLayout());
        add(a1, BorderLayout.WEST);
        add(a2, BorderLayout.EAST);
    }
}
