package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.klef.jfsd.exam.service.ProductService;

public class ClientController {
	 @Autowired
	  private ProductService service;
	 
	 @GetMapping("viewallproducts")
	  public List<Object> demo1()
	  {
	    
	    return service.viewallproducts();
	  }

	
}
