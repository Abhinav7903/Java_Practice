
public class WordCount {
    public static int wordCount(String str) {
        if (str == null || str.isEmpty())
            return 0;
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "Hello world!";
        int count = wordCount(sentence);
        System.out.println("Word count: " + count);
    }
}
