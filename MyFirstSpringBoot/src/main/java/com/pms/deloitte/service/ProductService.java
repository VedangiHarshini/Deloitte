package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import com.pms.deloitte.model.Product;

public interface ProductService {
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(int productId);
	public List<Product> searchByProductName(String productName);
	public List<Product>  searchByPriceRange(int minimum,int maximum);
	public List<Product>  quantityGreaterThan(int quantity);
	
	
	

}
