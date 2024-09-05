package com.example.POS.entity;


import jakarta.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="cat_id",length = 11)
    private int catid;

    @Column(name="cat_name",length = 45)
    private String catname;

    @Column(name="active",columnDefinition = "TINYINT default 1")
    private boolean active;
}
