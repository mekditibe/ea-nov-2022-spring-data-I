package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.User;
import edu.miu.springConnData.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long Id) {
        return userRepository.findById(Id).get();
    }

    @Override
    public void deleteUser(Long Id) {
        userRepository.deleteById(Id);
    }

//    @Override
//    public void updateUserEmail(Long Id, String email) {
//        userRepository.findByIdAndUpdateEmail(Id,email);
//    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
