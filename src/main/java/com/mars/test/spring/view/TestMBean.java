package com.mars.test.spring.view;

import com.mars.test.spring.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by Mars on 2015/3/30.
 */
@Slf4j
@Component
@ManagedBean
@RequestScoped
public class TestMBean {

    private String message = "default message";

    @Autowired
    private MessageService service;


    public String getMessage() {
        if (service != null) {
            message = service.getMessage();
        }
        return message;
    }
}
