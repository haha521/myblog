package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.domain.TbLam;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.service.TbLamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:TbLamController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/17 17:11
 * @auther:zh
 */
@RestController
@RequestMapping(value = "v1/lam")
public class TbLamController {

    @Autowired
    TbLamService tbLamService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) TbLam tbLam
    ) {
        PageInfo pageInfo = tbLamService.page(pageNum,pageSize,tbLam);
        List<TbLam> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)TbLam tbLam
    ){
        Integer integer = tbLamService.insert(tbLam);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{lamId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) Integer lamId){
        TbLam tbLam = (TbLam) tbLamService.selectByPrimaryKey(lamId);
        return BaseResultBulider.success(tbLam,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true)TbLam tbLam){
        Integer count = tbLamService.selectCount(tbLam);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{lamId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer lamId){
        Integer result = tbLamService.deleteByPrimaryKey(lamId);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{lamId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) long lamId,
            @RequestParam(required = true) TbLam tbLam
    ){
        tbLam.setLamId(lamId);
        Integer result = tbLamService.updateByPrimaryKey(tbLam);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }
}

