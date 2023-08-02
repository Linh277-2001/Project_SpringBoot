package com.vietcodedi.countryapiproject.service;

import com.vietcodedi.countryapiproject.exception.NotFoundException;
import com.vietcodedi.countryapiproject.model.Country;
import com.vietcodedi.countryapiproject.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    public Country getCountryById(Long id){
        return countryRepository.findById(id).orElseThrow();
    }

    public Country saveCountry(Country country){
        return countryRepository.save(country);
    }

    public Country updatePresident(Long id, String president){
        Country country = this.getCountryById(id);
        country.setPresident(president);
        countryRepository.save(country);
        return country;
    }

    public void deleteCountry(Long id){
        Country country = this.getCountryById(id);
        if(country == null){
            throw new NotFoundException();
        }
        countryRepository.delete(country);
    }
}
