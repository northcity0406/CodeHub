package com.northcity.cache.service;


import com.northcity.cache.entity.User;

public interface UserService {


    public User getUser(Integer id);

    public void deleteUser(Integer id);


    public User updateUser(User updateUser);
}