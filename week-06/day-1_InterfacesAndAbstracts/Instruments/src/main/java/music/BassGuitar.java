package main.java.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        super("Bass Guitar", "Duum-duum-duum");
        this.numberOfStrings = 4;
    }

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar", "Duum-duum-duum");
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return this.voice;
    }
}
