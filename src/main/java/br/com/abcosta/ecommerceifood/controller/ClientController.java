package br.com.abcosta.ecommerceifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abcosta.ecommerceifood.dao.ClientDAO;
import br.com.abcosta.ecommerceifood.model.Client;

@RestController
public class ClientController {

	@Autowired
	private ClientDAO dao;
	
	@GetMapping("/clientes")
	public List<Client> getAll() {
		return (List<Client>)dao.findAll();
	}
}
