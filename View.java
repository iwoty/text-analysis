
public class View {

    public View() {
    }

    public void printFilename(String filename) {
        System.out.format("==%s==\n", filename);
    }

    public void printTime(String message, Long value) {
        System.out.format("%s %d ms\n", message, value);
    }

    public void print(String message, Integer value) {
        System.out.format("%s: %d\n", message, value);
    }

}
