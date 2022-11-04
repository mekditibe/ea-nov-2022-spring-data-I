package edu.miu.springConnData.Repository;

import edu.miu.springConnData.Entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAll();

}
