package com.example.POS.service;

import com.example.POS.dto.CategoryDTO;
import com.example.POS.dto.CategoryDTOSave;

import java.util.List;

public interface CategoryService {
    String addCategory(CategoryDTOSave categoryDTOSave);

    List<CategoryDTO> getAllCategory();
}
