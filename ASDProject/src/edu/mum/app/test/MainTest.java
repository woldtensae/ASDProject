package edu.mum.app.test;

import edu.mum.framework.domain.Category;
import edu.mum.framework.service.CategoryService;
import edu.mum.framework.service.factory.ServiceFactory;

public class MainTest {

	public static void main(String[] args) {
		CategoryService categoryService=ServiceFactory.createCategoryService();
		categoryService.saveCategory(new Category("Cat001","Category1"));
		
	}

}
