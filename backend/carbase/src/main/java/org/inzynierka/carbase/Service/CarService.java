package org.inzynierka.carbase.Service;

import org.inzynierka.carbase.Model.Car;
import org.inzynierka.carbase.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car carDetails) {
        Optional<Car> carOptional = carRepository.findById(id);

        if (carOptional.isPresent()) {
            Car car = carOptional.get();
            car.setDescription(carDetails.getDescription());
            car.setModel(carDetails.getModel());
            car.setYear(carDetails.getYear());
            car.setColor(carDetails.getColor());
            car.setBrand(carDetails.getBrand());
            car.setEngine(carDetails.getEngine());
            car.setHorsepower(carDetails.getHorsepower());
            car.setImage(carDetails.getImage());
            car.setMileage(carDetails.getMileage());
            car.setRentalPrice(carDetails.getRentalPrice());
            return carRepository.save(car);
        }
        return null;
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
