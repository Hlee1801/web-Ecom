package com.Hlee.osahaneat.controller;

import com.Hlee.osahaneat.entity.Users;
import com.Hlee.osahaneat.repository.UserInterface;
import com.Hlee.osahaneat.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/login")

public class LoginController {
    @Autowired
//            @Qualifier("tenBien")
    UserInterface userInterface;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(){
            List<Users> ListUser = userInterface.findAll();
            List<UserDTO> UserDTOList = new ArrayList<>();

            for(Users users : ListUser){
                UserDTO userDTO = new UserDTO();
                userDTO.setId(users.getId());
                userDTO.setUsername(users.getUsername());
                userDTO.setFullname(users.getFullname());
                userDTO.setPassword(users.getPassword());

                UserDTOList.add(userDTO);

            }

            return  new ResponseEntity<>(UserDTOList, HttpStatus.OK);
    }
}
