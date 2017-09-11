
public class StatisticalAnalysis {

    private Iterator<String> iterator;

    public StatisticalAnalysis(Iterator<String> iterator) {
        this.iterator = iterator;
    }

    public int countOf(Iterator<String> iterator) {
        return iterator.fileContent.getWholeString().length();
    }
}
