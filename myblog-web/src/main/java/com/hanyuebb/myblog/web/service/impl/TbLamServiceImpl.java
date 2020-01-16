package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbLam;
import com.hanyuebb.myblog.common.mapper.TbLamMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbLamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbLamService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:59
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbLamServiceImpl extends BaseServiceImpl<TbLam, TbLamMapper> implements TbLamService<TbLam> {
}
