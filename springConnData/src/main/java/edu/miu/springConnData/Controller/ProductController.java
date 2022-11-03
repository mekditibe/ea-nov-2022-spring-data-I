package edu.miu.springConnData.Controller;

import edu.miu.springConnData.Entity.Category;
import edu.miu.springConnData.Entity.Product;
import edu.miu.springConnData.Service.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductImpl productImpl;

    @GetMapping
    public List<Product> getAllProduct(){
        return productImpl.getProducts();
    }
    @GetMapping("/{Id}")
    public Product getProduct(@PathVariable Long Id){
        return productImpl.getProduct(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteProduct(@PathVariable Long Id){
        productImpl.deleteProduct(Id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productImpl.saveProduct(product);
    }
}
