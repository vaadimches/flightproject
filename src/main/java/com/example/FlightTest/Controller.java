package com.example.FlightTest;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class Controller {

    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable int id) {
        // Ваш код для отримання об'єкта Flight з бази даних або з іншого джерела
        Flight flight = new Flight();
        flight.setId(id);
        flight.setDeparture("New York");
        flight.setArrival("London");
        flight.setDepartureDateTime("2023-06-12 12:00");
        flight.setArrivalDateTime("2023-06-12 15:30");
        flight.setPrice(500);
        flight.setFlight_number(123);
        flight.setCreation_date("2023-06-10");
        return flight;
    }

    @PostMapping("/")
    public String createFlight(@RequestBody Flight flight) {
        // Ваш код для збереження об'єкта Flight у базі даних або у іншому джерелі
        // Виведення об'єкта Flight на консоль як приклад
        System.out.println(flight.toString());
        return "Flight created successfully";
    }
}
