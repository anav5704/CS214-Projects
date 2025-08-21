package musicalInstruments;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHARP);
    }

    public static void main(String[] args) {
        Flute flute = new Flute();
        Guitar guitar = new Guitar();

        tune(flute);
        tune(guitar);

        System.out.println("End of program.");
    }
}
