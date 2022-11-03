package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Category;
import edu.miu.springConnData.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategorys() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long Id) {
        return categoryRepository.findById(Id).get();
    }

    @Override
    public void deleteCategory(Long Id) {
        categoryRepository.deleteById(Id);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}
