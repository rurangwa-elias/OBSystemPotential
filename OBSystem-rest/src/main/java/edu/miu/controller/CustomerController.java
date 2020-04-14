package edu.miu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.obs.domain.Customer;
import edu.miu.obs.service.CustomerService;

@RestController
@RequestMapping({ "/customers" })
public class CustomerController {

	@Autowired
	private CustomerService CustomerService;

	@RequestMapping("")
	public List<Customer> findAll() {
		List<Customer> memberList = CustomerService.findAllCustomers();
		return memberList;

	}

}
