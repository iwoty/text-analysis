
public class WordIterator implements Iterator {

    private int index;
    private FileContent fileContent;

    public WordIterator(FileContent fileContent) {
        this.fileContent = fileContent;
        index = 0;
    }

    public boolean hasNext() {
        if (index < this.fileContent.getWholeString().length()) {
            return true;
        } else {
            return false;
        }
    }
}
