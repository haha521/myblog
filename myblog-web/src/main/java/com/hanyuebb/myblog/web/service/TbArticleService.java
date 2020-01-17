package com.hanyuebb.myblog.web.service;

import com.hanyuebb.myblog.common.domain.BaseDomain;
import com.hanyuebb.myblog.common.domain.TbArticle;
import com.hanyuebb.myblog.common.domain.TbArticleContent;
import com.hanyuebb.myblog.common.service.BaseService;
import com.hanyuebb.myblog.web.dto.ArticleAndContent;

/**
 * ClassName:TbArticleService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:57
 * @auther:zh
 */
public interface TbArticleService<T extends BaseDomain> extends BaseService<T>{

    //插入文章的基本信息和文章内容
    int insertBaseContent(TbArticle tbArticle, TbArticleContent tbArticleContent);

    //查询文章的所有内容
    ArticleAndContent selectByPrimaryKeyAll(Object o);

    //级联删除
    int deleteByPrimaryKeyAll(Object o);

    //更新所有信息
    int updateByPrimaryKeyAll(TbArticle tbArticle, TbArticleContent tbArticleContent);
}
