package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbArticleType;
import com.hanyuebb.myblog.common.mapper.TbArticleTypeMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbArticleTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbArticleTypeService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:59
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbArticleTypeServiceImpl extends BaseServiceImpl<TbArticleType, TbArticleTypeMapper> implements TbArticleTypeService<TbArticleType> {
}
