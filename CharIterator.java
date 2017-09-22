import java.util.ArrayList;

import java.util.Iterator;

public class CharIterator implements Iterator<String>{

    ArrayList<String> characterList = new ArrayList<>();
    int index = 0;

    public CharIterator (FileContent content) {

        for (String word : content.getContent()) {
            for (Character character : word.toCharArray()) {
                characterList.add(character.toString());
            }
        }
    }

    public boolean hasNext() {
        while(index < characterList.size()) {
            return true;
        }
        index = 0;
        return false;
    }

    public String next() {
        if (hasNext()) {
            return characterList.get(index++);
        }
        return null;
    }
}
