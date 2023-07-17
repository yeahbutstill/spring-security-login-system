package com.unkownkoder.services;

import com.unkownkoder.entity.ApplicationUser;
import com.unkownkoder.model.LoginResponseDTO;

public interface AuthenticationService {
    ApplicationUser registerUser(String username, String password);
    LoginResponseDTO loginUser(String username, String password);
}
