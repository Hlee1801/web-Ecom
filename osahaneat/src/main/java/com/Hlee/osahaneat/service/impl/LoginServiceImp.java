package com.Hlee.osahaneat.service.impl;

import com.Hlee.osahaneat.dto.UserDTO;
import com.Hlee.osahaneat.payload.request.SignupRequest;

import java.util.List;

public interface LoginServiceImp {
    List<UserDTO> getAllUser();
    boolean checkLogin(String username, String password);
    boolean addUser(SignupRequest signupRequest);
}
