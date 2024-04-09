import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UrlShorter {

    private Map<String, String> linkMap = new HashMap<>();
    private String domain = "http://google.com/";

    public String shortedUrl(String longUrl) {
        String uniqueID = UUID.randomUUID().toString().substring(0, 8);
        String shotUrl = domain + uniqueID;
        linkMap.put(shotUrl, longUrl);
        return shotUrl;
    }

    public String getOriginalUrl(String shotUrl) {
        return linkMap.get(shotUrl);
    }

    public static void main(String[] args) {
        UrlShorter urlShorter = new UrlShorter();

        var longUrl = "example.com/very/long/url/that/we/need/to/short";
        var shortUrl = urlShorter.shortedUrl(longUrl);
        System.out.println("Short Url: " + shortUrl);

        var originalUr = urlShorter.getOriginalUrl(shortUrl);
        System.out.println("Original URL: " + originalUr);
    }

}