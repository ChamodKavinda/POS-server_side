package com.example.POS.contoller;

import com.example.POS.dto.BrandDTOSave;
import com.example.POS.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/brand")
@RestController
@CrossOrigin
public class BrandController {

    @Autowired
    BrandService brandService;

    @PostMapping(path="/save")
    public String saveBrand(@RequestBody BrandDTOSave brandDTOSave){
        String brandSave = brandService.saveBrand(brandDTOSave);
        return brandSave;
    }
}
