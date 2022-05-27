package com.example.blog.service;

import com.example.blog.vo.Result;
import com.example.blog.vo.TagVo;

import java.util.List;


public interface TagService {
    List<TagVo> findTagsByArticleId(Long id);


    Result hots(int limit);
}
