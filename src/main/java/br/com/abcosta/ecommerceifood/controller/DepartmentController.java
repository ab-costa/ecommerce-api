package br.com.abcosta.ecommerceifood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.abcosta.ecommerceifood.dao.DepartmentDAO;
import br.com.abcosta.ecommerceifood.model.Department;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentDAO dao;
	
	@GetMapping("/departamentos")
	public List<Department> getAll() {
		return (List<Department>)dao.findAll();
	}
}
