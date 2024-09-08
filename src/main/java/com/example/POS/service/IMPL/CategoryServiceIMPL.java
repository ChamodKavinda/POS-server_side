package com.example.POS.service.IMPL;

import com.example.POS.dto.CategoryDTO;
import com.example.POS.dto.CategoryDTOSave;
import com.example.POS.dto.CategoryDTOUpdate;
import com.example.POS.entity.Category;
import com.example.POS.repo.CategoryRepo;
import com.example.POS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CategoryDTO> getAllCategory() {
        List<Category> getCategory = categoryRepo.findAll();
        List<CategoryDTO> categoryDtoList = new ArrayList<>();

        for (Category category: getCategory){
            CategoryDTO categoryDTO = new CategoryDTO(
                    category.getCatid(),
                    category.getCatname(),
                    category.isActive()
            );
            categoryDtoList.add(categoryDTO);
        }
        return categoryDtoList;
    }

    @Override
    public String updateCategory(CategoryDTOUpdate categoryDTOUpdate) {
        if (categoryRepo.existsById(categoryDTOUpdate.getCat_id())){
            Category category = categoryRepo.getById(categoryDTOUpdate.getCat_id());
            category.setCatname(categoryDTOUpdate.getCat_name());
            category.setActive(categoryDTOUpdate.isActive());
            categoryRepo.save(category);
        }else{
            System.out.println("update id not available");
        }
        return null;
    }

    @Override
    public boolean deleteCategory(int id) {
        if (categoryRepo.existsById(id)) {
            categoryRepo.deleteById(id);
            return true;
        }else{
            System.out.println("delete id not available");
        }
        return false;
    }
}
