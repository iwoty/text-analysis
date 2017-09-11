
public class StatisticalAnalysis {

    private Iterator<String> iterator;

    public StatisticalAnalysis(Iterator<String> iterator) {
        this.iterator = iterator;
    }

    public int countOf(Iterator<String> iterator) {
        return iterator.fileContent.getWholeString().length();
    }
    // TODO:
    // public int countOf(String... elems) {
    //     return xxxxxx;
    // }
    //
    // public int dictionarySize() {
    //     return xxx;
    // }
    //
    // public int size() {
    //     return xxx;
    // }
    //
    // public Set<String> occurMoreThan(Integer) {
    //     return setXxxx;
    // }
}
