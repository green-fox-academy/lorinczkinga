public class Shifter implements CharSequence{
    private String word;
    private int shift;

    public Shifter(String word, int shift){
        this.word = word;
        this.shift = shift;
    }

    public String getWord() {
        return word;
    }

    public int getShift() {
        return shift;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index + shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder subSequence = new StringBuilder();
        for (int i = start + shift; i < end + shift; i++) {
            subSequence.append(word.charAt(i));
        }
        return subSequence;
    }
}