package com.daicy.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.daicy.dto.CustomerDTO;
import com.daicy.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save-customer")
    public ResponseEntity<String> saveCustomer(
            @Valid @RequestBody CustomerDTO customerDTO) {

        customerService.saveCustomer(customerDTO.getFirstName(),
                customerDTO.getLastName(), customerDTO.getContactNumber());

        return new  ResponseEntity<>("Successfully Updated",
                HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-customer-by-id/{id}")
    @ResponseBody
    public ResponseEntity<CustomerDTO> getCustomerById(
            @PathVariable Long id) {
        return new ResponseEntity<>(customerService.getCustomerById(id),
                HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-customer-by-lastname/{lastName}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<CustomerDTO>> getCustomerByLastName(
            @PathVariable String lastName) {
        return new ResponseEntity<>(
                customerService.getCustomerByLastName(lastName),
                HttpStatus.ACCEPTED);
    }
}