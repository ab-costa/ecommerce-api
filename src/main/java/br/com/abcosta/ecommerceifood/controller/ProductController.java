package br.com.abcosta.ecommerceifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abcosta.ecommerceifood.dao.ProductDAO;
import br.com.abcosta.ecommerceifood.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductDAO dao;
	
	@GetMapping("/produtos")
	public List<Product> getAll() {
		return (List<Product>)dao.findAll();
	}
}
