package com.project.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.productservice.entity.Product;
import com.project.productservice.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@PostMapping(path = "/products")
	public Product createProduct(@RequestBody Product product) {

		return productService.createProduct(product);
	}
	
	@GetMapping(path = "/products")
	public List<Product> getProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping(path = "/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
		
	}
	
	@DeleteMapping(path = "/products/{id}")
	public void deleteProductById(@PathVariable int id) {
		productService.deleteProductById(id);
	}

}
