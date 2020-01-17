package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.domain.TbArticle;
import com.hanyuebb.myblog.common.domain.TbArticleContent;
import com.hanyuebb.myblog.common.domain.TbArticleType;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.dto.ArticleAndContent;
import com.hanyuebb.myblog.web.service.TbArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:TbArticleController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/17 16:18
 * @auther:zh
 */
@RestController
@RequestMapping(value = "v1/article")
public class TbArticleController {
    @Autowired
    TbArticleService tbArticleService;


    //分页查询文章的基本信息
    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) TbArticle tbArticle
    ) {
        PageInfo pageInfo = tbArticleService.page(pageNum,pageSize,tbArticle);
        List<TbArticle> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    //写入一篇文章，还有文章内容,分类信息
    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)TbArticle tbArticle,
            @RequestParam(required = true)TbArticleContent tbArticleContent
            ){
        int i = tbArticleService.insertBaseContent(tbArticle, tbArticleContent);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }



    //显示一篇文章的所有内容
    @RequestMapping(value = "/{articleId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKeyAll(
            @PathVariable(required = true) Integer articleId){
        ArticleAndContent articleAndContent = tbArticleService.selectByPrimaryKeyAll(articleId);
        return BaseResultBulider.success(articleAndContent,ResultCode.SUCCESS);
    }

    //显示一篇文章的基本内容
    @RequestMapping(value = "/base/{articleId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) Integer articleId){
        return BaseResultBulider.success(tbArticleService.selectByPrimaryKey(articleId),ResultCode.SUCCESS);
    }

    //显示此类文章的数量
    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true)TbArticle tbArticle){
        Integer count = tbArticleService.selectCount(tbArticle);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    //删除文章信息，需要级联删除，包括文章内容，文章的评论都需要删除
    @RequestMapping(value = "{articleId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer articleId){
        int i = tbArticleService.deleteByPrimaryKeyAll(articleId);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    //更新文章的所有信息，包括基本信息和文章内容
    @RequestMapping(value = "{articleId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) Integer articleId,
            @RequestParam(required = true) TbArticle tbArticle,
            @RequestParam(required = true) TbArticleContent tbArticleContent
    ){
        tbArticleService.updateByPrimaryKeyAll(tbArticle,tbArticleContent);
        return BaseResultBulider.success(articleId,ResultCode.SUCCESS);
    }
}
