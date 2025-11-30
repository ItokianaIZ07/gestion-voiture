//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import CarShow.controller.CarController;
import CarShow.model.*;

public class Main {
    public static void main(String[] args) {
        ModelCar model1 = new ModelCar("205");

        Car car = new Car("Voiture1", "peugeot", "1234TAA", model1);
        Car car1 = new Car("Voiture2", "peugeot", "9999TTT", model1);

        CarController carController = new CarController();
        carController.add(car);
        carController.add(car1);

        System.out.println(carController.ListCar());
    }
}