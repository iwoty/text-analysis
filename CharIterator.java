
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

    private LinkedList<E> getList() {
        LinkedList<String> list = new LinkedList<Character>();
        for (int i=0; i<fileContent.getWholeString().length(); i++) {
            list.add(ileContent.getWholeString().substring(i, i+1));
        }
        return itemsList;
    }

    private LinkedList<E> getList() {
        return charList;
    }
}
