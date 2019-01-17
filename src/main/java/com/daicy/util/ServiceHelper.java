package com.daicy.util;


import org.springframework.stereotype.Component;

import com.daicy.dto.CustomerDTO;
import com.daicy.model.Customer;

@Component
public class ServiceHelper {

  /**
   * Converts a CustomerDTO object into a Customer entity
   *
   * @param customerDto
   * @return customer
   */
  public Customer dtoToEntityTranslator(final CustomerDTO customerDto) {

      Customer customer = new Customer();

      customer.setId(customerDto.getId());
      customer.setFirstName(customerDto.getFirstName());
      customer.setLastName(customerDto.getLastName());
      customer.setContactNumber(customerDto.getContactNumber());

      return customer;
  }

}