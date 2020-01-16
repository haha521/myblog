package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.mapper.SysUserMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:SysUserServiceImpl
 * Package:com.hanyuebb.myblog.web.service.impl
 * Description:
 *
 * @date:2020/1/16 11:51
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserMapper> implements SysUserService<SysUser> {
}
