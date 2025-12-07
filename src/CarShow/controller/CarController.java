package CarShow.controller;

import CarShow.model.Car;
import CarShow.model.ModelCar;
import CarShow.model.Proprietaire;

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

    public int countCar(Object param){
        if(param == null){
            throw new RuntimeException("null value for param in countCar(param)");
        }
        int count = 0;
        if(param instanceof ModelCar){
            for(Car car:ListCar()){
                if(car.getModel() != null &&  car.getModel().equals(param)){
                    count++;
                }
            }
        }else{
            for(Car car:ListCar()){
                if(car.getMarque()!= null && car.getMarque().equals(param.toString())){
                    count++;
                }
            }
        }
        return count;
    }

    public String detail(int id){
        String detail = null;
        for(Car car: Cars){
            if(car.getId() == id){
                detail = car.toString();
            }
        }
        return detail;
    }

    public Car findByNum(String num){
        Car carFound = null;
        for(Car car: Cars){
            if(car.getNumero().equals(num)){
                carFound = car;
            }
        }
        return carFound;
    }

    public List<Car> findByMarque(String marque){
        List<Car> cars = new ArrayList<>();
        for(Car car: Cars){
            if(car.getMarque().equals(marque)){
                cars.add(car);
            }
        }

        return cars;
    }

    public void deleteCarById(int id){
        for(Car car: Cars){
            if(car.getId() == id){
                Cars.remove(car);
            }
        }
    }

    public void addProp(int idCar, int propId){
        List<Proprietaire> listProp = ProprietaireController.getListProp();
        for(Proprietaire prop : listProp){
            if(prop.getId() == propId){
                List<Car> listCar = prop.getListVoiture();
                for(Car car: Cars){
                    if(car.getId() == idCar){
                        listCar.add(car);
                    }
                }
            }
        }
    }
}
