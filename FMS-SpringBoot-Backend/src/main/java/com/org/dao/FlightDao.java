package com.org.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.model.Flight;
@Repository
public interface FlightDao extends CrudRepository<Flight,BigInteger>{

}
