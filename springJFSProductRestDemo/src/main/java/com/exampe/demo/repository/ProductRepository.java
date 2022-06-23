package com.exampe.demo.repository;

import java.util.List;

import com.exampe.demo.model.Product;



public interface ProductRepository {
	
	public Product createProduct(Product p);
	public List<Product> list();
	public Product update(Product product);
	public void delete(int id);
	public Product find(int id);

}
