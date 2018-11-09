package edu.mum.cs.cs425.MyProductsMgmtWebApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.MyProductsMgmtWebApp.model.Product;
import edu.mum.cs.cs425.MyProductsMgmtWebApp.repository.ProductRepository;
import edu.mum.cs.cs425.MyProductsMgmtWebApp.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product findOne(Long id) {
		
		return productRepository.findOne(id);
	}

	@Override
	public void delete(Long id) {
		productRepository.delete(id);
		
	}	
}
