package com.hanyuebb.myblog.web.service.impl;

import com.hanyuebb.myblog.common.domain.TbNotice;
import com.hanyuebb.myblog.common.mapper.TbNoticeMapper;
import com.hanyuebb.myblog.common.service.impl.BaseServiceImpl;
import com.hanyuebb.myblog.web.service.TbNoticeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:TbNoticeService
 * Package:com.hanyuebb.myblog.web.service
 * Description:
 *
 * @date:2020/1/16 12:00
 * @auther:zh
 */
@Service
@Transactional(readOnly = true)
public class TbNoticeServiceImpl extends BaseServiceImpl<TbNotice, TbNoticeMapper> implements TbNoticeService<TbNotice> {
}
