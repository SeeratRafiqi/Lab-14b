package com.csc3402.lab.formlogin.UserService;

import com.csc3402.lab.formlogin.dto.UserDto;
import com.csc3402.lab.formlogin.model.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
}
