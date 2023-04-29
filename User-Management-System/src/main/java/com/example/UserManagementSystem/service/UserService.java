package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.UserModel;
import com.example.UserManagementSystem.reposetory.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public String postUser(UserModel user) {
        return userDao.post(user);
    }

    public List<UserModel> getAll() {
        return userDao.getUsers();
    }


    public UserModel getUserById(String id) {
        List<UserModel> users=userDao.getUsers();
        for(UserModel user:users){
            if(user.getUserId()==Integer.parseInt(id)){
                return user;
            }
        }
        return null;
    }

    public String delete(String id) {
        List<UserModel> users=userDao.getUsers();
        for(UserModel user:users){
            if(user.getUserId()==Integer.parseInt(id)){
                users.remove(user);
                return "delete successfully";
            }
        }
        return "id does not exist";
    }

    public String update(String id, String email) {
        List<UserModel> users=userDao.getUsers();
        for(UserModel user:users){
            if(user.getUserId()==Integer.parseInt(id)){
                users.remove(user);
                user.setEmail(email);
                users.add(user);
                return "updated successfully";
            }
        }
        return "id does not exist";
    }
}
