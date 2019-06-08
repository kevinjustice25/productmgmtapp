package edu.mum.cs.cs425swe.productmgmtapp;

import edu.mum.cs.cs425swe.productmgmtapp.model.Product;
import edu.mum.cs.cs425swe.productmgmtapp.model.Supplier;
import edu.mum.cs.cs425swe.productmgmtapp.repository.ProductRepository;
import edu.mum.cs.cs425swe.productmgmtapp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProductmgmtappApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    SupplierRepository supplierRepository;
    public Product saveProduct(Product product){
        productRepository.save(product);
        return product;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductmgmtappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello Product Manager This is an App For You! :)");
        Supplier apple = new Supplier(1, "Apple", "102 Apple Blvd", "8001111545");
        Product product = new Product(1001, "iPhone S Max", (float) 1500.00, LocalDate.of(2018, 10, 24), 1);
        Product product1 = new Product(1001, "iPhone X", (float) 1000.00, LocalDate.of(2018, 6, 4), 1);
        Product product2;
        supplierRepository.save(apple);
        saveProduct(product);
        saveProduct(product1);
        for (int i = 1; i <= 2; i++) {
            product2 = productRepository.findById(i).get();
            System.out.println(product2.getProductName() + " " + product2.getUnitPrice());
        }
    }
}
