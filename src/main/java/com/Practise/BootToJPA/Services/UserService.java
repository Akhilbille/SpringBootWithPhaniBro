package com.Practise.BootToJPA.Services;

import com.Practise.BootToJPA.entities.User;
import com.Practise.BootToJPA.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
