package com.example.POS.service.IMPL;

import com.example.POS.dto.CategoryDTOSave;
import com.example.POS.entity.Category;
import com.example.POS.repo.CategoryRepo;
import com.example.POS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceIMPL implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public String addCategory(CategoryDTOSave categoryDTOSave) {
        Category category = new Category(categoryDTOSave.getCat_name(), categoryDTOSave.isActive());
                categoryRepo.save(category);
                return category.getCatname();
    }
}
