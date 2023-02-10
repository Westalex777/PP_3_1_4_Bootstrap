package com.pp_3_1_2_springboot.service.user;


import com.pp_3_1_2_springboot.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);

    public List<User> getAllUsers();

    public void deleteUser(User user);

    public void updateUser(User user);

    public User getUser(int id);
}
