package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CarController {

    //problem

    @GetMapping(value = "/cars")
    public CarDTO getCarDTO( @Autowired CarDTO carDTO){
        return new CarDTO("Panda","4X4", 10.5);
    }

    @PostMapping(value = "/cars")
    public HttpStatus postCars(@Valid @RequestBody CarDTO  carDTO){
        System.out.println(carDTO.toString());
        return HttpStatus.CREATED;
    }

}
