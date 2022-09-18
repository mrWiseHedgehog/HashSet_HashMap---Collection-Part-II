import java.util.*;

public class WordsChecker {

    private String text;
    String[] words;
    Set<String> set;
    public WordsChecker(String text) { 
        this.text = text;
        this.words = getText().split("\\P{IsAlphabetic}+");
        this.set = new HashSet<>();
        Collections.addAll(set, words);
    }

    protected String getText(){
        return text;
    }
    public boolean hasWord(String words) {
        return set.contains(words);
    }
}
