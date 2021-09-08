package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yongren.base.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JsonGetterTest  {
    @Test
    public void whenSerializingUsingJsonGetter_thenCorrect()
            throws JsonProcessingException {

        MyBean bean = new MyBean(1, "My bean");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
    }
}
