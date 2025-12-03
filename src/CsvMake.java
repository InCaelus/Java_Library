import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

public class CsvMake{

    private static final String FILE_NAME = "library.csv";

    public static void main(String[] args) {

        BookList bookList = new BookList();

        
        TreeMap<String, ArrayList<Object>> map = bookList.getbookMap();

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            writer.write("ISBN,CallNumber,Title,Author,Trait\n");

            for (String isbn : map.keySet()) {
                ArrayList<Object> info = map.get(isbn);

                String callNumber = (String) info.get(0);
                String title = (String) info.get(1);
                String author = (String) info.get(2);
                String trait = info.get(3).toString();

                writer.write(isbn + "," + callNumber + "," +
                        title + "," + author + "," + trait + "\n");
            }

            System.out.println("CSV 파일 생성 완료: " + FILE_NAME);

        } catch (IOException e) {
            System.out.println("Error 명시: " + e.getMessage());
        }
    }
}
