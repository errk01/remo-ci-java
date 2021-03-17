package com.example.demoApi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resolution;
    private String sizeInInches;
    private String model;
    private String brand;

//    @Size(min=2, max=30)
//    private String customerFirstName;
//
//    @Email
//    private String customerEmail;
//
//    @CreditCardNumber
//    private String creditCardNumber;
//
//    @Digits(integer = 3, fraction = 2)
//    private double cost;
//
//    @PastOrPresent
//    private Date rentalDate;
}
