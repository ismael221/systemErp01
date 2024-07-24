package com.ismael.systemErp01.services;

import com.ismael.systemErp01.entities.User;
import com.ismael.systemErp01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User newUser){
        User user = newUser;
        userRepository.save(user);
        return user ;
    }
}
