package com.MockProject.demo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	public Category(String categoryName, String description) {
			super();
			this.categoryName = categoryName;
			this.description = description;
		}
	public Category() {
		super();
	}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	@Id
	private String categoryName;
	private String  description;

	}

