package com.example.garage2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private int id;
    private String number;
    private String brand;
    private String model;
    private String color;

}
