package org.quarter.quarter;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.quarter.shared.CommonUtil;
import org.quarter.client.hello.HelloClient;

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
