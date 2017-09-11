
import java.io.File;
import java.util.Scanner;

public class Application {

    public static void main(String... args) {
        long startTime = System.currentTimeMillis();
        View view = new View();

        for (int i=0; i < args.length; i++) {
            FileContent newFile = new FileContent(args[i]);
            CharIterator newCharIterator = new CharIterator(newFile);
            WordIterator newWordIterator = new WordIterator(newFile);
            StatisticalAnalysis newCharAnalysis = new StatisticalAnalysis(newCharIterator);
            StatisticalAnalysis newWordAnalysis = new StatisticalAnalysis(newWordIterator);

            view.printFilename(newFile.getFilename());
            // TODO: view.print("Char count", xxx);
            // TODO: view.print("Word count", xxx);
            // TODO: view.print("Dict size", xxx);
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = (stopTime - startTime);
        view.printTime("Benchmark time:", elapsedTime);
    }
}
