import java.lang.CharSequence;

public class FirstClass implements CharSequence {
    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    String sentence;

    public FirstClass() {
    }

    public FirstClass(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public int length() {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        return "sentence= " + sentence;

    }

    private int searchIndex(int index) {
        return sentence.length() - sentence.length() + index;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 && index > sentence.length() - 1) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return sentence.charAt(searchIndex(index));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > sentence.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub =
                new StringBuilder(sentence.subSequence((start), searchIndex(end)));
        return sub.reverse();
    }
}





