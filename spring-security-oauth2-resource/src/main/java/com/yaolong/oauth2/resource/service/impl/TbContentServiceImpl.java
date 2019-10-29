package com.yaolong.oauth2.resource.service.impl;

import com.yaolong.oauth2.resource.domain.TbContent;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yaolong.oauth2.resource.mapper.TbContentMapper;
import com.yaolong.oauth2.resource.service.TbContentService;

import java.util.List;

/**
    * 
    * @author yaoLong
    * @date 2019/10/29  14:28
    * 
    *
    */
@Service
public class TbContentServiceImpl implements TbContentService{

    @Resource
    private TbContentMapper tbContentMapper;

    @Override
    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }
}
