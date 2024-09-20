package com.firstproject.controlPanel.services;

import com.firstproject.controlPanel.models.Customer;

import java.util.List;

public interface CustomerService {


    //Traer el cliente 107
    Customer getCustomer(Integer id);

    //Mostrar todos los clientes
    List<Customer> getALlCustomer();

    //ELiminar clientes
    void removeCustomer(Integer id);

    //Agregar Clientes
    void AddCustomer(Customer customer);

    void updateCustomer(Integer id, Customer updateCustomer);

    List<Customer> getCustomer(String email);

    default void haccerAlgo(){//Desde java8 se puede hacer esto

    }

}
