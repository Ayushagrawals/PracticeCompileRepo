package com.MockProject.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MockProject.demo.Model.Category;
import com.MockProject.demo.services.CategoryService;

@RestController
@RequestMapping("/category")
public class WebControl {
	 @Autowired
	  CategoryService categoryservice;
	@RequestMapping(value="/create",method = {RequestMethod.POST})
	public void CategoryControl(@RequestBody Category c)
	{
	categoryservice.createCategory(c);
	}
}
