package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.CommonUtil;

@ApplicationScoped
public class HelloService {

    public String hello() {
        String hello = CommonUtil.reverseString("hello world");
        return hello;
    }

}
