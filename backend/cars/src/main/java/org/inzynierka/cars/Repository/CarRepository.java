package org.inzynierka.cars.Repository;

import org.inzynierka.cars.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
