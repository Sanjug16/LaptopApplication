package com.ust.Laptop_Application.controller;

import com.ust.Laptop_Application.model.Laptopmodel;
import com.ust.Laptop_Application.service.Laptopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class Laptopcontroller {

    @Autowired
    private Laptopservice laptopService;

    @GetMapping("/laptops/best-rating/{price}")
    public List<Laptopmodel>getBestRatedLaptops(@PathVariable double price) {
        return laptopService.findBestRatedLaptopsForPrice(price);
    }


}
