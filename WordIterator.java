
import java.util.Iterator;
import java.util.ArrayList;

public class WordIterator implements Iterator<String> {
    ArrayList<String> wordList;
    int index = 0;

    public WordIterator(FileContent fileContent) {
        wordList = new ArrayList<>(fileContent.getContent());
    }

    public boolean hasNext() {
        while(index < wordList.size()) {
            return true;
        }
        index = 0;
        return false;
    }

    public String next() {
        if (hasNext()) {
            return wordList.get(index++);
        }
        return null;
    }
}
