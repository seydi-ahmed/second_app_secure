package com.example.security.service;

import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.entity.Role;
import com.example.security.entity.User;
import com.example.security.reposiroty.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public Optional<User> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public User registerUser(User user){
        if (userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("l'email existe déja mon pote!!!!");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        if (user.getRole() == null){
            user.setRole(Role.ROLE_USER);
        }

        return userRepository.save(user);

    }
    
}
