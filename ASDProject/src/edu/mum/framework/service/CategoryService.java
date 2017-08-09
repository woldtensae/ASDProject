package edu.mum.framework.service;

import java.util.List;

import edu.mum.framework.domain.Category;
import edu.mum.framework.domain.Product;

public interface CategoryService {
	public void saveCategory(Category category);
	public void deletCategory(Category category);
	public void updateCategor(Category category);
	public Product findOneCategory(String id);
	public Product findCategoryByName(String categoryName);
	public List<Category> findAllCategory();

}
