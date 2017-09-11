
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
}
