package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.annotation.JsonGetter;

public class MyBean {
    public int id;
    private String name ;

    @JsonGetter("name")
    public String getTheName() {
        return name;
    }



    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
