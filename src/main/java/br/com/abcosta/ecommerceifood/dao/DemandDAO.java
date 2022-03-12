package br.com.abcosta.ecommerceifood.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.abcosta.ecommerceifood.model.Demand;

public interface DemandDAO extends CrudRepository<Demand, Integer> {

}
