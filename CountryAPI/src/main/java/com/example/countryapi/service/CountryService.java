package com.example.countryapi.service;

import com.example.countryapi.model.Country;
import com.example.countryapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    public CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();
    }
    public Country getById(Long id){         // Có thể sử dụng Option Country thay cho orElse
        return countryRepository.findById(id).orElse(null);
    }
    public void saveCountry(Country country){
        countryRepository.save(country);
    }
    public Country updateCountry(Country country){
        Country existCountry;
        existCountry = countryRepository.findById(country.getId()).orElse(null);
        existCountry.setName(country.getName());
        existCountry.setPresident(country.getPresident());
        return countryRepository.save(existCountry);
    }
    public void deleteCountry(Long id){
        countryRepository.deleteById(id);
    }

}
