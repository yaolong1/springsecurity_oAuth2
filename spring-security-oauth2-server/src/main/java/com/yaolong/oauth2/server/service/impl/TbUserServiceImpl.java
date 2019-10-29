package com.yaolong.oauth2.server.service.impl;

import com.yaolong.oauth2.server.domain.TbUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yaolong.oauth2.server.mapper.TbUserMapper;
import com.yaolong.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

/**
    * 
    * @author yaoLong
    * @date 2019/10/28  20:27
    * 
    *
    */
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

     @Override
     public TbUser getByUsername(String username) {
         Example example = new Example(TbUser.class);
         example.createCriteria().andEqualTo("username",username);

         return tbUserMapper.selectOneByExample(example);
     }
 }
