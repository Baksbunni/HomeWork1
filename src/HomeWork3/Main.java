package HomeWork3;

public class Main {
    public static void main(String[] args) {
       Transport car = new Car("mercedes",4);
        Transport car2 = new Car("audi",4);
//        car.modelName = "car1";
//        car2.modelName = "car2";
//        car.wheelsCount = 4;
//        car2.wheelsCount = 4;

        Transport truck = new Truck("truck1",6);
        Transport truck2 = new Truck("truck2",10);
//        truck.modelName = "truck1";
//                truck2.modelName = "truck2";
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;

        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycale2",3);
//        bicycle.modelName = "bicycle1";
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;

        Transport[] transports = {car, car2, truck, truck2, bicycle, bicycle2};

        ServiceStation station = new ServiceStation();

        for (Transport transport : transports) {
            station.check(transport);
        }
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);
    }
}
