package com.restApi.demo.service;

import com.restApi.demo.dto.UserDto;

import java.util.List;

public interface UserService {


    UserDto createUser(UserDto userDto);

    List<UserDto> getAllUsers();

    UserDto getUserById(Long id);

    void deleteUser(Long id);
}
