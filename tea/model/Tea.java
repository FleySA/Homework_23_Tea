package com.telran.org.tea.model;

import java.util.UUID;

public class Tea {

    private String id;
    private String name;

    public Tea() {
        this.id = UUID.randomUUID().toString();
    }

    public Tea(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
