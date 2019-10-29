package com.yaolong.oauth2.server.service.impl;

import com.yaolong.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yaolong.oauth2.server.mapper.TbPermissionMapper;
import com.yaolong.oauth2.server.service.TbPermissionService;

import java.util.List;

/**
    * 
    * @author yaoLong
    * @date 2019/10/28  20:44
    * 
    *
    */
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
