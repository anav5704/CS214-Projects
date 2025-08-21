package musicalInstruments;

public class Flute implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Flute is playing " + n);
    }
}
