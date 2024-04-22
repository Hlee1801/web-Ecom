package com.Hlee.osahaneat.security;

import com.Hlee.osahaneat.entity.Users;
import com.Hlee.osahaneat.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;


public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    UserRepositoty userRepositoty;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepositoty.findByUsername(username);
//        System.out.println(username+" " + users.getPassword());
        if(username == null){
            throw new UsernameNotFoundException("User doesn't exit");
        }
        return new User(username, users.getPassword(),new ArrayList<>());

    }
}
