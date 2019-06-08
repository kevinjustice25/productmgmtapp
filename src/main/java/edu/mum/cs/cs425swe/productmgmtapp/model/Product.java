package edu.mum.cs.cs425swe.productmgmtapp.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    @Column(name = "productNumber", nullable = false)
    private long productNumber;
    @Column(name = "productName", nullable = false)
    private String productName;
    @Column(name = "unitPrice", precision = 2, nullable = false)
    private float unitPrice;
    @Column(name = "dateMfg", nullable = false)
    private LocalDate dateMfg;
    @Column(nullable = false)
    private long supplier_number;

    public Product() {
    }

    public Product(long productNumber, String productName, float unitPrice, LocalDate dateMfg, long supplier_number) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.dateMfg = dateMfg;
        this.supplier_number = supplier_number;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDateMfg() {
        return dateMfg;
    }

    public void setDateMfg(LocalDate dateMfg) {
        this.dateMfg = dateMfg;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", dateMfg=" + dateMfg +
                '}';
    }
}
