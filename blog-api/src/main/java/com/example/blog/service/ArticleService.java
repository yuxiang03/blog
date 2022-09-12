package com.example.blog.service;

import com.example.blog.vo.Result;
import com.example.blog.vo.params.ArticleParam;
import com.example.blog.vo.params.PageParams;

public interface ArticleService {

    //分页查询 文章列表
    Result listArticle(PageParams pageParams);

    //最热文章
    Result hotArticle(int limit);

    //最新文章
    Result newArticles(int limit);

    //文章归档
    Result listArticles();

    //查看文章详情
    Result findArticleById(Long articleId);

    //发布文章
    Result publish(ArticleParam articleParam);
}
