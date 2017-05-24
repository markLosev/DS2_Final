package miniscraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; 

/**
 *
 * @author Mark
 */
public class ScraperLogic {
    Document doc;
    String html;
    String url;
    Pattern numberPattern = Pattern.compile("[1-9]\\d*(\\.\\d+)?");
    Pattern wordPattern = Pattern.compile("[A-Z][a-z]+");
    ArrayList<String> numbers;
    ArrayList<String> words;
    
    public ScraperLogic() {
        numbers = new ArrayList<>();
        words = new ArrayList<>();
    }
    
    public void scrapeURL() throws IOException {
        doc = Jsoup.connect("https://www.touro.edu/").get();
        url = "https://www.touro.edu/";
        getWebContent();
        findMatches();
    }
    
    public void getWebContent() {
        html = doc.html();
    }
    
    public void findMatches() {
        Matcher matcher = wordPattern.matcher(html);
        while(matcher.find()) {
            words.add(matcher.group());
        }
        matcher = numberPattern.matcher(html);
        while(matcher.find()) {
            numbers.add(matcher.group());
        }
    }
}
