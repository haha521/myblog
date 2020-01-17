package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.mapper.SysUserMapper;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.mapper.ExSysUserMapper;
import com.hanyuebb.myblog.web.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:SysUserController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/16 20:29
 * @auther:zh
 */

@RestController
@RequestMapping(value = "v1/user")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) SysUser sysUser
    ) {
        PageInfo pageInfo = sysUserService.page(pageNum,pageSize,sysUser);
        List<SysUser> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)SysUser sysUser
    ){
        sysUserService.insert(sysUser);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{userId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) int userId){
        SysUser sysUser1 = (SysUser) sysUserService.selectByPrimaryKey(userId);
        return BaseResultBulider.success(sysUser1,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true)SysUser sysUser){
        Integer count = sysUserService.selectCount(sysUser);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{userId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer userId){
        Integer result = sysUserService.deleteByPrimaryKey(userId);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{userId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) Integer userId,
            @RequestParam(required = true) SysUser sysUser
    ){
        sysUser.setUserId(userId);
        Integer result = sysUserService.updateByPrimaryKey(sysUser);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

}
