package cinema;


import cinema.controller.SeatsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Application started");
        SpringApplication.run(Main.class, args);
    }
}
