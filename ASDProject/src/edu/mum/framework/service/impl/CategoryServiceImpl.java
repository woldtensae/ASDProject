package edu.mum.framework.service.impl;

import java.util.List;

import edu.mum.dao.CategoryDao;
import edu.mum.framework.domain.Category;
import edu.mum.framework.domain.Product;
import edu.mum.framework.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao  categoryDao;
	
    public CategoryServiceImpl(CategoryDao categoryDao)
    {
    	this.categoryDao=categoryDao;
    }
    @Override
	public void saveCategory(Category category) {
    	categoryDao.add(category);
		
	}

	@Override
	public void deletCategory(Category category) {
		categoryDao.remove(category);
		
	}

	@Override
	public void updateCategor(Category category) {
		//categoryDao.update(category);
		
	}

	@Override
	public Product findOneCategory(String id) {
		//categoryDao.findOne(id);
		return null;
	}

	@Override
	public Product findCategoryByName(String categoryName) {
		//categoryDao.findCategoryByName(categoryName);
		return null;
	}

	@Override
	public List<Category> findAllCategory() {
		categoryDao.findAll();
		return null;
	}

}
