package com.project.productservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.productservice.entity.Product;
import com.project.productservice.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
    ProductRepository productRepository;

	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}
/*
	public List<Product> getAllProducts() {
		
		List<Product> products = productRepository.findAll();
		// return the product hose price >=10000 and <15000
		// discount is = 10%
		
	/*	List<Product> filterList = new ArrayList<Product>();
		for(Product p: products) {
	    if((p.getPrice()>=10000 && p.getPrice()<15000) && p.getDiscount()==10){
	           filterList.add(p);
		}
		
	}
		Collections.sort(filterList);
	
       return filterList;
	}
	public Product getProductById(int id) {
	
		return productRepository.findById(id).get();
	}
	*/
}