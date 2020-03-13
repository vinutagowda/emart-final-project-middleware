package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Category;
import com.cts.emart.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("http://localhost:4200")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@RequestMapping("/all")
	List<Category> getAll() {
		return service.getAllCategories();
	}

	@RequestMapping("/{categoryId}")
	Optional<Category> getById(@PathVariable Long categoryId) {
		return service.getCategoryById(categoryId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/add")
	void addCategory(@RequestBody Category category) {
		service.addCategory(category);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{categoryId}")
	void deleteCategoryById(@PathVariable Long categoryId) {
		service.deleteCategory(categoryId);
	}

	@RequestMapping(method = RequestMethod.PUT)
	void updateCategory(@RequestBody Category category) {
		service.updateCategory(category);
	}
}
