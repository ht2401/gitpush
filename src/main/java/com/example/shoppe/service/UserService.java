package com.example.shoppe.service;

import com.example.shoppe.model.entity.User;
import com.example.shoppe.model.request.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.shoppe.repository.UserRepository;

import java.time.LocalDate;

@Service
@Slf4j
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User create(UserRequest userRequest) {
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setCreatedAt(LocalDate.now());
        user.setUpdatedAt(LocalDate.now());
        userRepository.save(user);
        return user;
    }
}
