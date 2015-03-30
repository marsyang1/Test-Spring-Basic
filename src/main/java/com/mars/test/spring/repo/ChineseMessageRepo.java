package com.mars.test.spring.repo;

import org.springframework.stereotype.Repository;

@Repository
public class ChineseMessageRepo implements MessageRepo {


    @Override
    public String getMessage() {
        return "你好";
    }
}