package com.stageapp.service;

import com.stageapp.dto.UserDto;
import com.stageapp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
