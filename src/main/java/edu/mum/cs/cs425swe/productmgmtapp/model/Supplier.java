package edu.mum.cs.cs425swe.productmgmtapp.model;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid", unique = true, nullable = false)
    private Integer sid;
    @Column(unique = true, nullable = false)
    private long supplier_number;
    @Column(nullable = false)
    private String supplier_name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;

    public Supplier(long supplier_number, String supplier_name, String address, String phone) {
        this.supplier_number = supplier_number;
        this.supplier_name = supplier_name;
        this.address = address;
        this.phone = phone;
    }

    public Supplier() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public long getSupplier_number() {
        return supplier_number;
    }

    public void setSupplier_number(long supplier_number) {
        this.supplier_number = supplier_number;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "sid=" + sid +
                ", supplier_number=" + supplier_number +
                ", supplier_name='" + supplier_name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
