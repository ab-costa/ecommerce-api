package br.com.abcosta.ecommerceifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abcosta.ecommerceifood.dao.CustomerDAO;
import br.com.abcosta.ecommerceifood.model.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDAO dao;
	
	@GetMapping("/clientes")
	public List<Customer> getAll() {
		return (List<Customer>)dao.findAll();
	}
}
