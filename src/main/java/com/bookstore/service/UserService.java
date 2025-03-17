package com.bookstore.service;

import com.bookstore.model.Users;

import java.util.List;

public interface UserService {

    public String upsert(Users users);

    public Users getById(int user_id);

    public List<Users> getAllUsers();

    public String deleteById(int user_id);
}
