package homeWork1;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent gryffindor1 = new GryffindorStudent("Гермиона", 3,
                6, 7, 8, 1);
        GryffindorStudent gryffindor2 = new GryffindorStudent("Рон", 2,
                4, 5, 2, 3);
        GryffindorStudent gryffindor3 = new GryffindorStudent("Гарри", 5,
                3, 6, 4, 7);
        ClawStudent clawStudent4 = new ClawStudent("Малфой", 14,
                33, 11, 14, 22, 13);

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.compare(gryffindor3,gryffindor2 );

        ClawStudent clawStudent1 = new ClawStudent("Малфой", 14,
                33, 11, 14, 22, 13);
        ClawStudent clawStudent2 = new ClawStudent("Монтегю", 44,
                3, 1, 21, 35, 6);
        ClawStudent clawStudent3 = new ClawStudent("Гойл", 4,
                22, 37, 21, 8, 5);
        hogwarts.compare(gryffindor3,clawStudent2);
    }
}
