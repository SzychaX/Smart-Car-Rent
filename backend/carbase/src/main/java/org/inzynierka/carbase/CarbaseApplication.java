package org.inzynierka.carbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarbaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbaseApplication.class, args);
    }

}
