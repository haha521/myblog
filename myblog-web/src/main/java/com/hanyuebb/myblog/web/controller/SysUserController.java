package com.hanyuebb.myblog.web.controller;

import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.web.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:SysUserController
 * Package:com.hanyuebb.myblog.web.controller
 * Description:
 *
 * @date:2020/1/16 12:52
 * @auther:zh
 */
@Controller
public class SysUserController {

    @Autowired
    SysUserService sysUserService;


    @ResponseBody
    @RequestMapping(value="/addUser4/{username}/{password}",method=RequestMethod.GET)
    public String addUser4(@PathVariable String username,@PathVariable String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "demo/index";
    }
}
