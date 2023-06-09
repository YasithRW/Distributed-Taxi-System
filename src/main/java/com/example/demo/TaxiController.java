package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TaxiController {

    @Autowired
    private TaxiService  taxiService;

    @GetMapping("/{cluster}")
    public Taxi getTaxi(@PathVariable int cluster)
    {
        return taxiService.getTaxiForUser(cluster);
    }
}
