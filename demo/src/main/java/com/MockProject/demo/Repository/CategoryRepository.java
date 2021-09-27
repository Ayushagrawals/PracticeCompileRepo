package com.MockProject.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MockProject.demo.Model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,String>{

}
