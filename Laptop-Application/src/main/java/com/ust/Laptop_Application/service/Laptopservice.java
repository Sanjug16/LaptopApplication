package com.ust.Laptop_Application.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.ust.Laptop_Application.model.Laptopmodel;
import com.ust.Laptop_Application.repo.Laptopsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Laptopservice {
    @Autowired
    private Laptopsrepo laptopsRepo;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Laptopmodel> findBestRatedLaptopsForPrice(double price) {
        return jpaStreamer.stream(Laptopmodel.class).filter(laptop -> laptop.getPrice() <= price)
                .sorted((l1, l2) -> Double.compare(l2.getRating(), l1.getRating()))
                .collect(Collectors.toList());
    }
}
