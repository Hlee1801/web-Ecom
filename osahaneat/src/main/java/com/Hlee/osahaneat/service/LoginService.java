package com.Hlee.osahaneat.service;

import com.Hlee.osahaneat.dto.UserDTO;
import com.Hlee.osahaneat.entity.Roles;
import com.Hlee.osahaneat.entity.Users;
import com.Hlee.osahaneat.payload.request.SignupRequest;
import com.Hlee.osahaneat.repository.UserRepositoty;
import com.Hlee.osahaneat.service.impl.LoginServiceImp;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
@Service
public class LoginService implements LoginServiceImp {
    @Autowired
    UserRepositoty userRepository;

    @Override
    public List<UserDTO> getAllUser() {
        List<Users> ListUser = userRepository.findAll();
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

    @Override
    public boolean checkLogin (String username, String password){
        List<Users> listUser = userRepository.findByUsernameAndPassword(username,password);

        return listUser.size() > 0;
    }

    @Override
    public boolean addUser(SignupRequest signupRequest){
        Roles roles = new Roles();
        roles.setId(signupRequest.getRoleid());

        Users users = new Users();
        users.setFullname(signupRequest.getFullname());
        users.setUsername(signupRequest.getEmail());
        users.setPassword(signupRequest.getPassword());
        users.setRoles(roles);
        try {
            userRepository.save(users);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}