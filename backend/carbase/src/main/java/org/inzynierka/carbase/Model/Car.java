package org.inzynierka.carbase.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String color;
    private String engine;
    private int horsepower;
    private int mileage;
    private int year;
    private double rentalPrice;
    private String description;
    private String image;
    private String engineType;
    private String transmission;
    private int seats;
    private String bodyType;

}

