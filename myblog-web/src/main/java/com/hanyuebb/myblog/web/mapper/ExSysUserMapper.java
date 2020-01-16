package com.hanyuebb.myblog.web.mapper;

import com.hanyuebb.myblog.common.domain.SysUser;
import com.hanyuebb.myblog.common.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
public interface ExSysUserMapper extends MyMapper<SysUser> {
}