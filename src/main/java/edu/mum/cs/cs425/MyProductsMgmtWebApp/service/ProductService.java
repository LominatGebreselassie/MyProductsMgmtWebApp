package edu.mum.cs.cs425.MyProductsMgmtWebApp.service;

import java.util.List;

import edu.mum.cs.cs425.MyProductsMgmtWebApp.model.Product;


public interface ProductService {
	 List<Product> findAll();
	 Product save(Product student);
	 Product findOne(Long id);
	 void delete(Long id);
}
