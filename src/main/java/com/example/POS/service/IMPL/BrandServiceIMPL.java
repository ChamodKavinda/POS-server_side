package com.example.POS.service.IMPL;

import com.example.POS.dto.BrandDTOSave;
import com.example.POS.entity.Brand;
import com.example.POS.repo.BrandRepo;
import com.example.POS.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceIMPL implements BrandService {

    @Autowired
    private BrandRepo brandRepo;

    @Override
    public String saveBrand(BrandDTOSave brandDTOSave) {
        Brand brand = new Brand(brandDTOSave.getBrand_name(), brandDTOSave.isActive());
        brandRepo.save(brand);
        return brand.getBrand_name();
    }
}