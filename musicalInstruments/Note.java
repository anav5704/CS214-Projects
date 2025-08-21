package musicalInstruments;

public class Note {
    public static final Note MIDDLE_C = new Note("Middle C");
    public static final Note C_SHARP = new Note("C Sharp");
    public static final Note B_FLAT = new Note("B Flat");

    private String noteName;

    private Note(String noteName) {
        this.noteName = noteName;
    }

    public String toString() {
        return noteName;
    }
}
