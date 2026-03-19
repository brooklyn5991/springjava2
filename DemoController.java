package com.Gifttech1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    private CarCompany theCar;

    @Autowired
    public DemoController(CarCompany myCar) {
        theCar = myCar;
    }

    @GetMapping("/car")
    public String newCar() {
        return theCar.getBmw();
    }
}
