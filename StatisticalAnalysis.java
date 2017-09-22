
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class StatisticalAnalysis {
    Iterator<String> iterator;
    public StatisticalAnalysis(Iterator<String> givenIterator) {
        iterator = givenIterator;
    }

    public int countOf(String... elems) {
        int counter = 0;
        int argumentsLength = elems.length;

        while (iterator.hasNext()) {
            String nextElem = iterator.next();

            for (int i=0; i < argumentsLength; i++) {
                if (nextElem.equals(elems[i])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public int dictionarySize() {
        int dicSize;
        ArrayList<String> uniqueWords = new ArrayList<>();

        while (iterator.hasNext()) {
            String nextElem = iterator.next();

            if (!uniqueWords.contains(nextElem)) {
                uniqueWords.add(nextElem);
            }
        }
        dicSize = uniqueWords.size();
        return dicSize;
    }

    public int size() {
        int size = 0;
        while (iterator.hasNext()) {
            size++;
            iterator.next();
        }
        return size;
    }

    public Set<String> occurMoreThan(Integer count) {
        TreeMap<String, Integer> allOccurrences = new TreeMap<>();
        TreeSet<String> definedOccurrences = new TreeSet<>();
        while(iterator.hasNext()) {
            String nextElem = iterator.next();
            if (allOccurrences.containsKey(nextElem)) {
                allOccurrences.put(nextElem, allOccurrences.get(nextElem) + 1);
            } else {

            allOccurrences.put(nextElem, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : allOccurrences.entrySet()) {
            if (entry.getValue().equals(count)) {
                definedOccurrences.add(entry.getKey());
            }
        }
        return definedOccurrences;
    }
}
