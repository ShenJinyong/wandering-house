package com.simpleteen.wandering.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.simpleteen.wandering.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
