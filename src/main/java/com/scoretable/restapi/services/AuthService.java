package com.scoretable.restapi.services;

import com.scoretable.restapi.dto.SignUpDTO;
import com.scoretable.restapi.models.User;
import com.scoretable.restapi.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = repository.findByUsername(username);
        return user;
    }

    public UserDetails signUp(SignUpDTO data) throws SecurityException {
        if (repository.findByUsername(data.username()) != null) {
            throw new SecurityException("Invalid token");
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(data.username(), encryptedPassword, data.role());
        return repository.save(newUser);
    }
}
