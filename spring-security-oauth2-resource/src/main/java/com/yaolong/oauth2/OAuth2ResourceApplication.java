package com.yaolong.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author yaoLong
 * @date 2019/10/28  23:54
 */
@SpringBootApplication
@MapperScan("com.yaolong.oauth2.resource.mapper")
public class OAuth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class,args);
    }
}
