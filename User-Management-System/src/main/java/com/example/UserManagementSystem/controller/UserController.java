package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.UserModel;
import com.example.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value="/addUser")
    public String addUser(@RequestBody UserModel user){

        return userService.postUser(user);
    }

    @GetMapping(value="/getAllUser")
    public List<UserModel> getAllUser(){

        return userService.getAll();
    }

    @GetMapping(value="getUser/{id}")
    public UserModel getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

    @DeleteMapping(value="/deleteUser/{id}")
    public String deleteUser(@PathVariable String id){
       return userService.delete(id);
    }

    @PutMapping(value="/updateUserInfo")
    public String updateUser(@RequestParam String id, @RequestParam String address){
        return userService.update(id,address);
    }

}
