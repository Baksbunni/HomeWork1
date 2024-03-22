package HomeWork3;

public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void service() {
       super.service();
        checkTrailer();
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}