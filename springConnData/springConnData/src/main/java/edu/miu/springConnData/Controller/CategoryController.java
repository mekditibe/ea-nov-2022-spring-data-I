package edu.miu.springConnData.Controller;

import edu.miu.springConnData.Entity.Address;
import edu.miu.springConnData.Entity.Category;
import edu.miu.springConnData.Service.CategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/categories")
@RestController
public class CategoryController {

    @Autowired
    private CategoryImpl categoryImpl;

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryImpl.getCategorys();
    }
    @GetMapping("/{Id}")
    public Category getCategory(@PathVariable Long Id){
        return categoryImpl.getCategory(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteCategory(@PathVariable Long Id){
        categoryImpl.deleteCategory(Id);
    }

    @PostMapping
    public void addCategory(@RequestBody Category category){
        categoryImpl.saveCategory(category);
    }
    @PutMapping
    public void updateCategory(@RequestBody Category category){
        categoryImpl.updateCategory(category);
    }
}
