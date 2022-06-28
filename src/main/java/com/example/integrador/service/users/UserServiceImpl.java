package com.example.integrador.service.users;
import com.example.integrador.controllers.user.UserDto;
import com.example.integrador.exception.UserNotFoundException;
import com.example.integrador.model.User;
import com.example.integrador.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements  IUserService{
    @Autowired
    private IUserRepository userRepository;

    @Override
    public User save(UserDto user) {
        return userRepository.save(new User(user));
    }

    @Override
    public User findByEmail(String email) throws UserNotFoundException {

        if(!email.equals("")){
            Optional<User> user = userRepository.findFirstByEmail(email);
            if (user.isPresent()){
                return user.get();
            }else {
                throw new UserNotFoundException();

            }
        }
        throw new UserNotFoundException();
    }
}
