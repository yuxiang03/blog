package com.example.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    //根据文章id查询标签列表
    List<Tag> findTagsByArticleId(Long articleId);

    //查询根据tag_id分组 计数，从大到小排列取前limit个
    List<Long> findHotsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}
