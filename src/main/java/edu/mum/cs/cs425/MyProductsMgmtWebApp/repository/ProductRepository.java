package edu.mum.cs.cs425.MyProductsMgmtWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.MyProductsMgmtWebApp.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findOne(Long id);

	void delete(Long id);
}
