package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbArticleDiscuss;
import com.hanyuebb.myblog.common.mapper.TbArticleDiscussMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbArticleDiscussService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbArticleDiscussService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 11:58
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbArticleDiscussServiceImpl extends BaseServiceImpl<TbArticleDiscuss, TbArticleDiscussMapper> implements TbArticleDiscussService<TbArticleDiscuss> {
}
