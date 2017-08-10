package edu.mum.framework.service;

import java.util.List;

import edu.mum.framework.domain.ACategory;
import edu.mum.framework.domain.AProduct;

public interface CategoryService<T> {
	public void saveCategory(T category);
	public void deleteCategory(T category);
	public void updateCategor(ACategory category);
	public <T> ACategory findOneCategory(String id);
	public T findCategoryByName(String categoryName);
	public List<T> findAllCategory();

}
