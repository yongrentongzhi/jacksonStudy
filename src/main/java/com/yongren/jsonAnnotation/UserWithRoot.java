package com.yongren.jsonAnnotation;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "yongren")
public class UserWithRoot {
    public int id;
    public String name;

    public UserWithRoot(int id, String name) {
        this.id = id;
        this.name = name;
    }
}