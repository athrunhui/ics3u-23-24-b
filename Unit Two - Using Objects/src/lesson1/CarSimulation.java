package lesson1;

public class CarSimulation {
    public static void main(String[] args) {
        Car jeep = new Car("Jeep", "Cherokee", 2022, 555.5);
        Car truck = new Car("Ford", "F150", 2023, 789.1);

        jeep.drive(80.7);
        truck.printCarInfo();
    }   
}
