package com.rewindo.LeafyAllies.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> allUsers() { return userRepository.findAll(); }

    public User createUser(String first_name, String last_name, String email, String password){
        User user = new User(first_name, last_name, email, password);
        userRepository.insert(user);
        return user;
    }
}
