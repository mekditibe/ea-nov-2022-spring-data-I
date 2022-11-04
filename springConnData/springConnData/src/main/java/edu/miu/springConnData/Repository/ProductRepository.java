package edu.miu.springConnData.Repository;

import edu.miu.springConnData.Entity.Category;
import edu.miu.springConnData.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();

    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByCategoryAndPriceLessThan(Category category,Double price);
    List<Product> findByNameContaining(String keyword);

}
