package br.com.abcosta.ecommerceifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.abcosta.ecommerceifood.model.Department;

public interface DepartmentDAO extends CrudRepository<Department, Integer> {

}
