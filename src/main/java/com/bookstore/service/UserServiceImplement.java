package com.bookstore.service;

import com.bookstore.model.Users;
import com.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String upsert(Users users) {
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        userRepo.save(users);
        return "Success";
    }

    @Override
    public Users getById(int user_id) {
        Optional<Users> findById = userRepo.findById(user_id);
        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public String deleteById(int user_id) {
        if(userRepo.existsById(user_id)){
            userRepo.deleteById(user_id);
            return "Deleted";
        }else{
            return "No Record Found";
        }
    }

}
