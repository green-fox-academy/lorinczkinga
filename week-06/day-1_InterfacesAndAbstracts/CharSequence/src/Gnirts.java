public class Gnirts implements CharSequence {
    private String word;

    public Gnirts(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(word.length() - index -1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder subSequence = new StringBuilder();
        for (int i = word.length() - start - 1; i > word.length() - end - 1; i--) {
            subSequence.append(word.charAt(i));
        }
        return subSequence;
    }
}
