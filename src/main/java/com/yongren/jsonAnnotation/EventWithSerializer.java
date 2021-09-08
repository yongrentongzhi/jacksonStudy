package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventWithSerializer {
    public String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date eventDate;

    public EventWithSerializer(String name, Date eventDate) {
        this.name = name;
        this.eventDate = eventDate;
    }
}
 class CustomDateSerializer extends StdSerializer<Date> {

    private static SimpleDateFormat formatter
            = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    public CustomDateSerializer() {
        this(null);
    }

    public CustomDateSerializer(Class<Date> t) {
        super(t);
    }

    @Override
    public void serialize(
            Date value, JsonGenerator gen, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        gen.writeString(formatter.format(value));
    }
}