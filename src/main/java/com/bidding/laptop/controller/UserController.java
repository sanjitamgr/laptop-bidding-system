package com.bidding.laptop.controller;

import com.bidding.laptop.model.Users;
import com.bidding.laptop.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "bidding/users")
public class UserController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Users> getAlluser() {
        return usersRepository.findAll();
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public List<Users> saveUser(@RequestBody Users users) {
        usersRepository.save(users);
        return null;
    }
}
