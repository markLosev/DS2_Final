package miniscraper;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author Mark
 */
public class URL extends JPanel{
    JLabel URL;
    JTextPane URLText;
    
    public URL() {
        URL = new JLabel("URL");
        URLText = new JTextPane();
        URLText.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(new BorderLayout());
        add(URL, BorderLayout.WEST);
        add(URLText, BorderLayout.CENTER);
    }
}
