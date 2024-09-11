package com.example.Hospital.Management.Services;

import com.example.Hospital.Management.Model.User;
import com.example.Hospital.Management.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServices {
    @Autowired
    UserRepo uRepo;

    public void addUser(User user) {
        uRepo.save(user);
    }

    public List<User> getAllUsers() {
        return uRepo.findAll();
    }

    public User getUserByEmail(String email) {
        return uRepo.findByEmail(email);
    }
}
