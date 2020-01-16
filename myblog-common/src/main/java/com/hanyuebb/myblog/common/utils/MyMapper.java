package com.hanyuebb.myblog.common.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * ClassName:MyMapper
 * Package:com.hanyuebb.myblog.common.utils
 * Description:
 *
 * @date:2020/1/16 10:36
 * @auther:zh
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}