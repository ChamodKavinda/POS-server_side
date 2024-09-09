package com.example.POS.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="brand_id",length = 11)
    private int brand_id;

    @Column(name="brand_name",length = 45)
    private String brand_name;

    @Column(name="active",columnDefinition = "TINYINT default 1")
    private boolean active;

    public Brand(int brand_id, String brand_name, boolean active) {
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.active = active;
    }

    public Brand(String brand_name, boolean active) {
        this.brand_name = brand_name;
        this.active = active;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", active=" + active +
                '}';
    }
}
