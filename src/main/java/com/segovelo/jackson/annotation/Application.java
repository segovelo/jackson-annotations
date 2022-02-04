package com.segovelo.jackson.annotation;


import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.segovelo.jackson.annotation.beans.MyBean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SpringApplication.run(Application.class, args);
					 
	    MyBean bean_1 = new MyBean(1, null);
	    MyBean bean_2 = new MyBean(2, "John");

	    String result_1 = new ObjectMapper()
	      .writeValueAsString(bean_1);
	    String result_2 = new ObjectMapper()
	  	      .writeValueAsString(bean_2);
    
	    assertTrue(result_1.contains("1"));
	    assertFalse(result_1.contains("Peter"));
		System.out.println("\n\t  My Bean_1 : " + result_1);

	    assertTrue(result_2.contains("2"));
	    assertTrue(result_2.contains("John"));
		System.out.println("\n\t  My Bean_2 : " + result_2);

			
	}

}
