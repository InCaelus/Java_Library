public class PhilosophyTraits {

    private final String name;

    private PhilosophyTraits(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static final PhilosophyTraits RATIONALISM = new PhilosophyTraits("RATIONALISM");
    public static final PhilosophyTraits EMPIRICISM = new PhilosophyTraits("EMPIRICISM");
    public static final PhilosophyTraits IDEALISM = new PhilosophyTraits("IDEALISM");
    public static final PhilosophyTraits EXISTENTIALISM = new PhilosophyTraits("EXISTENTIALISM");
    public static final PhilosophyTraits PESSIMISM = new PhilosophyTraits("PESSIMISM");
    public static final PhilosophyTraits NIHILISM = new PhilosophyTraits("NIHILISM");

    public static PhilosophyTraits[] values() {
        return new PhilosophyTraits[]{
                RATIONALISM,
                EMPIRICISM,
                IDEALISM,
                EXISTENTIALISM,
                PESSIMISM,
                NIHILISM
        };
    }
}
