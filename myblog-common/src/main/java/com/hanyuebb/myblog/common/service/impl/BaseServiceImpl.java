package com.hanyuebb.myblog.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hanyuebb.myblog.common.domain.BaseDomain;
import com.hanyuebb.myblog.common.service.BaseService;
import com.hanyuebb.myblog.common.utils.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:BaseServiceImpl
 * Package:com.hanyuebb.myblog.common.service.impl
 * Description:
 *
 * @date:2020/1/16 11:13
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseDomain,D extends MyMapper<T>> implements BaseService<T> {

    @Autowired
    private D dao;

    @Override
    @Transactional(readOnly = false)
    public int insert(T t) {
        return dao.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int deleteByPrimaryKey(Object o) {
        return dao.deleteByPrimaryKey(o);
    }

    @Override
    @Transactional(readOnly = false)
    public int updateByPrimaryKey(T t) {
        return dao.updateByPrimaryKey(t);
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return dao.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T t) {
        return dao.selectCount(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize,T t) {
        PageHelper pageHelper = new PageHelper();
        pageHelper.startPage(pageNum,pageSize);

        PageInfo<T> pageInfo = new PageInfo<T>(dao.select(t));
        return pageInfo;
    }
}
