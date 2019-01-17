package com.daicy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daicy.dto.CustomerDTO;
import com.daicy.model.Customer;
import com.daicy.repository.CustomerRepository;
import com.daicy.util.ServiceHelper;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ServiceHelper serviceHelper;

    /**
     * Save/update customer
     *
     * @param customerDto
     */
    public void saveCustomer(CustomerDTO customerDto) {
      customerRepository.save(
          serviceHelper.dtoToEntityTranslator(customerDto));
    }

    public CustomerDTO getCustomerById(long id) {
        Customer customer = customerRepository.findById(id).get();

        return new CustomerDTO(customer.getId(), customer.getFirstName(),
                customer.getLastName(), customer.getContactNumber());
    }

    public List<CustomerDTO> getCustomerByLastName(String lastName) {

        List<CustomerDTO> customers = new ArrayList<>();

        for(Customer customer: customerRepository.findByLastName(lastName)) {
            customers.add(new CustomerDTO(customer.getId(),
                    customer.getFirstName(), customer.getLastName(),
                    customer.getContactNumber()));
        }

        return customers;
    }
}