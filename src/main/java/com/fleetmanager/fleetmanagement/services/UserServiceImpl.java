package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.User;
import com.fleetmanager.fleetmanagement.models.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Override
    public User createUser(UserDto userDto) {
        return null;
    }

    @Override
    public User updateUserInfo(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public User getAUser(Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
