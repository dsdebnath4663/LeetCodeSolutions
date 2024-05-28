import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ImageDownloader {

    public static void main(String[] args) {
        List<String> imageUrls = Arrays.asList(
                "https://m.media-amazon.com/images/I/81eM15lVcJL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/71AvQd3VzqL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/51UhwaQXCpL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/81I3w4J6yjL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/71V--WZVUIL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/81OZGH4fZiL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/51HBom8xz7L._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/61vtLhO6fDL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/61S9aVnRZDL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/81lnKynSaqL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/81IPrkMDqVL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/81UT07JsBqL._AC_UL800_.jpg",
                "https://m.media-amazon.com/images/I/71AvQd3VzqL._AC_UL800_.jpg"
        );

        String outputDir = "C:\\Users\\MSI 1\\Pictures\\mobiles"; // Directory to save images
        try {
            Files.createDirectories(Paths.get(outputDir)); // Create directory if it doesn't exist
            downloadImages(imageUrls, outputDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadImages(List<String> imageUrls, String outputDir) {
        imageUrls.forEach(url -> {
            try {
                downloadImage(url, outputDir);
            } catch (IOException e) {
                System.err.println("Error downloading image: " + url);
                e.printStackTrace();
            }
        });
    }

    private static void downloadImage(String imageUrl, String outputDir) throws IOException {
        URL url = new URL(imageUrl);
        String fileName = Paths.get(outputDir, getFileNameFromUrl(imageUrl)).toString();
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get(fileName));
            System.out.println("Downloaded: " + imageUrl + " to " + fileName);
        }
    }

    private static String getFileNameFromUrl(String url) {
        return url.substring(url.lastIndexOf('/') + 1, url.indexOf("._AC_UL800_")) + ".jpg";
    }
}
