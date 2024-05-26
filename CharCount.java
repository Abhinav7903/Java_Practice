
public class CharCount {
    public static int charCount(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return 0;
        return sentence.replaceAll("\\s+", "").length();
    }

    public static void main(String[] args) {
        String sentence = "Hello world!";
        int count = charCount(sentence);
        System.out.println("Character count: " + count);
    }
}
