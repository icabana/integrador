package com.example.integrador.controllers.user;
import com.example.integrador.model.Book;
import com.example.integrador.model.User;
import com.example.integrador.service.users.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final IUserService userService;

    public UserController(@Autowired IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @PostMapping("/")
    public ResponseEntity<User> save(@RequestBody UserDto user) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.save(user));
    }

    @GetMapping("/{id}")
    public Optional<User> findByIdUser(@PathVariable String id){
        return userService.findByIdUser(id);
    }

    @GetMapping("/{email}")
    public ResponseEntity<User> getByEmail(@PathVariable String email){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findByEmail(email));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


}
