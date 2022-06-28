package com.example.integrador.service.users;

import com.example.integrador.controllers.user.UserDto;
import com.example.integrador.model.User;


public interface IUserService {

    User save(UserDto user);

    User findByEmail(String email);
}
