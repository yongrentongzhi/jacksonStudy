package com.yongren.objectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObjectMapperTest {
    @Autowired
    ObjectMapper objectMapper;

    String jsonString = "{\\\"name\\\":\\\"BeJson\\\",\\\"url\\\":\\\"http://www.bejson.com\\\",\\\"page\\\":88,\\\"isNonProfit\\\":true,\\\"address\\\":{\\\"street\\\":\\\"科技园路.\\\",\\\"city\\\":\\\"江苏苏州\\\",\\\"country\\\":\\\"中国\\\"},\\\"links\\\":[{\\\"name\\\":\\\"Google\\\",\\\"url\\\":\\\"http://www.google.com\\\"},{\\\"name\\\":\\\"Baidu\\\",\\\"url\\\":\\\"http://www.baidu.com\\\"},{\\\"name\\\":\\\"SoSo\\\",\\\"url\\\":\\\"http://www.SoSo.com\\\"}]}";

    @Test
    public void readValueTest() {

    }


}
