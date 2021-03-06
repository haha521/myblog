package com.hanyuebb.myblog.common.service;

import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.BaseDomain;

/**
 * ClassName:BaseService
 * Package:com.hanyuebb.myblog.common.service
 * Description:
 *
 * @date:2020/1/16 11:06
 * @auther:zh
 */
public interface BaseService<T extends BaseDomain> {
    int insert(T t);

    int deleteByPrimaryKey(Object o);

    int updateByPrimaryKey(T t);

    T selectByPrimaryKey(Object o);

    int selectCount(T t);

    PageInfo<T> page(int pageNum,int pageSize,T t);
}
