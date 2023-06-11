package com.sprincrud.springcrudoperation.service;

import java.util.List;

import com.sprincrud.springcrudoperation.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long usersId);

}
