
import java.util.TreeSet;
import java.util.TreeMap;

public class Application {

    public static void main(String... args) {
        Long startTime = System.currentTimeMillis();
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] aTOeArray = "abcde".split("");

        for (int i=0; i < args.length; i++) {
            FileContent currentFile = new FileContent(args[i]);
            StatisticalAnalysis charAnalysis = new StatisticalAnalysis(currentFile.charIterator());
            StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(currentFile.wordIterator());

            Integer charCount = charAnalysis.countOf(alphabet);
            Integer wordCount = wordAnalysis.size();
            Integer dicSize = wordAnalysis.dictionarySize();
            Integer countOnePercent = wordAnalysis.size()/100;
            TreeSet<String> mostUsedWords = new TreeSet<>(wordAnalysis.occurMoreThan(countOnePercent));

            Integer loveCount = wordAnalysis.countOf("love");
            Integer hateCount = wordAnalysis.countOf("hate");
            Integer musicCount = wordAnalysis.countOf("music");
            Integer vowelsCount = charAnalysis.countOf("a", "o", "i", "e", "u");
            Float vowelsPercentage = ((float)vowelsCount / (float) charCount) * 100f;
            Integer aTOeCount = charAnalysis.countOf(aTOeArray);
            Float aTOeRatio = ((float) charCount /(float)aTOeCount);
            TreeMap<String, Float> lettersOcc = charAnalysis.calculateLetterOcc();

            View.printFileName(args[i]);
            View.printCharactersInFile(charCount);
            View.printWordsInFile(wordCount);
            View.printDicSize(dicSize);
            View.printMostUsedWords(mostUsedWords);
            View.printWordOccurency("love", loveCount);
            View.printWordOccurency("hate", hateCount);
            View.printWordOccurency("music", musicCount);
            View.printVowelsPercentage(vowelsPercentage);
            View.printAtoERatio(aTOeRatio);
            View.printLettersUsage(lettersOcc);
        }

        Long stopTime = System.currentTimeMillis();
        Long elapsedTime = (stopTime - startTime);
        Float elapsedSeconds = elapsedTime.floatValue() / 1000;
        View.printElapsedTime(elapsedSeconds);
    }
}
