package com.segovelo.jackson.annotation.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class MyBean {
    public int id;
    private String name;

    public MyBean() {};
    public MyBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@JsonProperty("name")
    public void setTheName(String name) {
        this.name = name;
    }

   @JsonProperty("name")
    public String getTheName() {
        return name;
    }
    
}