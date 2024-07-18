package org.stackoverflow.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stackoverflow.user.dto.SignUpDTO;
import org.stackoverflow.userservice.UserRepository;

@Service
public class AuthService {

    @Autowired
    UserRepository repository;

    public User signUp(SignUpDTO data) {
        if (repository.findByLogin(data.login()) != null) {
            throw new RuntimeException("Username already exists");
        }
        // String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(data.login(), data.password(), data.role());
        return repository.save(newUser);
    }
}
