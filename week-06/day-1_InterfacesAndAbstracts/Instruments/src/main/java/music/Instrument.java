package main.java.music;

public abstract class Instrument {
    protected String name;
    protected String voice;

    public Instrument(String name) {
        this.name = name;
    }

    public Instrument(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public abstract void play();
}
