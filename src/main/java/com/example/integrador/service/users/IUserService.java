package com.example.integrador.service.users;

import com.example.integrador.controllers.user.UserDto;
import com.example.integrador.model.User;

import java.util.List;
import java.util.Optional;


public interface IUserService {

    List<User> findAllUser();

    User save(UserDto user);

    User findByEmail(String email);

    Optional<User> findByIdUser(String id);

    void deleteUser(String id);

    User updateUser(User user);

}
