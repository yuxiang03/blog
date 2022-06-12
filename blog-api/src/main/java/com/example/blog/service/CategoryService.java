package com.example.blog.service;

import com.example.blog.vo.CategoryVo;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);
}
