package com.mars.test.spring.service;

import com.mars.test.spring.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Mars on 2015/3/30.
 */
@Service
public class MessageService {

    @Autowired
    @Qualifier("chineseMessageRepo")
    private MessageRepo repo;

    public String getMessage() {
        return repo.getMessage();
    }

}
