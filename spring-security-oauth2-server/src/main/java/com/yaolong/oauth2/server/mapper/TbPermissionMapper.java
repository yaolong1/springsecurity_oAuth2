package com.yaolong.oauth2.server.mapper;

import com.yaolong.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
    * 
    * @author yaoLong
    * @date 2019/10/28  20:44
    * 
    *
    */
public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}