package br.com.abcosta.ecommerceifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.abcosta.ecommerceifood.model.Client;

public interface ClientDAO extends CrudRepository<Client, Integer> {

}
