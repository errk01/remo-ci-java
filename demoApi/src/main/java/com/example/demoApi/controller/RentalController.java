package com.example.demoApi.controller;

import com.example.demoApi.model.Rental;
import com.example.demoApi.repo.RentalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public class RentalController {

//    @Autowired
//    private RentalRepo rentalRepo;
//
//    @PostMapping(value = "/rentals")
//    public ResponseEntity<Void> createRental(@RequestBody @Valid Rental rental, BindingResult bindingResult){
//        if(rentalRepo.findAllByCustomerEmail(rental.getCustomerEmail()) != null){
//            bindingResult.rejectValue("emailAddress","error.email","Email address is already taken");
//        }
//        if(bindingResult.hasErrors()){
//                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//            }
//            rentalRepo.save(rental);
//            return new ResponseEntity<>(HttpStatus.CREATED);
//    }
//    @GetMapping("/dealerships/{dealershipId}/cars/")
//    public ResponseEntity<List<Car>> getCars(@PathVariable(value="dealershipId") Long dealershipId,
//                                             @RequestParam(value="color", required=false) String color
//                                         @RequestParam(value="sort", required=false) String sort) {
//        Dealer dealer = dealerRepository.findById(dealershipId);
//        if (dealer == null){
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        List<Car> cars;
//        if (color != null && sort != null && sort.equalsIgnoreCase("msrp")){
//            cars = carRepository.findAllByDealerAndColorOrderByMsrpDesc(dealer, color);
//        }
//        else if (color != null){
//            cars = carRepository.findAllByDealerAndColor(dealer, color);
//        }
//        else if (sort != null && sort.equalsIgnoreCase("msrp")){
//            cars = carRepository.findAllByDealerOrderByMsrpDesc(dealer);
//        }
//        else {
//            cars = carRepository.findAllByDealer(dealer);
//        }
//        return new ResponseEntity<>(cars, HttpStatus.OK);
//    }

    @GetMapping("/get")
    public Rental getTelevision() {
        return new Rental(1L, "1080p", "30", "XR35", "Sony");
    }

    @GetMapping("/get4k")
    public Rental getOtherTelevision() {
        return new Rental(2L, "4k", "50", "XR36", "Sony");
    }
}
