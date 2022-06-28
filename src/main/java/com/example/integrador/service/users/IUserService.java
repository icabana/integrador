package com.example.integrador.service.users;

import com.example.integrador.controllers.user.UserDto;
import com.example.integrador.model.User;

import java.util.List;


public interface IUserService {

    List<User> findAllBook();

    User save(UserDto user);

    User findByEmail(String email);

    void deleteBook(String id);

    User updateBook(User user);

}
