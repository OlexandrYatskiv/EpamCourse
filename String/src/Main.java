import java.util.Arrays;

public class Main {
    public static boolean areAnagrams(String str1, String str2) {
        String sentence1 = deleteSpace(str1);
        String sentence2 = deleteSpace(str1);
        sentence1 = sentence1.toLowerCase();
        sentence2 = sentence2.toLowerCase();
        sentence1 = sort(sentence1);
        sentence2 = sort(sentence2);

        return sentence1.equals(sentence2);
    }

    protected static String deleteSpace(String string) {
        int i, len = string.length();
        StringBuilder dest = new StringBuilder(len);
        char c;

        for (i = (len - 1); i >= 0; i--) {
            c = string.charAt(i);
            if (Character.isLetter(c)) {
                dest.append(c);
            }
        }
        return dest.toString();
    }
    protected static String sort(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str1 = "parliament";
        String str2 = "partial men";
        System.out.println("    String 1: " + str1);
        System.out.println("    String 2: " + str2);
        System.out.println();
        if (areAnagrams(str1, str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println();
    }
}