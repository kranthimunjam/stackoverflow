package org.stackoverflow.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.stackoverflow.auth.dto.SignUpDTO;
import org.stackoverflow.userservice.UserRepository;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    public User signUp(SignUpDTO data) {
        if (repository.findByLogin(data.login()) != null) {
            throw new RuntimeException("Username already exists");
        }
        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
        User newUser = new User(data.login(), encryptedPassword, data.role());
        return repository.save(newUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
