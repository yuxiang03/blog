package com.example.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.dao.dos.Archives;
import com.example.blog.dao.pojo.Article;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();

}
