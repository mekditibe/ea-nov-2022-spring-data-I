package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Product;


import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProduct(Long Id);
    void deleteProduct(Long Id);
    void saveProduct(Product product);
}
