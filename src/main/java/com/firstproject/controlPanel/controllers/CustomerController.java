package com.firstproject.controlPanel.controllers;

import com.firstproject.controlPanel.models.Customer;
import com.firstproject.controlPanel.Conexion;
import com.firstproject.controlPanel.services.CustormerServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired //Para que lo lo autoimporte  "Carga el objeto sin la necesidad de instanciarlo, automaticamente"
    private CustormerServicesImp services;

    @GetMapping("/prueba")
    public String prueba(){
        return "Hola mundo";
    }

    @GetMapping("/customer/{id}")//Traer el cliente 107
    public Customer getCustomer(@PathVariable Integer id){
        Conexion.getInstance().setPassword("asdfasdf");
        return services.getCustomer(id);
    }

    @GetMapping("/customer") //Mostrar todos los clientes
    public List<Customer> getALlCustomer(){
        return services.getALlCustomer();
    }

    @DeleteMapping("/customer/{id}")//ELiminar clientes
    public void removeCustomer(@PathVariable Integer id){
        services.removeCustomer(id);
    }

    @PostMapping("/customer") //Agregar Clientes
    public void AddCustomer(@RequestBody Customer customer){
        services.AddCustomer(customer);
    }

    @PutMapping ("/customer/{id}")//modificar clientes
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer updateCustomer){
        services.updateCustomer(id, updateCustomer);
    }

    @GetMapping("/customer/search")//Traer el cliente 107
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String email, @RequestParam(name = "addres", required = false) String addres){
        return services.getCustomer(email);
    }

}
