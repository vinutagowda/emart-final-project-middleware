
package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.model.Category;
import com.cts.emart.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public void addCategory(Category category) {
		repo.save(category);
		
	}

	public void deleteCategory(Long categoryId) {
		repo.deleteById(categoryId);
		
	}

	public List<Category> getAllCategories() {
		return (List<Category>) repo.findAll();
	}

	public Optional<Category> getCategoryById(Long categoryId) {
		return repo.findById(categoryId);
	}

	public void updateCategory(Category category) {
		repo.save(category);
		
	}

}
