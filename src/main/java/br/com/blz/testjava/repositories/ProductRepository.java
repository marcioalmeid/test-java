package br.com.blz.testjava.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.blz.testjava.models.Product;
 
@Repository	
public interface ProductRepository extends CrudRepository<Product, Long>{
}
