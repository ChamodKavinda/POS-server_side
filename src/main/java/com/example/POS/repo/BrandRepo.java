package com.example.POS.repo;

import com.example.POS.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepo extends JpaRepository<Brand,Integer> {
}
