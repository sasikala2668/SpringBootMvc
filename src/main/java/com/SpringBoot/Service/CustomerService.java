package com.SpringBoot.Service;

import java.util.UUID;

import com.SpringBoot.DTO.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID id);

}
