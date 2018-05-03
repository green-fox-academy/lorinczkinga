public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        String urlVersion1 = new StringBuilder(url).insert(url.indexOf('/'), ":").toString();
        String urlVersion2 = url.substring(0, url.indexOf('/')) + ":" + url.substring(url.indexOf('/'), url.length());
        System.out.println(urlVersion1);
        System.out.println(urlVersion2);
    }
}

