package edu.miu.springConnData.Repository;

import edu.miu.springConnData.Entity.Product;
import edu.miu.springConnData.Entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findAll();
    //List<Review> findByProductId(Long Id);
    List<Review> findAllByProduct(Product product);

}
