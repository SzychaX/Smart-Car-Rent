package org.inzynierka.carbase.Repository;

import org.inzynierka.carbase.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
