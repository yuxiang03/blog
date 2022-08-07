package com.example.blog.dao.pojo;

import lombok.Data;

@Data
public class Article {
    public static final int Article_TOP = 1;

    public static final int Article_Common = 0;

    private Long id;

    private String title;

    private String summary;

    //ArticleVo 是返回前的最终范性约束，更改此类中的数据类型同时要更改ArtivleVo
    private Integer commentCounts;

    private Integer viewCounts;

    //作者id
    private Long authorId;

    //内容id
    private Long bodyId;

    //类别id
    private Long categoryId;

    //置顶
    private Integer weight;

    //创建时间
    private Long createDate;

}
