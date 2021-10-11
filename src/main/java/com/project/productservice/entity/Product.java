package com.project.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class Product implements Comparable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private int productId;
	
	@Column(name = "productname")
	private  String productName;
	
	@Column(name = "price")
	private  int price;
	
	@Column(name = "discount")
	private  int discount;
	
	@Column(name = "description")
	private  String description;

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(Object o) {
		   Product p = (Product) o;
		   if(this.getProductId()<p.getProductId())
			   return 1;
		   if(this.getProductId()>p.getProductId())
			   return -1;
		   else 
			   return 0;
		  
	}
	
}
