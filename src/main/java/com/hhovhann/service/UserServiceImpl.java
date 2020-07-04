package com.hhovhann.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class UserServiceImpl implements UserService {
    @Override
    public List<String> allUsers() {
        return List.of("User1", "User2", "User3", "User4", "User5");
    }

    @Override
    public void addUser() {

    }

    @Override
    public String updateUser(Long id) {
        return "User 1";
    }

    @Override
    public void deleteUser(Long id) {

    }
}
