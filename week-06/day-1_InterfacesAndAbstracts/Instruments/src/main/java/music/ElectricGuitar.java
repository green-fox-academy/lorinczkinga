package main.java.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar() {
        super("Electric Guitar", "Twang");
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", "Twang");
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String sound() {
        return this.voice;
    }
}
