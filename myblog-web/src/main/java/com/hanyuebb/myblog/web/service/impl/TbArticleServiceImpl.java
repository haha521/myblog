package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbArticle;
import com.hanyuebb.myblog.common.domain.TbArticleContent;
import com.hanyuebb.myblog.common.domain.TbArticleType;
import com.hanyuebb.myblog.common.mapper.TbArticleMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.dto.ArticleAndContent;
import com.hanyuebb.myblog.web.mapper.ExTbArticleContentMapper;
import com.hanyuebb.myblog.web.mapper.ExTbArticleDiscussMapper;
import com.hanyuebb.myblog.web.mapper.ExTbArticleMapper;
import com.hanyuebb.myblog.web.mapper.ExTbArticleTypeMapper;
import com.hanyuebb.myblog.web.service.TbArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName:TbArticleService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:57
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbArticleServiceImpl extends BaseServiceImpl<TbArticle, TbArticleMapper> implements TbArticleService<TbArticle> {

    @Autowired
    ExTbArticleMapper exTbArticleMapper;

    @Autowired
    ExTbArticleContentMapper exTbArticleContentMapper;

    @Autowired
    ExTbArticleDiscussMapper exTbArticleDiscussMapper;

    @Autowired
    ExTbArticleTypeMapper exTbArticleTypeMapper;

    @Override
    @Transactional(readOnly = false)
    public int insertBaseContent(TbArticle tbArticle, TbArticleContent tbArticleContent) {
        Integer integer = exTbArticleMapper.insert(tbArticle);
        Integer integer1 = exTbArticleContentMapper.insert(tbArticleContent);
        return 1;
    }

    @Override
    @Transactional(readOnly = true)
    public ArticleAndContent selectByPrimaryKeyAll(Object o) {
        TbArticle tbArticle = exTbArticleMapper.selectByPrimaryKey(o);
        TbArticleContent tbArticleContent = exTbArticleContentMapper.selectOneByExample(o);
        TbArticleType tbArticleType = exTbArticleTypeMapper.selectOneByExample(o);
        ArticleAndContent articleAndContent = new ArticleAndContent();
        articleAndContent.setAcontentContent(tbArticleContent.getAcontentContent());
        articleAndContent.setAcontentId(tbArticleContent.getAcontentId());
        articleAndContent.setArticleId(tbArticle.getArticleId());
        articleAndContent.setArticleSummary(tbArticle.getArticleSummary());
        articleAndContent.setAtypeType(tbArticleType.getAtypeType());
        articleAndContent.setArticleTitle(tbArticle.getArticleTitle());
        articleAndContent.setAtypeId(tbArticleType.getAtypeId());
        articleAndContent.setCreateBy(tbArticle.getCreateBy());
        articleAndContent.setModifiedBy(tbArticle.getModifiedBy());
        return articleAndContent;
    }

    @Override
    @Transactional(readOnly = false)
    public int deleteByPrimaryKeyAll(Object o) {
        int i = exTbArticleContentMapper.deleteByExample(o);
        int i1 = exTbArticleMapper.deleteByPrimaryKey(o);
        int i2 = exTbArticleDiscussMapper.deleteByExample(o);
        return 1;
    }

    @Override
    public int updateByPrimaryKeyAll(TbArticle tbArticle, TbArticleContent tbArticleContent) {
        int i = exTbArticleMapper.updateByPrimaryKey(tbArticle);
        int i1 = exTbArticleContentMapper.updateByPrimaryKey(tbArticleContent);
        return 1;
    }
}
