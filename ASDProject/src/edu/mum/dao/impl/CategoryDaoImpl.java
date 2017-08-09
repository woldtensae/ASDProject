package edu.mum.dao.impl;

import edu.mum.dao.CategoryDao;
import edu.mum.framework.domain.Category;


public class CategoryDaoImpl extends DaoImpl<Category> implements CategoryDao{

	public CategoryDaoImpl() {
		super(Category.class, Category.class.getSimpleName());
	}

}
