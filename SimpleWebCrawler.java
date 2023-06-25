import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class SimpleWebCrawler {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/");
            URLConnection conn = url.openConnection();
            /*这里使用 URL 类和 URLConnection 类来访问网站，url 对象表示要访问的网址，conn 对象表示与该网址建立的连接。*/
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            /*这里使用 BufferedReader 类来读取连接的输出流，InputStreamReader 类将字节流转换成字符流，以便读取网页内容。*/
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}