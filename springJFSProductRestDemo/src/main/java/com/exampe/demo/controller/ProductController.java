package com.exampe.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exampe.demo.exception.NotFoundException;
import com.exampe.demo.model.Product;
import com.exampe.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService service;
	
	
	@PostMapping("/product")
	public ResponseEntity<Product> createNewProduct(@RequestBody Product product) {
		
		Product p = service.createProduct(product);
		
		if(p==null) {
			
		}
		return new ResponseEntity<Product>(p,HttpStatus.CREATED);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> searchEmployee(@PathVariable int id) throws NotFoundException {
		
		Product product = service.findProduct(id);
			
			if(product==null) {
				throw new NotFoundException("Product does not exist with this id"); 
				
			}
			
		
		return new ResponseEntity<Product>(product,HttpStatus.FOUND);
	}
	
	
	@PutMapping("/product")
	public ResponseEntity<Product> updateEmployee(@RequestBody Product product) throws NotFoundException {
		Product p =  service.updateProduct(product);
		
		if(product==null) {
			throw new NotFoundException("Product is not updated");
		}
		
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	
	@GetMapping("/product")
	public List<Product> getAllProduct() throws NotFoundException{
		
		List<Product> lst = service.getAllProduct();
		if(lst.size()==0)
			throw new NotFoundException("No Records Found");
		return lst;
	
	}
	
	
}
