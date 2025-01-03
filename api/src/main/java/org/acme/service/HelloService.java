package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.shared.CommonUtil;
import org.acme.client.hello.HelloClient;

@ApplicationScoped
public class HelloService {

    @Inject
    HelloClient client;

    public String hello() {
        if (client != null)
            client.getHello();
        String hello = CommonUtil.reverseString("hello world");
        return hello;
    }

}
