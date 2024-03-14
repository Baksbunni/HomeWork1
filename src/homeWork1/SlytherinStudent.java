package homeWork1;

public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int power;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance,
                            int cunning, int determination, int ambition,
                            int resourcefulness, int power) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return getName();
    }
}
