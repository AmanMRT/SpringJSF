package com.exampe.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exampe.demo.model.Product;

@Repository
public class InMemoryProductRepsoitory implements ProductRepository{
	
	HashMap<Integer, Product> product = new HashMap<Integer, Product>();
	private int currentId=1;
	

	@Override
	public Product createProduct(Product p) {
		int id  = currentId++;
		
		p.setPid(id);
		product.put(id, p);

	return p;
	}

	@Override
	public List<Product> list() {
	
		return new ArrayList<Product>(product.values());
	}

	@Override
	public Product update(Product product) {
		
		if(find(product.getPid())==null) {
			return null;
		}
		Product updateProduct = new Product();
		updateProduct.setPid(product.getPid());
		updateProduct.setPname(product.getPname());
		updateProduct.setPprice(product.getPprice());
		this.product.replace(product.getPid(), updateProduct);
		return updateProduct;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		product.remove(id);
		
	}

	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		return product.get(id);
	}

	
}
