package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategorys();
    Category getCategory(Long Id);
    void deleteCategory(Long Id);
    void saveCategory(Category category);
}
