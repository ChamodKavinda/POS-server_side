package com.example.POS.entity;


import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="cat_id",length = 11)
    private int cat_id;

    @Column(name="cat_name",length = 45)
    private String cat_name;

    @Column(name="active",columnDefinition = "TINYINT default 1")
    private boolean active;


    public Category(int cat_id, String cat_name, boolean active) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.active = active;
    }

    public Category(String cat_name, boolean active) {
        this.cat_name = cat_name;
        this.active = active;
    }

    public Category() {
    }

    public int getCatid() {
        return cat_id;
    }

    public void setCatid(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCatname() {
        return cat_name;
    }

    public void setCatname(String cat_name) {
        this.cat_name = cat_name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cat_id=" + cat_id +
                ", cat_name='" + cat_name + '\'' +
                ", active=" + active +
                '}';
    }
}
