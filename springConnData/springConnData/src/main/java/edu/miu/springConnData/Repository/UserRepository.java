package edu.miu.springConnData.Repository;

import edu.miu.springConnData.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findAll();
    //@Query("update User u set u.email = ?2 where u.Id=?1")
    //void findByIdAndUpdateEmail(Long Id, String email);

}
