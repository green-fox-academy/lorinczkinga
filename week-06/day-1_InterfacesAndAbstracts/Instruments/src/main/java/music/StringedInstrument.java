package main.java.music;

public abstract class StringedInstrument extends Instrument{
    protected int numberOfStrings;

    public StringedInstrument(String name) {
        super(name);
    }

    public StringedInstrument(String name, String voice) {
        super(name, voice);
    }

    public abstract String sound();

    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
