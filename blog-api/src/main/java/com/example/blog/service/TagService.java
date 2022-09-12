package com.example.blog.service;

import com.example.blog.vo.Result;
import com.example.blog.vo.TagVo;

import java.util.List;


public interface TagService {
    List<TagVo> findTagsByArticleId(Long id);


    Result hots(int limit);

    //查询所有的文章标签
    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
