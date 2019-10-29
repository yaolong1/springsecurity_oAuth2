package com.yaolong.oauth2.server.service;

import com.yaolong.oauth2.server.domain.TbUser;

/**
    * 
    * @author yaoLong
    * @date 2019/10/28  20:27
    * 
    *
    */
public interface TbUserService{

     TbUser getByUsername(String username);

}
