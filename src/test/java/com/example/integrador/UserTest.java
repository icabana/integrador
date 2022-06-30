package com.example.integrador;

import com.example.integrador.controllers.user.UserDto;
import com.example.integrador.model.User;
import com.example.integrador.repository.IUserRepository;
import com.example.integrador.service.users.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

class UserTest {
    @Test
    public void get_user_when_call_find_all(){

        UserServiceImpl userServiceImpl;
        // Arrange
        IUserRepository iUserRepository = Mockito.mock(IUserRepository.class);
        userServiceImpl = new UserServiceImpl(iUserRepository);

        // Act
        userServiceImpl.findAllUser();

        // Assert
        verify(iUserRepository).findAll();

    }
    @Test
    public void get_user_x_id_when_call_find_id(){

        UserServiceImpl userServiceImpl;
        // Arrange
        IUserRepository iUserRepository = Mockito.mock(IUserRepository.class);
        userServiceImpl = new UserServiceImpl(iUserRepository);

        // Act
        userServiceImpl.findByIdUser("1");

        // Assert
        verify(iUserRepository).findById("1");

    }

    @Test
    public void delete_user_when_call_delete(){
        UserServiceImpl userServiceImpl;
        // Arrange
        IUserRepository iUserRepository = Mockito.mock(IUserRepository.class);
        userServiceImpl = new UserServiceImpl(iUserRepository);

        // Act
        userServiceImpl.findByIdUser("1");

        // Assert
        verify(iUserRepository).findById("1");


    }
}