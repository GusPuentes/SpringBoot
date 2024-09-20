package com.firstproject.controlPanel.services;

import com.firstproject.controlPanel.models.Customer;
import com.firstproject.controlPanel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustormerServicesImp implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    public String prueba(){
        return "Hola mundo";
    }

    //Traer el cliente 107
    public Customer getCustomer(Integer id){
       Optional<Customer> customer =repository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
       return null;
    }

    //Mostrar todos los clientes
    public List<Customer> getALlCustomer(){
        return null;
    }

    //ELiminar clientes
    public void removeCustomer(Integer id){

    }

    //Agregar Clientes
    public void AddCustomer(Customer customer){
    }

    public void updateCustomer(Integer id, Customer updateCustomer){
    }

    public List<Customer> getCustomer(String email){
        return null;
    }
}
