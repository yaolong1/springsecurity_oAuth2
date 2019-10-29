package com.yaolong.oauth2.resource.controller;

import com.yaolong.oauth2.resource.domain.TbContent;
import com.yaolong.oauth2.resource.dto.ResponseResult;
import com.yaolong.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaoLong
 * @date 2019/10/29  14:43
 */
@RestController
public class TbContentController {
    @Autowired
    private TbContentService tbContentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> list(){
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()),HttpStatus.OK.toString(),tbContentService.selectAll());
    }
}
