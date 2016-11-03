package com.nehatha.ekart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nehatha.ekart.model.Category;

@RestController
@RequestMapping("api/v1/")
public class CategoryController {

	
	@RequestMapping(value = "categories", method=RequestMethod.GET)
	public List<Category> list() {
		return CategoryStub.list();
	}
	
	
	@RequestMapping(value = "categories/{id}", method=RequestMethod.GET)
	public Category get(@PathVariable Long id) {
		return CategoryStub.get(id);
	}	
	
	@RequestMapping(value = "categories", method=RequestMethod.POST)
	public Category create(@RequestBody Category category) {
		return CategoryStub.create(category);
	}
	
	@RequestMapping(value = "categories/{id}", method=RequestMethod.PUT)
	public Category update(@PathVariable Long id, @RequestBody Category category) {
		return CategoryStub.update(id, category);
	}	
	
	
	@RequestMapping(value = "categories/{id}", method=RequestMethod.DELETE)
	public Category delete(@PathVariable Long id) {
		return CategoryStub.delete(id);
	}	
	
}
