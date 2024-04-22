package com.Hlee.osahaneat.controller;

import com.Hlee.osahaneat.entity.Users;
import com.Hlee.osahaneat.payload.ResponseData;
import com.Hlee.osahaneat.payload.request.SignupRequest;
import com.Hlee.osahaneat.repository.UserRepositoty;
import com.Hlee.osahaneat.dto.UserDTO;
import com.Hlee.osahaneat.service.LoginService;
import com.Hlee.osahaneat.service.impl.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/login")

public class LoginController {
    @Autowired
//            @Qualifier("tenBien")
    LoginServiceImp loginServiceImp;

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username , @RequestParam String password){
            ResponseData responseData = new ResponseData();
            if(loginServiceImp.checkLogin(username,password)){
                responseData.setData(true);
            }
            else {
                responseData.setData(false);
            }
            return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest signUpRequest){
        ResponseData responseData= new ResponseData();
        responseData.setData(loginServiceImp.addUser(signUpRequest));
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
