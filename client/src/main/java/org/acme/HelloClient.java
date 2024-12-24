package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloClient{

    public String getHello(){
        String hello = CommonUtil.reverseString("hello world");
        return hello;
    }
}
