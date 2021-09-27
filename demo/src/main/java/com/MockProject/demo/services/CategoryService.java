package com.MockProject.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MockProject.demo.Model.Category;
import com.MockProject.demo.Repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepo;
public void CreateService(Category category)
{
	
}

public void createCategory(Category c) {
	// TODO Auto-generated method stub
	categoryRepo.save(c);
	
}
public void deleteCategory(Category c)
{
	categoryRepo.delete(c);
}
public void deleteByCategory(String s) {
	categoryRepo.deleteById(s);
}
}
