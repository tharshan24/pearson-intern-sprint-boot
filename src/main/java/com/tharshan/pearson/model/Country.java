package com.tharshan.pearson.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

// defining entity and table
@Entity
@Table
public class Country {

    @Id //primary key
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true) //unique column
    private String countryCode;

    @Column(unique = true) //unique column
    private String countryName;

    @Column
    private String continent;

    @Column
    private int population;

    @Column
    private int covidPositives = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCovidPositives() {
        return covidPositives;
    }

    public void setCovidPositives(int covidPositives) {
        this.covidPositives = covidPositives;
    }

}