package org.edu.fabs.javabankservice.service.impl;

import lombok.AllArgsConstructor;
import org.edu.fabs.javabankservice.domain.model.User;
import org.edu.fabs.javabankservice.domain.repository.UserRepository;
import org.edu.fabs.javabankservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("this account number already exists");
        }
        return this.userRepository.save(userToCreate);
    }

}
