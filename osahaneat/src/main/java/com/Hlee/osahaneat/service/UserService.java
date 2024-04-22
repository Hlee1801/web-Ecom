package com.Hlee.osahaneat.service;

import com.Hlee.osahaneat.dto.UserDTO;
import com.Hlee.osahaneat.entity.Users;
import com.Hlee.osahaneat.repository.UserRepositoty;
import com.Hlee.osahaneat.service.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceImp {
    @Autowired
    UserRepositoty userRepositoty;

    @Override
    public List<UserDTO> getAllUser() {
        List<Users> ListUser = userRepositoty.findAll();
        List<UserDTO> userDTOlist = new ArrayList<>();

        for (Users users : ListUser){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(users.getId());
            userDTO.setUsername(users.getUsername());
            userDTO.setFullname(users.getFullname());
            userDTO.setPassword(userDTO.getPassword());

            userDTOlist.add(userDTO);
        }

        return userDTOlist;
    }



}
