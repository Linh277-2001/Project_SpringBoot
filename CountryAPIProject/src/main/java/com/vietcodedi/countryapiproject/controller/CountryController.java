package com.vietcodedi.countryapiproject.controller;

import com.vietcodedi.countryapiproject.generic.GenericApiResponse;
import com.vietcodedi.countryapiproject.model.Country;
import com.vietcodedi.countryapiproject.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/{id}")
    public ResponseEntity<GenericApiResponse<Country>> getCountryById(@PathVariable Long id){
        try{
            Country country = countryService.getCountryById(id);
            GenericApiResponse<Country> apiResponse = new GenericApiResponse<>("200", "OK", country);
            return new ResponseEntity<>(apiResponse, HttpStatus.OK);
        }catch(Exception e){
            String message = e.getMessage();
            GenericApiResponse<Country> apiResponse = new GenericApiResponse<>("404", message, null);
            return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping
    public Country createNewCountry(@RequestBody Country country){
        return countryService.saveCountry(country);
    }

    @PutMapping("/{id}")
    public Country updatePresidentOfCountry(@PathVariable Long id, @RequestBody String president){
        return countryService.updatePresident(id, president);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable Long id){
        countryService.deleteCountry(id);
    }
}
