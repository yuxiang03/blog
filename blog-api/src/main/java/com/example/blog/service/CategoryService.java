package com.example.blog.service;

import com.example.blog.vo.CategoryVo;
import com.example.blog.vo.Result;

public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
