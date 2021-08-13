package com.tharshan.pearson.service;

import com.tharshan.pearson.model.Country;
import com.tharshan.pearson.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository cr;

//    get all countries
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<Country>();
        cr.findAll().forEach(country -> countries.add(country));
        return countries;
    }

//    get single country with id
    public Country getCountry(int id) {
        return cr.findById(id).get();
    }

    public void deleteCountry(int id) {
        cr.deleteById(id);
    }

//    save or update country
    public void saveCountry(Country country) {
        cr.save(country);
    }

//    search country with code or name
    public List<Country> getCountriesByName(String country) {
        List<Country> countries = new ArrayList<Country>();
        cr.findAllByCountry(country, country).forEach(c -> countries.add(c));
        return countries;
    }
}
