package com.tharshan.pearson.repository;
import com.tharshan.pearson.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryRepository extends CrudRepository<Country, Integer> {

    //custom query to search countries with code and name
    @Query("SELECT c FROM Country c where countryCode LIKE %?1% or countryName LIKE %?1% ORDER BY countryCode")
    List<Country> findAllByCountry(String countryCode, String CountryName);

}
