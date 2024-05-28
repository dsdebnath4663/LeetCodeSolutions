import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AmazonProductScraper {

    public static void main(String[] args) {
        String url = "https://www.amazon.in/Redmi-Power-Black-128GB-Storage/dp/B09Y64H8VS/ref=sr_1_4?qid=1679133649&s=electronics&sr=1-4";
        try {
            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0").get();
            String title = doc.select("#productTitle").text();
            String price = doc.select(".apexPriceToPay .a-offscreen").text();
            String rating = doc.select(".averageStarRating span").text();
            String reviews = doc.select("#acrCustomerReviewText").text();
            String availability = doc.select("#availability span").text();

            Elements details = doc.select("#feature-bullets ul li span");
            StringBuilder productDetails = new StringBuilder();
            for (Element detail : details) {
                productDetails.append(detail.text()).append("\n");
            }

            // Download the primary image
            String imageUrl = doc.select("#imgTagWrapperId img").attr("src");
            String imagePath = "";
//            if (!imageUrl.isEmpty()) {
                imagePath ="";// downloadImage(imageUrl);
//            } else {
//                System.err.println("Image URL is empty.");
//            }

            // Create an Excel file
            writeDataToExcel(title, price, rating, reviews, availability, productDetails.toString(), imagePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String downloadImage(String imageUrl) throws IOException {
        String fileName = "images/" + imageUrl.substring(imageUrl.lastIndexOf("/") + 1);
        try (InputStream in = new URL(imageUrl).openStream()) {
            Files.createDirectories(Paths.get("images"));
            Files.copy(in, Paths.get(fileName));
            System.out.println("Downloaded image to: " + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }

    private static void writeDataToExcel(String title, String price, String rating, String reviews,
                                         String availability, String details, String imagePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Product Data");

        String[] headers = {"Title", "Price", "Rating", "Reviews", "Availability", "Details", "Image Path"};
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
        }

        Row row = sheet.createRow(1);
        row.createCell(0).setCellValue(title);
        row.createCell(1).setCellValue(price);
        row.createCell(2).setCellValue(rating);
        row.createCell(3).setCellValue(reviews);
        row.createCell(4).setCellValue(availability);
        row.createCell(5).setCellValue(details);
        row.createCell(6).setCellValue(imagePath);

        try (FileOutputStream fileOut = new FileOutputStream("ProductData.xlsx")) {
            workbook.write(fileOut);
        }
        workbook.close();
    }
}
