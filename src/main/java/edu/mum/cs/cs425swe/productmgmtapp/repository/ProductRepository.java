package edu.mum.cs.cs425swe.productmgmtapp.repository;

import edu.mum.cs.cs425swe.productmgmtapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
}
