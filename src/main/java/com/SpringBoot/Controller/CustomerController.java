package com.SpringBoot.Controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.DTO.CustomerDto;
import com.SpringBoot.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		
		this.customerService = customerService;
	}

	
	@GetMapping({"/{id}"})
	
	public ResponseEntity<CustomerDto> getById(@PathVariable UUID id)
	{
		return new ResponseEntity<>(customerService.getCustomerById(id),HttpStatus.OK);
	}

}
