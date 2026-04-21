package com.Practise.BootToJPA.Services;

import com.Practise.BootToJPA.entities.User;
import com.Practise.BootToJPA.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    //To create a new user
    public User saveUser(User user){

            return userRepository.save(user);

    }

    //to get a user
    public User getUser(int id){
        return userRepository.findById(id).orElse(null);
    }

    //to save multiple users
    public Iterable<User> saveUsers(Iterable<User> users){
        return userRepository.saveAll(users);
    }

    //to find user by id
    public User findUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Iterable<User> getUserByIds(Iterable<Integer> ids){
        return userRepository.findAllById(ids);
    }

    public Long count(){
        return userRepository.count();
    }

    public void deleteUserById(int id){
        if(userRepository.findById(id).isPresent()){
                userRepository.deleteById(id);
                System.out.println("Deleted User by" + id);
        }
        else{
            System.out.println("User not found");
        }
    }

    public void deleteByObject(User user){
        if(userRepository.findById(user.getId()).isPresent()){
            userRepository.delete(user);
        }
    }

    public void deleteAllUsersByIds(List<Integer> ids){
        List<User> users = (List<User>) userRepository.findAllById(ids);
        if(users.size() == ids.size()) {
            userRepository.deleteAllById(ids);
            System.out.println("All ids deleted");
        }
        else{
            System.out.println("All ids are not present");
        }
    }

    public void deleteUsersByObjects(List<User> users){
        List<Integer> ids = new ArrayList<>();
        users.forEach(user->ids.add(user.getId()));
        List<User> usersData =(List<User>) userRepository.findAllById(ids);
        if(ids.size() ==usersData.size()){
            userRepository.deleteAll(users);
            System.out.println("All deleted");
        }
        else System.out.println("All users not found");
    }

    public void deleteAllUsers(){
        if(userRepository.count()>0){

            userRepository.deleteAll();
            System.out.println("ALl users deleted");
        }
        else System.out.println("All users not deleted.");
    }







}
