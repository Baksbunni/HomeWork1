package homeWork1;

public class Hogwarts {

    public void compare(HogwartsStudent student1, HogwartsStudent student2) {
        int resultStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int resultStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        int resultStudent3 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1 + " является лучше чем " + student2);
        }
    }

    public void compare(GryffindorStudent student1, GryffindorStudent student2) {
        int resultStudent1 = student1.getCourage() + student1.getHonor() + student1.getNobility();
        int resultStudent2 = student2.getCourage() + student2.getHonor() + student2.getNobility();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1 + " является лучше чем " + student2);
        }
    }

    public void compare(PuffinduiStudent student1, PuffinduiStudent student2) {
        int resultStudent1 = student1.getHardWorking() + student1.getLoyal() + student1.getHonest();
        int resultStudent2 = student2.getHardWorking() + student2.getLoyal() + student2.getHonest();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1 + " является лучше чем " + student2);
        }
    }

    public void compare(SlytherinStudent student1, SlytherinStudent student2) {
        int resultStudent1 = student1.getCunning() + student1.getDetermination() +
                student1.getAmbition() + student1.getResourcefulness()
                + student1.getPower();
        int resultStudent2 = student2.getCunning() + student2.getDetermination()
                + student2.getAmbition() + student1.getResourcefulness() + student1.getPower();
        if (resultStudent1 > resultStudent2) {
            System.out.println(student1 + " является лучше чем " + student2);
        }
    }
}