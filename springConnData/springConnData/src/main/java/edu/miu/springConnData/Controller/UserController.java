package edu.miu.springConnData.Controller;

import edu.miu.springConnData.Entity.Review;
import edu.miu.springConnData.Entity.User;
import edu.miu.springConnData.Service.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserImpl userImpl;

    @GetMapping
    public List<User> getAllUser(){
        return userImpl.getUsers();
    }
    @GetMapping("/{Id}")
    public User getUser(@PathVariable Long Id){
        return userImpl.getUser(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteUser(@PathVariable Long Id){
        userImpl.deleteUser(Id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userImpl.saveUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userImpl.updateUser(user);
    }

}
