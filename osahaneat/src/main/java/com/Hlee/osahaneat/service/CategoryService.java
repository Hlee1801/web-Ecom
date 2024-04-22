package com.Hlee.osahaneat.service;

import com.Hlee.osahaneat.dto.CategoryDTO;
import com.Hlee.osahaneat.dto.MenuDTO;
import com.Hlee.osahaneat.entity.Category;
import com.Hlee.osahaneat.entity.Food;
import com.Hlee.osahaneat.repository.CategoryRepository;
import com.Hlee.osahaneat.service.impl.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements CategoryServiceImp {
    @Autowired
    CategoryRepository categoryRepository;

    @Cacheable("CategoryHome")
    @Override
    public List<CategoryDTO> getCategoryHomepage() {
        System.out.println("Kiem tra cache");
        PageRequest pageRequest = PageRequest.of(0,2);
        List<Category> categoryList = categoryRepository.findAll();
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for(Category i : categoryList){
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setName_cate(i.getNameCate());
            categoryDTO.setFreeship(i.isFreeship());
            List<MenuDTO> menuDTOList = new ArrayList<>();
            for (Food j : i.getListFood()){
                MenuDTO menuDTO = new MenuDTO();
                menuDTO.setImage(j.getImage());
                menuDTO.setTitle(j.getTitle());

                menuDTOList.add(menuDTO);
                categoryDTO.setListMenuDTO(menuDTOList);
            }
            categoryDTOList.add(categoryDTO);
        }
        return categoryDTOList;
    }
}
