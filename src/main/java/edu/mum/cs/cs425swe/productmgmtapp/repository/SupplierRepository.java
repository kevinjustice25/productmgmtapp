package edu.mum.cs.cs425swe.productmgmtapp.repository;

import edu.mum.cs.cs425swe.productmgmtapp.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
