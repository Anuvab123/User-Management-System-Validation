package com.example.UserManagementSystem.reposetory;

import com.example.UserManagementSystem.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    List<UserModel> users=new ArrayList<>();
    public String post(UserModel user) {
        users.add(user);
        return "User is successfully added";
    }

    public List<UserModel> getUsers() {
        return users;
    }
}
