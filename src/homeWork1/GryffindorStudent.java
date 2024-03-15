package homeWork1;

public class GryffindorStudent extends HogwartsStudent{
    private  final int nobility;
    private final int honor;
    private final int courage;

    public GryffindorStudent(String name, int magicPower,
                             int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return getName();

    }

    public int getNobility() {
        return nobility;
    }
}