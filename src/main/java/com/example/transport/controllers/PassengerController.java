package com.example.transport.controllers;

import com.example.transport.models.Passenger;
import com.example.transport.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
    @Autowired
    private PassengerRepository repository;

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return repository.findAll();
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return repository.save(passenger);
    }
}