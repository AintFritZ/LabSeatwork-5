import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class BookDA {
    private HashMap<String, Book> bookMap;
    public BookDA() throws FileNotFoundException {
        bookMap = new HashMap<>();
        Scanner file = new Scanner(new FileReader("C:\\Users\\neu\\IdeaProjects\\HashMapActivity\\src\\Book.csv"));

        while(file.hasNextLine()) {
            String rawFile = file.nextLine();
            String[] rawFileArray = rawFile.split(",");

            Book book = new Book();
            book.setIsbn(rawFileArray[0].trim());
            book.setTitle(rawFileArray[1].trim());

            bookMap.put(book.getIsbn(), book);
        }
    }
    public HashMap<String, Book> getBookMap(){
        return bookMap;
    }
}
