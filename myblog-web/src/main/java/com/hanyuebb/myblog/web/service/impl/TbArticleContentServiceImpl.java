package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbArticleContent;
import com.hanyuebb.myblog.common.mapper.TbArticleContentMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbArticleContentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbArticleContentService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:58
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbArticleContentServiceImpl extends BaseServiceImpl<TbArticleContent, TbArticleContentMapper> implements TbArticleContentService<TbArticleContent> {
}
