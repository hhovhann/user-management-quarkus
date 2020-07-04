package com.hhovhann.service;

import java.util.List;

public interface UserService {
    List<String> allUsers();

    void addUser();

    String updateUser(Long id);

    void deleteUser(Long id);
}
