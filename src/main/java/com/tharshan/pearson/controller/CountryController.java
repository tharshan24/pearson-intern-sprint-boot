package com.tharshan.pearson.controller;

import com.tharshan.pearson.model.Country;
import com.tharshan.pearson.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin //to allow cors request and prevent block errors
@RestController //defining as reset service handler
public class CountryController {

    @Autowired
    CountryService cs;

    // @CrossOrigin
    @GetMapping("/countries")
    private List<Country> getAllCountries() {
        return cs.getAllCountries();
    }

    @GetMapping("/country/{id}")
    private Country getCountry(@PathVariable("id") int id) {
        return cs.getCountry(id);
    }

    @DeleteMapping("/country/{id}")
    private void deleteCountry(@PathVariable("id") int id) {
        cs.deleteCountry(id);
    }

    @PostMapping("/country")
    private void saveCountry(@RequestBody Country country) {
        cs.saveCountry(country);
    }

//    search countries with code or name
    @GetMapping("countries/search")
    private List<Country> getCountriesByName(String country) {
        return cs.getCountriesByName(country);
        // return countryCode + " " + countryName;
    }

}
