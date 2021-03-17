package com.example.demoApi.repo;

import com.example.demoApi.model.Rental;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepo extends CrudRepository<Rental, Long> {
    Rental findAllByCustomerEmail(String email);
}
