//package fireDrillOne;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class WebScraper {
//    public static void main(String[] args) {
//        // https: / www.google.com/welcome.html?name=john&age=11
//        //scheme -> https
//        //domain name -> www.google.com
//        //path -> / welcome,html?name= john&age =11
//        try {
//            String location = "https: //www.google.com";
//            URL url = new URL(location);
//            InputStream inputStream = url.openStream();
//            byte[] bytes = inputStream.readAllBytes();
//
//            for (byte data: byte);
//            System.out.println(Character.toString(data));
//
//        } catch (MalformedURLException ex)  {
//            throw new RuntimeException(ex);
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//
//    }
//}
