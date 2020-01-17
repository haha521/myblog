package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.TbArticleDiscuss;
import com.hanyuebb.myblog.common.domain.TbLam;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.service.TbArticleDiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:TbArticleDiscussController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/17 17:47
 * @auther:zh
 */
@RestController
@RequestMapping(value = "v1/discuss")
public class TbArticleDiscussController {
    @Autowired
    TbArticleDiscussService tbArticleDiscussService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) TbArticleDiscuss tbArticleDiscuss
    ) {
        PageInfo pageInfo = tbArticleDiscussService.page(pageNum,pageSize,tbArticleDiscuss);
        List<TbLam> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)TbArticleDiscuss tbArticleDiscuss
    ){
        Integer integer = tbArticleDiscussService.insert(tbArticleDiscuss);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{adiscussId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) Integer adiscussId){
        TbArticleDiscuss tbArticleDiscuss = (TbArticleDiscuss) tbArticleDiscussService.selectByPrimaryKey(adiscussId);
        return BaseResultBulider.success(tbArticleDiscuss,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true)TbArticleDiscuss tbArticleDiscuss){
        Integer count = tbArticleDiscussService.selectCount(tbArticleDiscuss);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{adiscussId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer adiscussId){
        Integer result = tbArticleDiscussService.deleteByPrimaryKey(adiscussId);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{adiscussId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) long adiscussId,
            @RequestParam(required = true) TbArticleDiscuss tbArticleDiscuss
    ){
        tbArticleDiscuss.setAdiscussId(adiscussId);
        Integer result = tbArticleDiscussService.updateByPrimaryKey(tbArticleDiscuss);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }
}
