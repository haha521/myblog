package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.domain.TbArticleType;
import com.hanyuebb.myblog.common.domain.TbLam;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.service.TbArticleTypeService;
import com.hanyuebb.myblog.web.service.TbLamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:TbArticleTypeController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/17 17:38
 * @auther:zh
 */
@RestController
@RequestMapping(value = "/v1/type")
public class TbArticleTypeController {

    @Autowired
    TbArticleTypeService tbArticleTypeService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) TbArticleType tbArticleType
    ) {
        PageInfo pageInfo = tbArticleTypeService.page(pageNum,pageSize,tbArticleType);
        List<TbArticleType> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)TbArticleType tbArticleType
    ){
        Integer integer = tbArticleTypeService.insert(tbArticleType);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{atypeId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) Integer atypeId){
        TbArticleType tbArticleType = (TbArticleType) tbArticleTypeService.selectByPrimaryKey(atypeId);
        return BaseResultBulider.success(tbArticleType,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true) TbArticleType tbArticleType){
        Integer count = tbArticleTypeService.selectCount(tbArticleType);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{atypeId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer atypeId){
        Integer result = tbArticleTypeService.deleteByPrimaryKey(atypeId);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{atypeId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) long atypeId,
            @RequestParam(required = true) TbArticleType tbArticleType
    ){
        tbArticleType.setAtypeId(atypeId);
        Integer result = tbArticleTypeService.updateByPrimaryKey(tbArticleType);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }
}
