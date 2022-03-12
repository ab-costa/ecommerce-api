package br.com.abcosta.ecommerceifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abcosta.ecommerceifood.dao.DemandDAO;
import br.com.abcosta.ecommerceifood.model.Demand;

@RestController
public class DemandController {

	@Autowired
	private DemandDAO dao;
	
	@GetMapping("/pedidos")
	public List<Demand> getAll() {
		return (List<Demand>)dao.findAll();
	}
}
