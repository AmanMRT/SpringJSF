package com.exampe.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampe.demo.model.Product;
import com.exampe.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository repository;
	
	public Product createProduct(Product p) {
		//bussiness logic
		return repository.createProduct(p);
	}
	
	public List<Product> getAllProduct(){
		
		return repository.list();
	}
	
	public Product findProduct(int id) {
		return repository.find(id);
	}
	
	public Product updateProduct(Product product) {
		return  repository.update(product);
	}
	
	public void deleteProduct(int id) {
		repository.delete(id);
	}

}
