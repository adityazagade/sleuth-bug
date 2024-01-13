package com.example.sleuthbug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SleuthBugApplication implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(SleuthBugApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Car car = new Car();
        car.setId(1L);
        carRepository.save(car);
    }
}
