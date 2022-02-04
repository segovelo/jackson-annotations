package com.segovelo.jackson.annotation.controller;



import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.segovelo.jackson.annotation.beans.MyBean;

public class Controller {
	
	public void whenUsingJsonProperty_thenCorrect()
	  throws IOException {
	    MyBean bean = new MyBean(1, "My bean");

	    String result = new ObjectMapper().writeValueAsString(bean);
	    
	   System.out.println("String result : " + result);

	    MyBean resultBean = new ObjectMapper()
	      .readerFor(MyBean.class)
	      .readValue(result);
	    System.out.println("My bean : "+ resultBean.getTheName());
	}

}
