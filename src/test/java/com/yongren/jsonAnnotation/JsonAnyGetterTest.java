package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;


@SpringBootApplication
public class JsonAnyGetterTest {
    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect()
            throws JsonProcessingException {

        ExtendableBean bean = new ExtendableBean("My bean");
        Map<String, String> map = bean.getProperties();
        map.put("attr1", "val1");
        map.put("attr2", "val2");
        ObjectMapper objectMapper = new ObjectMapper();

        String result = objectMapper.writeValueAsString(bean);
        System.out.println(result);
    }

    @Test
    public void userTest() {
        User user = new User();
        user.setUsername("wkw");
        user.setPassword("123");
        Map<String, String> map = user.testGet();
        map.put("test1", "testOne");
        map.put("test2", "testTwo");
        ObjectMapper objectMapper = new ObjectMapper();
        String value = null;
        try {
            value = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(value);
    }
}
