package com.yaolong.oauth2.server.service;

import com.yaolong.oauth2.server.domain.TbPermission;

import java.util.List;

/**
    * 
    * @author yaoLong
    * @date 2019/10/28  20:44
    * 
    *
    */
public interface TbPermissionService{
     List<TbPermission> selectByUserId(Long userId);
}
