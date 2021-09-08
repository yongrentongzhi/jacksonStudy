package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class AnnotionTest {

    @Test
    void whenSerializingUsingJsonPropertyOrder_thenCorrect() throws JsonProcessingException {
        MyBean2 bean = new MyBean2(1, "My bean");
        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
    }

    @Test
    public void whenSerializingUsingJsonRawValue_thenCorrect()
            throws JsonProcessingException {

        RawBean bean = new RawBean("My bean", "{\"attr\":false}");

        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println("{\"attr\":false}");
        System.out.println(result);
    }

    @Test
    public void whenSerializingUsingJsonValue_thenCorrect()
            throws JsonParseException, IOException {

        String enumAsString = new ObjectMapper()
                .writeValueAsString(TypeEnumWithValue.enumInstanceName);

        System.out.println(enumAsString);
    }

    @Test
    public void whenSerializingUsingJsonRootName_thenCorrect()
            throws JsonProcessingException {

        UserWithRoot user = new UserWithRoot(1, "John");

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(user);
        System.out.println(result);
    }

    @Test
    public void whenSerializingUsingJsonSerialize_thenCorrect()
            throws JsonProcessingException, ParseException {

        SimpleDateFormat df
                = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        EventWithSerializer event = new EventWithSerializer("party", date);

        String result = new ObjectMapper().writeValueAsString(event);
        System.out.println(result);
    }
}