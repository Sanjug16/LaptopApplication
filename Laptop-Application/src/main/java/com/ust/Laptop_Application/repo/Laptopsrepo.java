package com.ust.Laptop_Application.repo;

import com.ust.Laptop_Application.model.Laptopmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptopsrepo extends JpaRepository<Laptopmodel,Integer> {
}
