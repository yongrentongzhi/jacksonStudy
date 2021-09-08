package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBean {


  private String name;
   protected Map<String, String> properties = new HashMap<>();

    public ExtendableBean(String name) {
        this.name = name;
    }

//    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}