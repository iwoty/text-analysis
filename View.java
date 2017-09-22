
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;
import java.text.DecimalFormat;

public class View {
    static DecimalFormat decimal0 = new DecimalFormat("#");
    static DecimalFormat decimal2 = new DecimalFormat("#.##");

    public static void printFileName(String fileName) {
        System.out.format("==%s==\n", fileName);
    }

    public static void printCharactersInFile(Integer count) {
        System.out.format("Char count: %s\n", count);
    }

    public static void printWordsInFile(Integer count) {
        System.out.format("Word count: %s\n", count);
    }

    public static void printDicSize(Integer count) {
        System.out.format("Dict size: %s\n", count);
    }

    public static void printMostUsedWords(TreeSet<String> set) {
        System.out.format("Most used words (>1%%): %s\n", set);
    }

    public static void printWordOccurency(String word, Integer count) {
        System.out.format("'%s' count: %s\n", word, count);
    }

    public static void printVowelsPercentage(Float count) {
        System.out.format("vowels %%: %s\n", decimal0.format(count));
    }

    public static void printAtoEratio(Float count) {
        System.out.format("'a:e count ratio' : %s\n", decimal2.format(count));
    }

    public static void printLettersUsage(TreeMap<String, Float> map) {
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.format("[%s -> %s] ", entry.getKey().toUpperCase(), decimal2.format(entry.getValue()));
        }
        System.out.println("");
    }

    public static void printElapsedTime(Float elapsedTime) {
        System.out.format("Benchmark time: %s secs\n", elapsedTime);
    }
}
