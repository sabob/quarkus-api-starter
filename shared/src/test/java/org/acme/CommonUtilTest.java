package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CommonUtilTest {

    @Test
    public void testHello() {
        String response = CommonUtil.reverseString("hello world");
        Assertions.assertTrue(response.length() > 0);
    }

}
