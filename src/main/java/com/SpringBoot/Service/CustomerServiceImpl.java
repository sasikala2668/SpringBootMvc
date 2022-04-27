package com.SpringBoot.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.SpringBoot.DTO.CustomerDto;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDto getCustomerById(UUID id) {
		
		return CustomerDto.builder().id(UUID.randomUUID()).name("Sasikala").build();
	}

}
