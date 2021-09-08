package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private Integer age;
    private Map<String,String> map = new HashMap<>();
    @JsonAnyGetter
    public Map<String,String> testGet() {
        return map;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
