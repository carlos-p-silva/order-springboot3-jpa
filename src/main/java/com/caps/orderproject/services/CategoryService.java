package com.caps.orderproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caps.orderproject.entities.Category;
import com.caps.orderproject.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		return optionalCategory.get();
	}
	
}
