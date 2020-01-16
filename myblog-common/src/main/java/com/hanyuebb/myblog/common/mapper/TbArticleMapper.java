package com.hanyuebb.myblog.common.mapper;

import com.hanyuebb.myblog.common.domain.TbArticle;
import com.hanyuebb.myblog.common.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TbArticleMapper extends MyMapper<TbArticle> {
}