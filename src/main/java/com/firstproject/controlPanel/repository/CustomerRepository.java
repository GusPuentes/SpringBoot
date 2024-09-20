package com.firstproject.controlPanel.repository;

import com.firstproject.controlPanel.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository <Customer,Integer>{

}
