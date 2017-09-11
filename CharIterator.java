
import java.util.LinkedList;

public class CharIterator implements Iterator {

    private int index;
    private FileContent fileContent;
    private LinkedList<E> charList;

    public CharIterator(FileContent content) {
        this.fileContent = fileContent;
        charList = new LinkedList<>();
        index = 0;
    }

}
