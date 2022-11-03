package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Product;
import edu.miu.springConnData.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements  ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long Id) {
        return productRepository.findById(Id).get();
    }

    @Override
    public void deleteProduct(Long Id) {
        productRepository.deleteById(Id);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
}
