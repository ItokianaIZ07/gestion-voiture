package CarShow.controller;

import CarShow.model.Car;
import CarShow.model.ModelCar;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    private List<Car> Cars;

    public CarController() {
        this.Cars = new ArrayList<>();
    }



    public void add(Car car){
        Cars.add(car);
    }

    public List<Car> ListCar(){
      return Cars;
    }

    public List<Car> filtreMarque(String marque){
        List<Car> listFiltre = new ArrayList<>();
        for(Car car: ListCar()){
            if(car.getMarque().equals(marque)){
                listFiltre.add(car);
            }
        }
        return listFiltre;
    }

    public List<Car> filtreNumero(String numero){
        List<Car> listFiltre = new ArrayList<>();
        for(Car car: ListCar()){
            if(car.getNumero().equals(numero)){
                listFiltre.add(car);
            }
        }
        return listFiltre;
    }

    public void deleteCar(Car car){
        for(Car car2: ListCar()){
            if(car2.getNumero().equals(car.getNumero())){
                Cars.remove(car2);
            }
        }
    }

    public int countCar(){
        return Cars.size();
    }

    public int countCarParMarque(String marque){
        int count = 0;
        for(Car car: ListCar()){
            if(car.getMarque().equals(marque)){
                count++;
            }
        }
        return count;
    }

    public int countCarParModele(ModelCar modele){
        int count = 0;
        for(Car car: ListCar()){
            if(car.getModel().equals(modele)){
                count++;
            }
        }
        return count;
    }

    // filtre car par marque
    //            par numéro
    // supprimer car
    // count car
    // count à partir marque/modèle
}
