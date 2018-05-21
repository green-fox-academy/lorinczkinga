package main.java.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super("Violin", "Screech");
        this.numberOfStrings = 4;
    }

    public Violin(int numberOfStrings) {
        super("Violin", "Screech");
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return this.voice;
    }
}
