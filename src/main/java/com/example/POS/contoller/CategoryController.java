package com.example.POS.contoller;


import com.example.POS.dto.CategoryDTOSave;
import com.example.POS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/category")

public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(path = "/save")
    public String saveCategory(@RequestBody CategoryDTOSave categoryDTOSave){
        String cat_name = categoryService.addCategory(categoryDTOSave);
        return cat_name;
    }
}
