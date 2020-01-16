package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbArticle;
import com.hanyuebb.myblog.common.mapper.TbArticleMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbArticleService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:57
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbArticleServiceImpl extends BaseServiceImpl<TbArticle, TbArticleMapper> implements TbArticleService<TbArticle> {
}
