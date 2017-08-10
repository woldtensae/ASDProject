package edu.mum.framework.service.impl;

import java.util.List;

import edu.mum.framework.dao.CategoryDao;
import edu.mum.framework.domain.ACategory;
import edu.mum.framework.domain.concrete.Category;
import edu.mum.framework.service.CategoryService;

public class  CategoryServiceImpl<T> implements CategoryService<T> {
    private CategoryDao  categoryDao;
     
    public CategoryServiceImpl(CategoryDao  categoryDao){
    	this.categoryDao=categoryDao;
    }
    
	@Override
	public void saveCategory(T category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(T category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategor(ACategory category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> ACategory findOneCategory(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findCategoryByName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	
 
}
