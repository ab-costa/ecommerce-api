package br.com.abcosta.ecommerceifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.abcosta.ecommerceifood.model.Product;

public interface ProductDAO extends CrudRepository<Product, Integer> {

}
