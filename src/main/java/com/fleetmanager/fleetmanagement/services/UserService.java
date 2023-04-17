package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.User;
import com.fleetmanager.fleetmanagement.models.dto.UserDto;

public interface UserService {

    User createUser(UserDto userDto);
    User updateUserInfo(Long id, UserDto userDto);
    User getAUser(Long id);
    void deleteUser(Long id);

}
