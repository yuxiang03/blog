package com.example.blog.service;

import com.example.blog.vo.Result;
import com.example.blog.vo.params.CommentParam;

public interface CommentsService {
    //根据文章id查询所有的评论列表
    Result commentByArticleId(Long id);

    Result comment(CommentParam commentParam);
}
