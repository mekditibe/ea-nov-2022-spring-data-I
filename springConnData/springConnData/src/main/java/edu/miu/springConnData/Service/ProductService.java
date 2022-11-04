package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Category;
import edu.miu.springConnData.Entity.Product;


import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProduct(Long Id);
    void deleteProduct(Long Id);
    void saveProduct(Product product);
    void updateProduct(Product product);

    List<Product> findAllProductByPriceGreaterThan(Double price);
    List<Product> findAllProductByCategoryAndPriceLessThan(Category category, Double price);
    List<Product> findAllProductByNameContaining(String keyword);
}
