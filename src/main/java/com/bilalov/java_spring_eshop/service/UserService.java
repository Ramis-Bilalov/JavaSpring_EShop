package com.bilalov.java_spring_eshop.service;

import com.bilalov.java_spring_eshop.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {  //security
    boolean save(UserDTO userDTO);
}
