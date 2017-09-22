
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class FileContent implements IterableText {
    ArrayList<String> content = new ArrayList<>();

    public ArrayList<String> getContent() {
        return content;
    }

    public Iterator<String> charIterator() {
        return new CharIterator(this);
    }

    public Iterator<String> wordIterator() {
        return new WordIterator(this);
    }

    public FileContent (String filename) {
        File file = new File(filename);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String word = reader.next();
                content.add(word.toLowerCase());

            }
        } catch (FileNotFoundException e) {
            System.out.println("Did not find file: " +filename);
        }
    }
}
