package com.hanyuebb.myblog.web.controller;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.domain.TbLam;
import com.hanyuebb.myblog.common.domain.TbNotice;
import com.hanyuebb.myblog.common.result.BaseResult;
import com.hanyuebb.myblog.common.result.BaseResultBulider;
import com.hanyuebb.myblog.common.result.ResultCode;
import com.hanyuebb.myblog.web.service.TbLamService;
import com.hanyuebb.myblog.web.service.TbNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:TbNoticeController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/17 17:27
 * @auther:zh
 */
@RestController
@RequestMapping(value = "v1/notice")
public class TbNoticeController {

    @Autowired
    TbNoticeService tbNoticeService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false) TbNotice tbNotice
    ) {
        PageInfo pageInfo = tbNoticeService.page(pageNum,pageSize,tbNotice);
        List<TbNotice> list = pageInfo.getList();
        return BaseResultBulider.success(list, ResultCode.SUCCESS);
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public BaseResult insert(
            @RequestParam(required = true)TbNotice tbNotice
    ){
        Integer integer = tbNoticeService.insert(tbNotice);
        return BaseResultBulider.successNoData(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{noticeId}",method = RequestMethod.GET)
    public BaseResult selectByPrimaryKey(
            @PathVariable(required = true) Integer noticeId){
        TbNotice tbNotice = (TbNotice) tbNoticeService.selectByPrimaryKey(noticeId);
        return BaseResultBulider.success(tbNotice,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "count",method = RequestMethod.GET)
    public BaseResult selectCount(
            @RequestParam(required = true) TbNotice tbNotice){
        Integer count = tbNoticeService.selectCount(tbNotice);
        return BaseResultBulider.success(count,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{noticeId}",method = RequestMethod.DELETE)
    public BaseResult deleteByPrimaryKey(
            @PathVariable(required = true) Integer noticeId){
        Integer result = tbNoticeService.deleteByPrimaryKey(noticeId);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }

    @RequestMapping(value = "{noticeId}",method = RequestMethod.PUT)
    public BaseResult updateByPrimaryKey(
            @PathVariable(required = true) long noticeId,
            @RequestParam(required = true) TbNotice tbNotice
    ){
        tbNotice.setNoticeId(noticeId);
        Integer result = tbNoticeService.updateByPrimaryKey(tbNotice);
        return BaseResultBulider.success(result,ResultCode.SUCCESS);
    }
}
