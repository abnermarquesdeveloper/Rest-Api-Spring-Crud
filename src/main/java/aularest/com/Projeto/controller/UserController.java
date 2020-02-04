package aularest.com.Projeto.controller;


import aularest.com.Projeto.repository.UserRepository;
import aularest.com.Projeto.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }


    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
