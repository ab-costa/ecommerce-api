package br.com.abcosta.ecommerceifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.abcosta.ecommerceifood.model.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
