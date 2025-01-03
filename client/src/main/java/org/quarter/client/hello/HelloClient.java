package org.quarter.client.hello;

import jakarta.enterprise.context.ApplicationScoped;
import org.quarter.shared.CommonUtil;

import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class HelloClient {

    public String getHello() {
        String hello = CommonUtil.reverseString("hello world");
        Map map = new HashMap();
        map.put("1", "2");
        map.put("1", "2");
        map.put("1", "2");
        Map.ofEntries(Map.entry("2", String.valueOf("2")), Map.entry("3", String.valueOf("3")));

        return hello;
    }

}
