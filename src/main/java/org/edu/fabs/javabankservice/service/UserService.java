package org.edu.fabs.javabankservice.service;

import org.edu.fabs.javabankservice.domain.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(Long id);
    User create(User userToCreate);

}
