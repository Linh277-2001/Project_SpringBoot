package com.example.countryapi.controller;

import com.example.countryapi.model.Country;
import com.example.countryapi.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CountryController {
    @Autowired
    public CountryService countryService;

    @GetMapping("countries")
    public List<Country> getAllCountry(){
        return countryService.getAll();
    }

    @GetMapping("country/{id}")
    public Country findCountry(@PathVariable Long id){
        return countryService.getById(id);
    }

    @PostMapping("insertCountry")
    public Long insertCountry(@RequestBody Country country){
        countryService.saveCountry(country);
        return country.getId();
    }
    @PostMapping("updateCountry")
    public Country updateCountry(@RequestBody Country country){
        return countryService.updateCountry(country);
    }
    @PostMapping("deleteCountry/{id}")
    public void deleteCountry(@PathVariable Long id){
        countryService.deleteCountry(id);
    }

}
