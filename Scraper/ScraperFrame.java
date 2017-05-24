package miniscraper;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Mark
 */
public class ScraperFrame extends JFrame {
    URL url;
    TextAreas textArea;
    ScraperLogic logic;
    
    public ScraperFrame() throws IOException {
        super("Mini Scraper");
        logic = new ScraperLogic();
        logic.scrapeURL();
        url = new URL();
        textArea = new TextAreas();       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        add(url, BorderLayout.NORTH);
        add(textArea, BorderLayout.SOUTH);
        setupWordAndNumbers();
        setVisible(true);
    }
    
    public static void main(String [] args) throws IOException {
        ScraperFrame frame = new ScraperFrame();
    }

    private void setupWordAndNumbers() {
        url.URLText.setText(logic.url);
        for (String number: logic.numbers) {
            textArea.a1.numberText.append(number + "\n");
        }
        for (String word: logic.words) {
            textArea.a2.properWordsText.append(word + "\n");
        }
        
    }
}
