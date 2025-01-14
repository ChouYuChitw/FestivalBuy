package com.festivalbuy.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festivalbuy.market.ProductService;
import com.festivalbuy.market.entity.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	Iterable<Product> getProducts() {
		return productService.getProductList();
	}
	
	@GetMapping("/{id}")
	Product getProduct(@PathVariable Integer id) {		
		return productService.findProductById(id);
	}
}
