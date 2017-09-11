
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileContent implements IterableText {

    private String filename;
    private String fileContent;

    public FileContent(String filename) {
        this.filename = filename;
        this.fileContent = getFileContent(filename);
    }

    public static String getFileContent(String filename) {
        try {
            String fileContent = new Scanner(new File(filename)).useDelimiter("\\Z").next();
            return fileContent;
        } catch (FileNotFoundException e) {
            System.out.format("File %s not found\n", filename);
        }
        return null;
    }

    public Iterator<String> charIterator() {
        return new CharIterator(this);
    }

    public Iterator<String> wordIterator() {
        return new WordIterator(this);
    }

    public String getFilename() {
        return this.filename;
    }

    public String getWholeString() {
        return this.fileContent;
    }

    public static void main(String[] args) {
        FileContent chuj = new FileContent("test.txt");
    }
}
